package balaji.AssistedPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
 
// Main class
public class FileWriting {
 
    // Main driver method
    public static void main(String[] args)
        throws IOException
    {
        // Assigning the content of the file
    	
        String text = "Welcome to My Company\nHappy Workers Day!";
 
        // Defining the file name 
        
        Path fileName = Path.of(
            "C:\\Users\\balaj");
 
        // Writing into the file
        Files.writeString(fileName, text);
 
        // Reading the content of the file
        String file_content = Files.readString(fileName);
 
        // Printing the content inside the file
        System.out.println(file_content);
    }
}