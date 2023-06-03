package Library;

import java.util.Scanner;

public class Magazine {
    private int idMagazine  ;
    private String namePublishing;
    private int numRelease;
    private int noRelease;
    private int monthRelease;
    private String idType ="magazine";

    public Magazine(int idMagazine, String namePublishing, int numRelease, int noRelease, int monthRelease,String idType) {
        this.idMagazine = idMagazine;
        this.namePublishing = namePublishing;
        this.numRelease = numRelease;
        this.noRelease = noRelease;
        this.monthRelease = monthRelease;
        this.idType = idType;
    }

    public Magazine() {
    }

    public int getIdMagazine() {
        return idMagazine;
    }

    public void setIdMagazine(int idMagazine) {
        this.idMagazine = idMagazine;
    }

    public String getNamePublishing() {
        return namePublishing;
    }

    public void setNamePublishing(String namePublishing) {
        this.namePublishing = namePublishing;
    }

    public int getNumRelease() {
        return numRelease;
    }

    public void setNumRelease(int numRelease) {
        this.numRelease = numRelease;
    }

    public int getNoRelease() {
        return noRelease;
    }

    public void setNoRelease(int noRelease) {
        this.noRelease = noRelease;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }
    public Magazine enterMagazine (){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter idMagazine :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter namePublishing :");
        String nameP = sc.nextLine();
        System.out.println("enter numRelease:");
        int numR = sc.nextInt();
        sc.nextLine();
        System.out.println("enter noRelease:");
        int no = sc.nextInt();
        sc.nextLine();
        System.out.println("enter numPage:");
        int numPage= sc.nextInt();
         Magazine magazine = new Magazine(id,nameP,numR,no,numPage,idType);
         return magazine;
    }


    @Override
    public String toString() {
        return "Magazine{" +
                "idMagazine=" + idMagazine +
                ", namePublishing='" + namePublishing + '\'' +
                ", numRelease=" + numRelease +
                ", noRelease=" + noRelease +
                ", monthRelease=" + monthRelease +
                ", idType='" + idType + '\'' +
                '}';
    }
}


