package com.hillel.dzhurynskyi.homework.hm8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLoggerConfiguration {
    LocalDateTime date = LocalDateTime.now();
    String path = "files";
    String fileName = "Log_" + date.format(DateTimeFormatter.ofPattern("dd_LL_uuuu-HH_mm_ss."));
    String type = "txt";
    int maxSize=5;
}
