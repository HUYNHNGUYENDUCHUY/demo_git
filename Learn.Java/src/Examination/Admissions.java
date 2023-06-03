package Examination;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Admissions {
    public List<String> addJoiner() {
        List<String> list = new ArrayList<>();
        Joiner joiner = new Joiner();
        Scanner sc = new Scanner(System.in);
        boolean is = true;
        do {
            list.add(String.valueOf(joiner.enterJoiner()));
            System.out.println("---you want to add new student ---(Y/N)");
            String n = sc.nextLine();
            n.toLowerCase();
            if (n.contains("n")){
                is = false;
            }

        }while (is);
        return list;
    }
    public List<String> searchStudent(int id ,List<String> list){
        List<String> lis = new ArrayList<>();
        for (String element :list ){
            if ( element.equals(String.valueOf(id))){
                lis.add(element);
                break;
            }
            else {
                System.out.println("not information student ");
                break;
            }
        }
        return lis;

    }
}
