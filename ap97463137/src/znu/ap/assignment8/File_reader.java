package assignment8;

import java.io.*;
import java.util.ArrayList;

public class File_reader{

    private static File file =  new File("students.txt");
    public static void writeToFile(Student student) throws IOException{
        FileWriter fileWriter = new FileWriter(file,true);
        if(student instanceof Graduate_student){
            fileWriter.write(student.toString());
            fileWriter.write("\n");
        }else if(student instanceof Student_studying){
            fileWriter.write(student.toString());
            fileWriter.write("\n");
        }
        fileWriter.close();
    }

    public static ArrayList<Student> readFromFile() throws Exception, Student_studying.WrongNumberofCourses, Graduate_student.WrongGraduteYear {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
        ArrayList<Student> students = new ArrayList<>();
        while(line!=null){
            String[] info = line.split("\t");
            if(info[0].equals("Studentstudying")){
                Student_studying student = new Student_studying(info[1],info[2],Integer.valueOf(info[3]),Integer.valueOf(info[4]));
                students.add(student);
            }else{
                Graduate_student student = new Graduate_student(info[1],info[2],Integer.valueOf(info[3]),Integer.valueOf(info[4]));
                students.add(student);
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return students;
    }
}


