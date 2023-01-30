package com.hillel.dzhurynskyi.homework.hm8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger {
    private final FileLoggerConfiguration config;
   private LocalDateTime date = LocalDateTime.now();

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    public void debug(String message){
        checkSize();
        write(LoggingLevel.DEBUG, message, config.getPath());
        info(message);
    }

    public void info(String message) {
        checkSize();
        write(LoggingLevel.INFO, message, config.getPath());
    }

    private void checkSize() {
        File outputFile = new File(config.getPath());
                if (outputFile.length() >config.getMaxSize()) {
                        config.setPath("files/"+"Log_" + date.format(DateTimeFormatter.ofPattern("dd_LL_uuuu-HH_mm."))+"txt");
                    try {
                        throw  new FileMaxSizeReachedException(String.format("MaxSize: %d, CurrentSize: %d, File: %s",
                                config.getMaxSize(), outputFile.length(), outputFile.getPath()));
                    } catch (FileMaxSizeReachedException e) {
                        System.out.println(e);
                    }
                }
    }

    private void write(LoggingLevel level, String message, String path) {
        try(FileWriter fw = new FileWriter(path, true)) {
            fw.append("[")
                    .append(date.format(DateTimeFormatter.ofPattern("dd_LL_uuuu-HH_mm_ss")))
                    .append("]")
                    .append("[")
                    .append(level.toString())
                    .append("]")
                    .append("Message:")
                    .append(message)
                    .append("\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
