package de.ait.service;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Andrej Reutow
 * created on 01.07.2023
 */
@DisplayName("Тестирование генерации имени файла отчета")
class FileNameUtilTest {


    @DisplayName("Должно быть сгенерировано валидное имя")
    @Test
    void test_reportNameGenerator_valid_validReportName() {
        //Given
        final String fileName = "file1.csv";
        final LocalDateTime now = LocalDateTime.of(1999, 12, 31, 23, 59, 59);

        //When
        final String result = FileNameUtil.generateReportFileName(fileName, now);

        //Then
        final String expectedResult = "19991231235959_file1.report";

        assertEquals(expectedResult, result);
    }

    @DisplayName("Дата является null, должна быть выкинута ошибка")
    @Test
    void test_reportNameGenerator_dateTimeIsNull_throwsException() {
        //Given
        final String fileName = "file1.csv";

        //Then
        IllegalArgumentException resultException = assertThrows(IllegalArgumentException.class,
                () -> FileNameUtil.generateReportFileName(fileName, null));

        final String expectedMsg = "Дата не может быть null";
        assertEquals(expectedMsg, resultException.getMessage());
    }

    @DisplayName("Имя файла является null, должна быть выкинута ошибка")
    @Test
    void test_reportNameGenerator_fileNameIsNull_throwsException() {
        //Given
        final LocalDateTime now = LocalDateTime.of(1999, 12, 31, 23, 59, 59);

        //Then
        final IllegalArgumentException resultException = assertThrows(IllegalArgumentException.class,
                () -> FileNameUtil.generateReportFileName(null, now));

        final String expectedMsg = "Имя файла не может быть null";
        assertEquals(expectedMsg, resultException.getMessage());
    }
}
