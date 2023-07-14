

package com.mycompany.question3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 
{

    public static void main(String[] args)
    {
        try
        {
            File f=new File("\"D:\\Practical 6\"");
            Scanner sc=new Scanner(f);
            
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
        }
       catch(FileNotFoundException e){
           System.out.println("File Not Found");
       }    
    }
}
