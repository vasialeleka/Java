package ConsolNotebook;

import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        boolean flag = true;
        int i = 0;
       ArrayList all_notes = new ArrayList();
        while (flag) {
            System.out.println("Push 1 for new note.\n 2 - see all notes.\n 3- close");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Write your notes :");
                    Scanner noteline = new Scanner(System.in);
                    String note;
                    note = noteline.nextLine();
                    all_notes.add(note);
                    System.out.println(note);
                    break;
                case 2:
                    System.out.println(all_notes);
                    break;
                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("I don't know");


            }




        }
    }
}
