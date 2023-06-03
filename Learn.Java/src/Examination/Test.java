package Examination;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Joiner joiner = new Joiner();
        Admissions ad = new Admissions();
        boolean is = true ;
        do{
            System.out.println("--- add student join ---");
            System.out.println("1. add new student  ");
            System.out.println("2. display student and block");
            System.out.println("3. search student ");
            System.out.println("4. Exit ");
            System.out.println("--- choose of you---");
            int n = sc.nextInt();
            switch (n){
                case 1:{
                list = ad.addJoiner();
                break;
                }
                case 2:{
                    System.out.println(list);
                    break;
                }
                case 3:{
                    List<String> lis = new ArrayList<>();
                    System.out.println("insert id student you want to find ");
                    int id = sc.nextInt();

                    lis=ad.searchStudent(id,list);
                    System.out.println(lis);
                    break;
                }
                case 4:{
                    is = false;
                }
                default:{
                    is = false;
                }
            }
        }while (is );
    }
}
