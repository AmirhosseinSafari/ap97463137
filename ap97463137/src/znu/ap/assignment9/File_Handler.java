package assignment9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handler {

    private static File file =  new File("students.txt");
    public static void writeToFile(String line) throws IOException {

        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write(line);
        fileWriter.write("\n");
        fileWriter.close();
    }
}
