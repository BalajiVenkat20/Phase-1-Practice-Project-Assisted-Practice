package balaji.AssistedPractice;

import java.io.FileReader;  
public class FileReading {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("E:\\12Sample script");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    

