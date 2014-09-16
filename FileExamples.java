import java.io.*;
import javax.swing.*;

public class FileExamples
{



    public FileExamples()
    {
        String fName= "foo.txt";
        
        File file = new File(fName);
        boolean exists = file.exists();
        
        System.out.println("'"+fName + "' exists = " +exists);
        if( ! exists)
            {
                
                System.out.println( "'"+ file.getAbsolutePath()+ "' was the full path of  the file I couldn't find" );
             
            //would you like me to make it
        
               int selection = JOptionPane.showConfirmDialog(
                                null
                        ,  file.getPath() + " does not exist, should I create it ? " //text
                        , "File does not exist" //title
                        , JOptionPane.OK_CANCEL_OPTION 
                        , JOptionPane.INFORMATION_MESSAGE);
                        
                        
                if (selection == JOptionPane.OK_OPTION)
                {
                    // Code to use when OK is PRESSED.
                    System.out.println("Selected Option is OK : " + selection);
                    System.out.println("\t  I am going to make the file");
                     try{
                       
                         //you can see if file was correctly made using the followign boolean
                       boolean successfullyMadeFile = file.createNewFile();
                       
                    }
                     catch (IOException ioe) {
                       System.out.println("unable to create file, error: " + ioe); 
                    }
                }
                else if (selection == JOptionPane.CANCEL_OPTION)
                {
                    // Code to use when CANCEL is PRESSED.
                    System.out.println("Selected Option Is CANCEL : " + selection );
                    System.out.println("\t not going to make '" + file +"'");
                   
                    
                    }
        
        }
            
            
            
        System.out.println("'"+fName+"' exists = " +new File(fName).exists() );
    
    }
}

