package University;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        boolean is = true ;
        do{
            System.out.println("--- manage student ---");
            System.out.println("1. Add student ");
            System.out.println("2. remove student ");
            System.out.println("3. search student");
            System.out.println("4. arrange student with id");
            System.out.println("5. Display result ");
            System.out.println("6. Exit ");
            System.out.println("--- the choose for you ");
            int n = sc.nextInt();
            switch (n){
                case 1:{
                    boolean t = true;

                    do{
                        List<String> stringList = new ArrayList<>();
                        stringList.add (String.valueOf(student.addStudent()));
                        System.out.println("do you want to add new student (Y/N");
                        String y = sc.next();
                        y.toLowerCase();
                        if(y.contains("n")){
                            t = false;
                        }
                        list.add(String.valueOf(stringList));
                    }while (t);

                    break;
                }
                case 2:{
                    System.out.println("insert id student you want to remove ");
                    int id = sc.nextInt();
                    list = student.removeStudent(id,list);
                    System.out.println("removed");
                    break;
                }
                case 3:{
                    List<String> list1 = new ArrayList<>();
                    System.out.println("insert id student you want to search ");
                    int id = sc.nextInt();
                    list1 = student.searchStudent(id,list);
                    System.out.println(list1);
                    break;

                }
                case 4:{
                    System.out.println("insert id student you want to search ");
                    int id = sc.nextInt();
                    list.add(String.valueOf(student.repairIdStudent(id,list)));
                    System.out.println(list);
                    break;
                }
            }
        }while (is);
    }
}
