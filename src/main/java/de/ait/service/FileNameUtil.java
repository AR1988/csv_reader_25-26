package de.ait.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Andrej Reutow
 * created on 01.07.2023
 */
public class FileNameUtil {

    private static final String REPORT_FILE_EXTENSION = ".report";
    public static final String DATA_TIME_FORMAT = "yyyyMMddHHmmss";
    public static final String DELIMITER = "_";

    private FileNameUtil() {
    }

    public static String generateReportFileName(final String csvFileName, final LocalDateTime localDateTime) {

        if (localDateTime == null) {
            throw new IllegalArgumentException("Дата не может быть null");
        }

        if (csvFileName == null) {
            throw new IllegalArgumentException("Имя файла не может быть null");
        }


        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATA_TIME_FORMAT);
        final String datePart = localDateTime.format(formatter);
        final String fileName = csvFileName.substring(0, csvFileName.length() - 4);

        return datePart + DELIMITER + fileName + REPORT_FILE_EXTENSION;
    }
}
