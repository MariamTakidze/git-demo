package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
//    public static void main(String[] args) {
//        String line;
//        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
//            while ((line = br.readLine()) != null) {
//                System.out.println("Line =>"+line);
//            }
//        } catch (IOException e) {
//            System.out.println("IOException in try block =>" + e.getMessage());
//        }
//    }

    public static void main(String[] args) {
        readFile("test.txt");
    }

    private static void readFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
