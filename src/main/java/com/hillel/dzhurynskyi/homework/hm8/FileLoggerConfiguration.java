package com.hillel.dzhurynskyi.homework.hm8;

public class FileLoggerConfiguration {
    private String path = "files/logs.txt";

    private LoggingLevel level = LoggingLevel.DEBUG;
    private String type;
    private int maxSize = 400;


    public int getMaxSize() {
        return maxSize;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public String getType() {
        return type;
    }
}
