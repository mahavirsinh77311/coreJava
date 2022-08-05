package com.topics.coreJava;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/** 
 * Represents the file reading.
 * @author mahavirsinh parmar
 * @version 1.8
 */
public class FileReadingDemo {

    public static void main(String[] args) throws Exception {
        try {
            InputStream fileReader = new FileInputStream("myTestFile.txt");
            Reader reader = new InputStreamReader(fileReader);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}