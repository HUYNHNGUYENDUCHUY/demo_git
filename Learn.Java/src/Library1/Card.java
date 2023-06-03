package Library1;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Card {
    private  int idCard;
    private int borrowedDate;
    private int payDay;
    private List<Student> informationStudent ;
    Student student = new Student();


    public Card(int idCard, int borrowedDate, int payDay, List<Student> informationStudent) {
        this.idCard = idCard;
        this.borrowedDate = borrowedDate;
        this.payDay = payDay;
        this.informationStudent = informationStudent;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(int borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public List<Student> getInformationStudent() {
        return informationStudent;
    }

    public void setInformationStudent(List<Student> informationStudent) {
        this.informationStudent = informationStudent;
    }
    public Card enterCard (){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- add a new card ---");
        System.out.print("enter id card ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("enter borrowedDate");
        int day1 = sc.nextInt();
        sc.nextLine();
        System.out.print("enter payDay");
        int day2 = sc.nextInt();
        sc.nextLine();
        System.out.println("add information student ");
        Student student1 = student.enterStudent();
        Card card = new Card(id,day1,day2,List.of(student1));
        return card;
    }
}
