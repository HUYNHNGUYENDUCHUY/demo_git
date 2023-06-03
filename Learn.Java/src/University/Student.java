package University;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int idStudent ;
    private String name ;
    private String sex ;
    private String address;

    public Student(int idStudent, String name, String sex, String address) {
        this.idStudent = idStudent;
        this.name = name;
        this.sex = sex;
        this.address = address;

    }

    public Student() {
    }

    public Student addStudent (){
        Scanner sc = new Scanner(System.in);
        System.out.println("insert id Student ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("insert  name  ");
        String name = sc.nextLine();
        System.out.println("insert sex ");
        String sex = sc.nextLine();
        System.out.println("insert address ");
        String address = sc.nextLine();
        Student student = new Student(id,name,sex,address);
        return student;
    }
    public List<String> removeStudent (int id , List<String> list ){
        for (String element : list){
            if ( element.contains(String.valueOf(id))){
                list.remove(element);
                System.out.println(element);
                break;
            }else {
                System.out.println("not id in Student ");
            }
        }
        return list;
    }
    public List<String>  searchStudent(int id , List<String> list){
        List<String> lis = new ArrayList<>();
        for (String element : list ){
            if ( element.contains(String.valueOf(id))){
                lis.add(element);
                break;
            }
        }
        return lis ;
    }
    public List<String> repairIdStudent (int id , List<String> list ){
        Student student = new Student();
        List<String> lis = new ArrayList<>();
        for (String element : list){
            if (element.contains(String.valueOf(id))){
                list.remove(element);
                System.out.println("repair information student ");
               lis.add(String.valueOf(student.addStudent()));
               break;
            }
            else {
                System.out.println("not to find student id");
                break;
            }
        }
        return lis;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
