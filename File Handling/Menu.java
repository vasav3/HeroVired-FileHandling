import java.io.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Menu based app - File Operations in Java\n");
            System.out.println("1. Create a new folder");
            System.out.println("2. Create a new text file");
            System.out.println("3. Write into a text file");
            System.out.println("4. Append data to a text file");
            System.out.println("5. Rename a file");
            System.out.println("6. Delete a File");

            System.out.print("\nPlease enter the Menu: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createFolder();
                    break;
                case 2:
                    createFile();
                    break;
                case 3:
                    writeFile();
                    break;
                case 4:
                    appendFile();
                    break;
                case 5:
                    renameFile();
                    break;
                case 6:
                    deleteFile();
                    break;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }

            System.out.print("\nPress 'Y' to go back to the Main File-Operations Menu: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

    }

    public static void createFolder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter the Folder-name to be Created: ");
        String folderName = scanner.nextLine();

        System.out.print("\nPlease enter the Path where you wish to save a new folder: ");
        String path = scanner.nextLine();

        File file = new File(path + "\\" + folderName);

        if (file.mkdir()) {
            System.out.println("\nFolder is created Successfully!");
        } else {
            System.out.println("\nFailed to create a new Folder!");
        }
    }

    public static void createFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter the File-Name to be Created: ");
        String fileName = scanner.nextLine();

        System.out.print("\nPlease enter the Path where you wish to save a new file: ");
        String path = scanner.nextLine();

        File file = new File(path + "\\" + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("\nFile is created Successfully!");
            } else {
                System.out.println("\nFailed to create a new File!");
            }
        } catch (IOException e) {
            System.out.println("\nError Occurred: " + e.getMessage());
        }
    }

    public static void writeFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter the File-Name: ");
        String fileName = scanner.nextLine();

        System.out.print("\nPlease enter the Path where your file is stored: ");
        String path = scanner.nextLine();

        System.out.print("\nPlease enter the data to be written into the file: ");
        String content = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(path + "\\" + fileName);
            writer.write(content);
            writer.close();
            System.out.println("\nData is written Successfully into the file!");
        } catch (IOException e) {
            System.out.println("\nError Occurred: " + e.getMessage());
        }
    }

    public static void appendFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter the File-Name: ");
        String
