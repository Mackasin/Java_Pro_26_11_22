package com.hillel.dzhurynskyi.homework.hm8;

public interface Logger {
    void debug(String message) throws FileMaxSizeReachedException;
    void info(String message) throws FileMaxSizeReachedException;
}
