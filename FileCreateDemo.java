package com.topics.coreJava;
import java.io.File;
import java.io.PrintWriter;

/** 
 * Represents the creation of file and writing of data into it.
 * @author mahavirsinh parmar
 * @version 1.8
 */
public class FileCreateDemo {

    public static void main(String[] args) {
        File file = new File("myTestFile.txt");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println("Henry Lee");
            writer.println("Vadodara");
            writer.println("Computer");
            writer.println("Cricket");
            writer.println(55);
            writer.close();
            System.out.println("Information is written into the file");
        } catch (Exception exception) {
            System.out.println("Exception is: " + exception);
        }
    }

}