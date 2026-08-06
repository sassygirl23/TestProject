package concurrency;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class BackupFile {

    public static void takeBackup(String completeFilePath) throws IOException {

        
        Path originalFile = Paths.get(completeFilePath);

        
        BasicFileAttributes attr =
                Files.readAttributes(originalFile, BasicFileAttributes.class);

        long modifiedTime = attr.lastModifiedTime().toMillis();

       
        String fileName = originalFile.getFileName().toString();
        String backupName = modifiedTime + "_" + fileName;

        // Create backup file in the same folder
        Path backupFile = originalFile.resolveSibling(backupName);

        
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