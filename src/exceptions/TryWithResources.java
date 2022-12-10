package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    private static final Logger LOGGER = LogManager.getLogger(TryWithResources.class);
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

//    public static void main(String[] args) {
//        readFile("test.txt");
//    }
//
//    private static void readFile(String filename) {
//        try {
//            FileReader reader = new FileReader(filename);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void main(String[] args) {
        String filepath = "C:\\Users\\m.takidze\\IdeaProjects\\OOP\\src\\exceptions\\test.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            LOGGER.info("File Content:");
            LOGGER.info((br.readLine()));
        }
        catch(IOException e ) {
           LOGGER.error(e.getMessage());
        }
        finally {
            LOGGER.info("Finally block");
        }
    }


}
