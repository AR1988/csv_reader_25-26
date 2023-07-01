package de.ait.service;

import de.ait.logger.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Andrej Reutow
 * created on 01.07.2023
 */
public final class FileMover {


    private final String pathToFolder;

    public FileMover(String folderPath) {
        this.pathToFolder = folderPath;
        createFolderIfNotExist();
    }

    public void move(String filePathToMove, String fileNameToMove) {
        final Path pathOfFile = Path.of(filePathToMove);
        final Path pathToMove = Path.of(pathToFolder + "/" + fileNameToMove);

        try {
            Files.move(pathOfFile, pathToMove);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createFolderIfNotExist() {
        Path path = Path.of(pathToFolder);
        boolean isExists = Files.exists(path);
        Logger.info("Пака по адресу '" + pathToFolder + "' существует: " + isExists);
        if (!isExists) {
            try {
                Files.createDirectory(path);
                Logger.info("Папка по адресу '" + pathToFolder + "' создана");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
