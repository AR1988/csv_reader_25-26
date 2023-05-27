package de.ait.file.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * @author Andrej Reutow
 * created on 27.05.2023
 * The FileUtils class provides utility methods for working with files.
 */
public class FileUtils {

    /**
     * Reads the creation date attribute of a file and returns it as a long value representing milliseconds.
     *
     * @param file the file to read the attribute from
     * @return the creation date of the file in milliseconds
     * @throws RuntimeException if an I/O error occurs while reading the file attribute
     */
    static long readFileAttribute(File file) {
        try {
            // Читаем атрибуты файла
            BasicFileAttributes attr = Files.readAttributes(file.getAbsoluteFile().toPath(), BasicFileAttributes.class);
            // Получаем дату создания файла
            FileTime fileTime = attr.creationTime();
            // Возвращаем дату создания файла в миллисекундах
            return fileTime.toMillis();
        } catch (IOException ex) {
            // Если возникает ошибка ввода-вывода, выбрасываем исключение RuntimeException
            throw new RuntimeException(ex);
        }
    }
}
