package hust.soict.dsai.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class NoGarbage {
    public static void main(String[] args) {
        try{
            String filename = "C:\\Users\\ADMIN\\OneDrive\\Documents\\OOP\\OtherProjects\\src\\hust\\soict\\dsai\\globalict\\garbage\\text.txt";
            byte[] inputBytes = { 0 };
            long startTime, endTime;

            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();

            // using StringBuilder
            StringBuilder outputStringBuilder = new StringBuilder();
            for (byte b : inputBytes) {
            outputStringBuilder.append((char) b);
            }
            endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
}
    