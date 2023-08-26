// 4. Write a program in Java to copy the content of a given file to another user
// entered file using character stream.

import java.io.*;  
import java.util.*;  

public class q4_Filecopy
{  
    public static void copyData(File file1, File file2) throws Exception  
    {  
        FileInputStream ip = new FileInputStream(file1);  
        FileOutputStream out = new FileOutputStream(file2);  
        try 
        {  
            int i;  
            while ((i = ip.read()) != -1) 
            {  
                out.write(i);  
            }  
        }  
        catch(Exception e) 
        {  
            System.out.println("Error Found: "+e.getMessage());  
        }    
        finally 
        {  
            if (ip != null) 
            {  
                ip.close();  
            }    
            if (out != null) {  
                out.close();  
            }  
        }  
        System.out.println("File Copied");  
    }  
    // main() method start  
    public static void main(String[] args) throws Exception  
    {  
    //     Scanner sc = new Scanner(System.in);  
    //     System.out.println("Enter the name of the file from where the data would be copied :");  
    //     String file1 = sc.nextLine();  
    //     // create instance of the File class for the source file   
    //     File a = new File("C:\\Users\\KIIT\\Desktop\\"+file1);  
  
    //     // get the file in which the data would be written.  
    //     System.out.println("Enter the name of the file from where the data would be written :");  
    //     String file2 = sc.nextLine();  
    //     // create instance of the File class for the destination file  
    //     File b = new File("C:\\Users\\KIIT\\Desktop\\"+file2);  
    //     sc.close();  
    //     // method called to copy the data from file a to file b  
    //     copyData(a, b);  
    // } 
    int i=20+ +9- -12+ +4- -13+ +19;
    System.out.println(i);
    }

}