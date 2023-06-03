package Department;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        List <String> lis = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Town town = new Town();
        Family family= new Family();
        boolean is = true;
        do{
            System.out.println("1. add a new family");
            System.out.println("2. search family");
            System.out.println("3.Exit");
            System.out.println("insert choose ");
            int n = sc.nextInt();
            switch (n){
                case 1:{
                    List <String> list1 = new ArrayList<>();
//                    list1 = town.addFamily();
                    break;
                }
                case 2:{
                    System.out.println(lis);
                    break;
                }
                case 3:{
//                    is = false;
//                    break;
                }
                default:{
                    is = false;
                    break;
                }
            }
        }while (is);

    }
}
