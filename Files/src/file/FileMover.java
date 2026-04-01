package file;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileMover {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Source Directory Path: ");
        String sourceDirInput = scanner.nextLine();
        System.out.print("Enter Destination Directory Path: ");
        String destDirInput = scanner.nextLine();
        Path sourceDir = Paths.get(sourceDirInput);
        Path destDir = Paths.get(destDirInput);
        if (!Files.exists(sourceDir) || !Files.isDirectory(sourceDir)) {
            System.out.println("Error: Source directory does not exist.");
            return;
        }
        try {
          if (!Files.exists(destDir)) {
                Files.createDirectories(destDir);
                System.out.println("Created destination directory.");
            }
        try (Stream<Path> paths = Files.list(sourceDir)) {
                paths.filter(Files::isRegularFile).forEach(file -> {
                    try {
                       
                        System.out.println("\n--- Reading: " + file.getFileName() + " ---");
                        String content = Files.readString(file);
                        System.out.println("Content Preview: " + 
                            (content.length() > 50 ? content.substring(0, 50) + "..." : content));

                        Path targetPath = destDir.resolve(file.getFileName());

                       
                        Files.move(file, targetPath, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Successfully moved to: " + targetPath);

                    } catch (IOException e) {
                        System.err.println("Failed to process file " + file.getFileName() + ": " + e.getMessage());
                    }
                });
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } 
        finally {
            scanner.close();
        }
    }
}