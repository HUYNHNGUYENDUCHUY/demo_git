package Library;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        ManageBook mb = new ManageBook();
        boolean t = true;
        do{
            System.out.println( "--- Manage ---");
            System.out.println("1. add new : book , new , magazine");
            System.out.println("2. remove document  ");
            System.out.println("3. display information of document  ");
            System.out.println("4. search document ");
            System.out.println("5. exit ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                {
                    list = mb.createBook();
                    break;
                }
                case 2: {
                    System.out.println("please insert id you need remove");
                    int id = sc.nextInt();
                    System.out.println("Removed");
                    if (mb.removeBook(id, list)) {
                        System.out.println("con lai");
                        System.out.println(list);
                    }
                    else {
                        System.out.println("phone number existed");
                    }
                    break;
                }
                case 3:{
                    System.out.println(list);
                    break;
                }
                case 4:{
                    System.out.println("insert type book you want to find ");
                    String num = sc.next();
                    List<String> stringList = mb.searchBook(num, list);
                    System.out.println(stringList);
                    break;
                }
                case 5:{
                    t =false;
                }
                default:{
                    t=false;
                }
            }

        }while (t);
    }

}
