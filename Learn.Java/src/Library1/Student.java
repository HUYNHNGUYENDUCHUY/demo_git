package Library1;

import java.util.Scanner;

public class Student {
    public Student(String name, int age, String nameClass) {
        this.name = name;
        this.age = age;
        this.nameClass = nameClass;
    }

    private String name ;
    private int age ;
    private String nameClass;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
    public Student enterStudent (){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- add information Student ---");
        System.out.print("enter name student ");
        String name = sc.nextLine();
        System.out.print("enter age student ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("enter name class student ");
        String nameClass = sc.nextLine();
        Student student = new Student(name,age,nameClass);
        return student ;
    }

}
