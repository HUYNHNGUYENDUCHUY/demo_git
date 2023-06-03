package Examination;
import java.util.List;
import java.util.Scanner;

public class Joiner {
    private int idJoiner;
    private String fullNane;
    private String address;
    private String prioritize;
    private String block;

    public Joiner() {
    }

    public int getIdJoiner() {
        return idJoiner;
    }

    public void setIdJoiner(int idJoiner) {
        this.idJoiner = idJoiner;
    }

    public String getFullNane() {
        return fullNane;
    }

    public void setFullNane(String fullNane) {
        this.fullNane = fullNane;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrioritize() {
        return prioritize;
    }

    public void setPrioritize(String prioritize) {
        this.prioritize = prioritize;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;


    public Joiner(int idJoiner, String fullNane, String address, String prioritize, String block, String subject) {
        this.idJoiner = idJoiner;
        this.fullNane = fullNane;
        this.address = address;
        this.prioritize = prioritize;
        this.block = block;
        this.subject = subject;
    }
    public Joiner enterJoiner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("insert id ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("insert full name ");
        String name = sc.nextLine();
        System.out.println("insert address ");
        String address = sc.nextLine();
        System.out.println("insert prioritize ");
        String prioritize = sc.nextLine();
        System.out.println("insert block ");
        String block = sc.nextLine();
        String subject = "";
    if (block.contains("a")){
            subject=" Math,Physical,Chemical ";
        }
        else if (block.contains("b")){
            subject = "Math,Chemical,Disciple";
        }
        else if (block.contains("c")){
            subject = "Literature,History,Geography";
    }

        Joiner joiner = new Joiner(id,name,address,prioritize,block,subject);
        return joiner;

    }

    @Override
    public String toString() {
        return "Joiner{" +
                "idJoiner=" + idJoiner +
                ", fullNane='" + fullNane + '\'' +
                ", address='" + address + '\'' +
                ", prioritize='" + prioritize + '\'' +
                ", block='" + block + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

