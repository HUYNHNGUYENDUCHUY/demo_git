package Department;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family {
    private int numFamily;
    private int numHome;
    private List<Person> personInformation;


    public Family(int numFamily, int numHome, List<Person> personInformation) {
        this.numFamily = numFamily;
        this.numHome = numHome;
        this.personInformation = personInformation;
    }

    public Family() {
    }

    public Family enterFamily(){
        List<Person> personInformation = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("insert number family");
        int numFamily = sc.nextInt();
        System.out.println("insert number home");
        int numHome = sc.nextInt();
        Person person = new Person();
        System.out.println("insert number person in family");
        int n = sc.nextInt();
        sc.nextLine();
            for (int i = 0 ; i < n ; i++){
                Person person1=  person.enterPerson();
                personInformation.add(person1);
        }
        Family family = new Family(numFamily,numHome,personInformation);
        return family;
    }

    @Override
    public String toString() {
        return "Family{" +
                "numFamily=" + numFamily +
                ", numHome=" + numHome +
                ", personInformation=" + personInformation +
                '}';
    }
}
