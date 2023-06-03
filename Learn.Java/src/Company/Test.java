package Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lis = new ArrayList<>();
        ManageCadres mc = new ManageCadres();

        do {
            System.out.println("--- Manage ---");
            System.out.println("1. Add a new Cadres");
            System.out.println("2. Search Cadres");
            System.out.println("3. Display the information of Cadres");
            System.out.println(("4. Exit"));
            System.out.println("choose");
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    lis = mc.addCadres();
                        break;
                }
                case 2:{
                    System.out.println("insert name of Cadres you want to find");
                    String name = sc.next();
                    List<String> list = mc.searchCadres(name,lis);
                    System.out.println(list);
                    break;
                }
                case 3:{
                    System.out.println(lis);
                        break;
                }
            }


        }
        while (true);
    }
}

