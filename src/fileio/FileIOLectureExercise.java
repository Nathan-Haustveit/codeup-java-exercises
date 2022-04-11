package fileio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOLectureExercise {

    public static void main(String[] args) {

        // Lecture examples to work out after students
        String myPath = "/Users/files/this.text";
        String fileName = "test.txt";
        String directory = "data";

        // Getting the file full path from this method get
        Path filePath = Paths.get(directory,fileName);

        System.out.println("filePath.getFileName() = " + filePath.getFileName());
        System.out.println("filePath.toString() = " + filePath.toString());

        Path fakePath = Paths.get("dir1","dir2","dir3","dir4", "file.text");

        System.out.println("fakePath.toAbsolutePath() = " + fakePath.toAbsolutePath());


        // Path, 1 directory being passed as argument
        Path oneDirectoryPath = Paths.get("data");

        System.out.println("oneDirectoryPath.toAbsolutePath() = " + oneDirectoryPath.toAbsolutePath());

        // Path, 3 arguments, 2 dir  + filename

        Path threeArgumentsPath = Paths.get("dir1","dir2", "filename.txt");

        // Absolute Path

        Path absolutePath = Paths.get("/","User");

        System.out.println("absolutePath.isAbsolute() = " + absolutePath.isAbsolute());

        // Path, Absolute, verify with isAbsolute.

        Path anotherAbsolutePath = Paths.get("./", "user");

        System.out.println("anotherAbsolutePath.isAbsolute() = " + anotherAbsolutePath.isAbsolute());


        // Get path to the dishes files
        Path dishesPath = Paths.get("data","dishes.txt");
        Path dishesDirPath = Paths.get("data");

        // If it doesn't exist -> create it & create any directories


        List<String> fileData = null;



        try {
            if (Files.notExists(dishesDirPath)) Files.createDirectories(dishesDirPath);
            if (Files.notExists(dishesPath)) Files.createFile(dishesPath);


            // Read the contents of the file.
            //Files.readAllLines(dishesPath);

            // Store contents in variable called fileData List<String>
            fileData =  Files.readAllLines(dishesPath);

            //throw new IOException(); forces exception

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File or Directory could not be created. ");
        }

        // Loop over the contents of the fileData variable and output the
        // lines to the screen.
        for(String line : fileData) {
            // prints out the lines from the file
            System.out.println(line);
        }


        FileManager dishesFile = new FileManager("dishes.txt","data");
        dishesFile.printLines();

        fileData.add("additional item");
        fileData.add("additional item2");

        try {
            Files.write(filePath ,fileData);
        } catch (IOException e) {
            e.printStackTrace(); // Displays error to console
            System.out.println("Error writing to file: " + dishesPath.getFileName());
        }

    List<String> moreDishes = Arrays.asList("Dish1", "dish2", "dish3");

        System.out.println(moreDishes.toString());

        try {
            Files.write(filePath ,moreDishes, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace(); // Displays error to console
            System.out.println("Error writing to file: " + dishesPath.getFileName());
        }

        try {

            fileData = Files.readAllLines(dishesPath);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File pr Directory could not be created");
        }

        for (String line : fileData){
            System.out.println(line);
        }

            //throw new IOException(); forces exception

///////
//        Path dishesPath = Paths.get("data", "dishes.txt");
//        Path dishesDirectory = Paths.get("data");
//
//
//        List<String> fileData = null;
//
//
//        try {
//            if (Files.notExists(dishesDirectory)) Files.createDirectories(dishesDirectory);
//            if (Files.notExists(dishesPath)) Files.createFile(dishesPath);
//            fileData = Files.readAllLines(dishesPath);
//
//        } catch (IOException e) {
//            System.out.println("Trashhhh");
//        }
//
//
//        try {
//            fileData.add("Whats up");
//            Files.write(dishesPath, fileData);
//        } catch (IOException e) {
//            System.out.println("Trashhhh");
//        }
//
//
//        List<String> moreDishes = Arrays.asList("hello", "fellas");
//        Files.write(
//                Paths.get("data", "dishes.txt"),
//                moreDishes,
//                StandardOpenOption.APPEND
//        );
//
//        for (String line : fileData) {
//            System.out.println(line);
//        }




        // After:
        // Lets use the FileManager to do the same thing



    }

}