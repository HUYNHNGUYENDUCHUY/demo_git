package Department;

import java.util.Scanner;

public class Person {
    private String fullName ;
    private int age ;
    private String job;
    private int idCredit ;


    public Person(String fullName, int age, String job, int idCredit) {
        this.fullName = fullName;
        this.age = age;
        this.job = job;
        this.idCredit = idCredit;
    }

    public Person() {
    }
    public Person enterPerson (){
        Scanner sc = new Scanner(System.in);
            System.out.println("insert fullName ");
            String fullName = sc.nextLine();
            System.out.println("insert age  ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("insert job ");
            String job = sc.nextLine();
            System.out.println("insert id credit ");
            int id = sc.nextInt();
            sc.nextLine();
            Person person = new Person(fullName,age,job,id);
            return person;


    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", idCredit=" + idCredit +
                '}';
    }
}
