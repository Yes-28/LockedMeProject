package simpliLearn;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockMeProject {
    static final String projectFilePath = "C:\\Users\\LENOVO\\Desktop\\LockmeFinalProject\\TextFolder";
    /**
     *This Method the main menu for accessing file is made
     */
    public static void displayMenu()
    {
        System.out.println("******************************************");
        System.out.println("\t\tWelcome to LockedMe.com secure app");
        System.out.println("\t\tDeveloped by : Divyajyoti Mandal");
        System.out.println("******************************************");
        System.out.println("\t\t1. Display all files");
        System.out.println("\t\t2. Add a new files");
        System.out.println("\t\t3. Delete a files");
        System.out.println("\t\t4. Search files");
        System.out.println("\t\t5. Exit");
        System.out.println("******************************************"); 
    }

    /**
     *This Method prints all the files
     */
    public static void getAllFiles()
    {

        File folder = new File(projectFilePath);
        File[] listOfFiles = folder.listFiles();
                if (listOfFiles.length>0){
                for(var l:listOfFiles)
        {
            System.out.println(l.getName());
        }}
                else
                {
                    System.out.println("folder is empty");
                }
    }
    /**
     *This Method crates new files and the internal content of the file in same directory.
     */
    public static void createFiles() {
        try {
            Scanner obj = new Scanner(System.in);
            String fileName;
            System.out.println("Enter the file name:");
            fileName = obj.nextLine();
            int lineCount;
            System.out.println("How many lines in the file");
            lineCount = Integer.parseInt(obj.nextLine());
            FileWriter fw = new FileWriter(projectFilePath + "\\" + fileName);
            for (int i=1 ; i <=lineCount;i++)
            {
                System.out.println("enter file line");
                fw.write(obj.nextLine()+"\n");
            }
            System.out.println("File Created Successfully");
            fw.close();

        }
        catch (Exception Ex)
        {

        }
    }
    /**
     *This Method delete files
     */
    public static void deleteFiles()
    {
        //calling getAllFiles for displaying and then deleting//
        getAllFiles();
        try {
            Scanner obj = new Scanner(System.in);
            String fileName;
            System.out.println("Enter the file name to be deleted:");
            fileName = obj.nextLine();
            File f = new File(projectFilePath+"\\"+fileName);
            if(f.exists())
            {
                f.delete();
                System.out.println("File deleted successfully");

            }
            else
            {
                System.out.println("File does not exist");
            }


        }
        catch (Exception Ex)
        {
            System.out.println("unable to delete plz contact @administrator .com");
        }
    }
    /**
     *This Method searches files in the directory
     */
    public static void searchFiles()
    {   //calling getAllFiles for displaying and then deleting//
        getAllFiles();
        try {
            Scanner obj = new Scanner(System.in);
            String fileName;
            System.out.println("Enter the file nate to be search :");
            fileName = obj.nextLine();

            ArrayList<String> allFileNames = new ArrayList<String>();
            File folder = new File(projectFilePath);
            File [] listOfFiles = folder.listFiles();
            if(listOfFiles.length> 0)
            {
                for (var l :listOfFiles)
                {
                    allFileNames.add(l.getName());
                }
            }
            File F = new File(projectFilePath+"\\"+fileName);
            if(allFileNames.contains(fileName))
            {
                System.out.println("file is available");
            }
            else
            {
                System.out.println("file does not exist");
            }
        }
        catch (Exception Ex)
        {

        }
    }

}
