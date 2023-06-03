package Company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Cadres {
    private String name;
    private int age ;
    private String sex;
    private String address;
    private String department ;

    public Cadres() {
    }

    public Cadres(String name, int age, String sex, String address,String department) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.department = department;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public Cadres enterCadres(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Add new Cadres ---");
        System.out.println("insert name of Cadres");
        String name = sc.nextLine();
        System.out.println("insert age of Cadres");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("insert sex of Cadres");
        String sex = sc.nextLine();
        System.out.println("insert address of Cadres");
        String address = sc.nextLine();
        System.out.println("insert department of Cadres");
        String department = sc.nextLine();
        Cadres cadres = new Cadres(name,age,sex,address,department);
        return cadres;

    }

    @Override
    public String toString() {
        return "Cadres{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
