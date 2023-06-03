package Library;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewFile {
    private int idNew ;
    private String idType ="new";
    private String namePublishing;
    private int numRelease;
    private int dayRelease;



    public NewFile() {
    }

    public NewFile(int idNew, String idType, String namePublishing, int numRelease, int dayRelease) {
        this.idNew = idNew;
        this.idType = idType;
        this.namePublishing = namePublishing;
        this.numRelease = numRelease;
        this.dayRelease = dayRelease;
    }

    public int getIdNew() {
        return idNew;
    }

    public void setIdNew(int idNew) {
        this.idNew = idNew;
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

    public int getDayRelease() {
        return dayRelease;
    }

    public void setDayRelease(int dayRelease) {
        this.dayRelease = dayRelease;
    }
    public NewFile enterNew(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter idNew :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter namePublishing :");
        String nameP = sc.nextLine();
        System.out.println("enter numRelease:");
        int numR = sc.nextInt();
        sc.nextLine();
        System.out.println("enter dayRelease:");
        int dayR= sc.nextInt();
        NewFile newFile = new NewFile(id,idType,nameP,numR,dayR);
        return newFile;

    }

    @Override
    public String toString() {
        return "NewFile{" +
                "idNew=" + idNew +
                ", namePublishing='" + namePublishing + '\'' +
                ", numRelease=" + numRelease +
                ", dayRelease=" + dayRelease +
                '}';
    }
}
