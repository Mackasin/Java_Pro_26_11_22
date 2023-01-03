package com.hillel.dzhurynskyi.homework.hm8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class FileLogger {
    public static void main(String[] args) throws IOException {
        FileLoggerConfiguration fileLoggerConfiguration=new FileLoggerConfiguration();
        File file=new File(fileLoggerConfiguration.path,fileLoggerConfiguration.fileName+fileLoggerConfiguration.type);
        FileWriter file1=new FileWriter(file);

file1.write("["+fileLoggerConfiguration.date.format(DateTimeFormatter.ofPattern("HH:mm:ss"))+"]"+"["+LoggingLevel.INFO+"]"+" Massage:["+"massage"+"]");
file1.close();

    }

}
