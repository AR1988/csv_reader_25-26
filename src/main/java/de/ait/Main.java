package de.ait;

import de.ait.logger.Logger;
import de.ait.model.CsvRowModel;
import de.ait.service.FileService;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 27.05.2023
 */
public class Main {

    private static final String DELIMITER = ";";
    private static final FileService fileService = new FileService();
    private static final String TITLE = "TABLE";
    private static final int SIZE = 19;

    public static void main(String[] args) {
        File file = fileService.readFolder("./source");
        List<String> rows = fileService.readFile(file);

//        Converter<Long> longConverter = new LongConverter();
//        List<String> errors = new ArrayList<>();
//        Long convert = longConverter.convert("123", "TEST", errors, true);
//        System.out.println(convert);

        if (!rows.isEmpty()) {
            boolean hasHeader = hasHeader(rows.get(0));
            int startPos = hasHeader ? 1 : 0;

            List<CsvRowModel> fileModels = new ArrayList<>();
            for (int rowNumber = startPos; rowNumber < rows.size(); rowNumber++) {
                String row = rows.get(rowNumber);
                List<String> splitColumn = Arrays.asList(row.split(DELIMITER, -1));
                if (splitColumn.size() == SIZE) {
                    CsvRowModel csvRowModel = CsvMapper.toCsvRowModel((rowNumber + 1), splitColumn);
                    fileModels.add(csvRowModel);
                } else {
                    Logger.error("Размер не соответствует ожидаемому. Ожидается " + SIZE + " актуальный:" + splitColumn.size());
                }
            }

            print(fileModels);
        }
    }

    private static void print(List<CsvRowModel> fileModels) {
        for (CsvRowModel fileModel : fileModels) {
            System.out.println("_".repeat(60));
            System.out.println("Строка: " + fileModel.getRowNr());
            System.out.println(fileModel);
        }
        System.out.println("_".repeat(60));
    }

    private static boolean hasHeader(String firstRow) {
        if (firstRow != null && firstRow.length() > 0) {
            return firstRow.split(DELIMITER)[0].equalsIgnoreCase(TITLE);
        }
        return false;
    }
}
