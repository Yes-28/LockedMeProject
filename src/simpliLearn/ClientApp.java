package simpliLearn;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class ClientApp {
    public static void main(String[] args) {
        // write your code here
        Scanner obj = new Scanner(System.in);
        int ch;
        do {
            LockMeProject.displayMenu();
            System.out.println("Enter your choice");
            ch=Integer.parseInt(obj.nextLine());
            switch(ch)
            {
                case 1:LockMeProject.getAllFiles();
                break;
                case 2:LockMeProject.createFiles();
                break;
                case 3:LockMeProject.deleteFiles();
                break;
                case 4:LockMeProject.searchFiles();
                break;
                case 5:System.exit(0);
                break;
                default:
                    System.out.println("Invalid Option");
                    break;

            }
        }
        while (ch>0);
    }
}
