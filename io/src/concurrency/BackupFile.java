package concurrency;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class BackupFile {

    public static void takeBackup(String completeFilePath) throws IOException {

        // Original file
        Path originalFile = Paths.get(completeFilePath);

        // Get the last modified time
        BasicFileAttributes attr =
                Files.readAttributes(originalFile, BasicFileAttributes.class);

        long modifiedTime = attr.lastModifiedTime().toMillis();

        // Create new filename
        String fileName = originalFile.getFileName().toString();
        String backupName = modifiedTime + "_" + fileName;

        // Create backup file in the same folder
        Path backupFile = originalFile.resolveSibling(backupName);

        // Copy the file
        Files.copy(originalFile, backupFile);

        System.out.println("Backup created successfully!");
        System.out.println("Backup file: " + backupFile);
    }

    public static void main(String[] args) {

        try {
            takeBackup("C:\\Files\\sample.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}