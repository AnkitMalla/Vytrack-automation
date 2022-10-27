package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1 - create the object of Properties class
    // We need properties class to use methods coming from class like load(), getProperty("Key")
    private static Properties properties = new Properties();

    // we want to open the properties file and load to properties object ONLY ONCE before reading
    // having static block because static runs first
    static{
        try {
        //2 - Create the object of FileInputStream
        //We need this object to open file as a stream in Java memory

            FileInputStream file = new FileInputStream("config.properties");

        // 3- Load the properties object using FileInputStream object
        //Load "properties" object with the "file" we opened using FileInputStream

            properties.load(file);

        //close the file after loading
        // if you do not close the file, it will take space from computer memory like Scanner

            file.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
