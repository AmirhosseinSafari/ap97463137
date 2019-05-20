package assignment8;

import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception, Graduate_student.WrongGraduteYear, Student_studying.WrongNumberofCourses {
        boolean stoper = true;
        while (stoper) {
            System.out.println("Choose your option:\n1.Adding Student\t2.Show Report");
            int userInput = getUserIntOptionInput();

            if (userInput == 1) {

                System.out.println("How many Graduated students you want to add?");
                userInput = getUserIntOptionInput();
                for (int counter = 0; counter < userInput; counter++) {
                    GraduatedStudent();
                }

                System.out.println("How many Studying students you want to add?");
                userInput = getUserIntOptionInput();
                for (int counter = 0; counter < userInput; counter++) {
                    StudyingStudent();
                }

                System.out.println("Done!");
            }

            if (userInput == 2) {
                ListOfStudents();
            }

            System.out.println("Do you want to add or see the list again?(Y/N)");
            String userAnswer = getUserStringInput();
            if(userAnswer.equals("N")) stoper = false;
        }
    }


    public static int getUserIntOptionInput(){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        return userInput;
    }

    public static String getUserStringInput(){
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        return userInput;
    }


    public static void GraduatedStudent() throws IOException, Graduate_student.WrongGraduteYear {
        Graduate_student G_student = new Graduate_student();

        System.out.print("First name:");
        G_student.setFname(getUserStringInput());

        System.out.print("Last name:");
        G_student.setlname(getUserStringInput());

        System.out.print("ID:");
        G_student.setId(getUserIntOptionInput());

        System.out.print("Year of Graduation:");
        G_student.setYear_of_graduation(getUserIntOptionInput());

        File_reader file = new File_reader();
        file.writeToFile(G_student);


    }

    public static void StudyingStudent() throws IOException {
        try {
            Student_studying S_student = new Student_studying();

            System.out.print("First name:");
            S_student.setFname(getUserStringInput());

            System.out.print("Last name:");
            S_student.setlname(getUserStringInput());

            System.out.print("ID:");
            S_student.setId(getUserIntOptionInput());

            System.out.print("Passed courses:");
            S_student.setStudied_courses(getUserIntOptionInput());

            File_reader file = new File_reader();
            file.writeToFile(S_student);
        }

        catch (Student_studying.WrongNumberofCourses wrongNumberofCourses) {
            wrongNumberofCourses.printStackTrace();
        }
    }

    public static void ListOfStudents() throws Exception, Graduate_student.WrongGraduteYear, Student_studying.WrongNumberofCourses {
        File_reader file = new File_reader();
        for( int  counter= 0 ; counter < file.readFromFile().size() ; counter++ ) {
            System.out.println(file.readFromFile().get(counter));
        }
    }
}
