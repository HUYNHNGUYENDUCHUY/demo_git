package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageBook {

    public List<String> createBook() {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        NewFile newFile = new NewFile();
        Magazine magazine = new Magazine();
        Book book = new Book();
        boolean t = true;

        do {

            System.out.println("1 . Book");
            System.out.println("2 . magazine");
            System.out.println("3 . new");
            System.out.println("4 . Exit");
            System.out.println("--- choose type you want");
            int choose = sc.nextInt();
            sc.nextLine();
            if (choose == 1) {
                boolean is = true;
                do {
                    list.add(String.valueOf(book.enterBook()));
                    System.out.println("do you want to insert a new Book(Y/N)");
                    String n = sc.nextLine();
                    n.toLowerCase();
                    if (n.charAt(0) == 'n') {
                        is = false;
                    }
                }
                while (is);
            } else if (choose == 2) {
                boolean is = true;
                do {
                    list.add(String.valueOf(magazine.enterMagazine()));
                    System.out.println("do you want to insert a new magazine (Y/N)");
                    String n = sc.nextLine();
                    n.toLowerCase();
                    if (n.charAt(0) == 'n') {
                        is = false;
                    }
                }
                while (is);
            }
            else if (choose == 3) {
                boolean is = true;
                do {
                    list.add(String.valueOf(newFile.enterNew()));
                    System.out.println("do you want to insert a new newFile (Y/N)");
                    String n = sc.nextLine();
                    n.toLowerCase();
                    if (n.charAt(0) == 'n') {
                        is = false;
                    }
                }
                while (is);

            }
            else {
                t = false;
            }

        } while (t);
    return list;
    }
    public boolean removeBook(int id ,List<String> list1){
        ArrayList<String> list = new ArrayList<>();
        for (String element : list1){
            if (!element.contains(String.valueOf(id))){
                continue;
            }
            else {
                list1.remove(element);
                System.out.println(element);
                return true;
            }

        }
        return false;
    }
    public List<String> searchBook(String num  , List<String> list) {
        ArrayList<String> listString = new ArrayList<>();
        for (String element : list) {
            if (element.contains(num)) {
                listString.add(element);
                break;
            }

        }
        return listString;


    }
}
