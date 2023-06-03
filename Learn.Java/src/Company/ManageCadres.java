package Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageCadres {
    public List<String> addCadres() {
        Scanner sc = new Scanner(System.in);
        List<String> listCadres = new ArrayList<>();
        Cadres cr = new Cadres();
        boolean is  = true ;
        do {
            listCadres.add(String.valueOf(cr.enterCadres()));
            System.out.println("do you want to insert a new Cadres (Y/N)");
            String n = sc.nextLine();
            n.toLowerCase();
            if (n.charAt(0) == 'n' ){
                is = false;
            }
        }
        while (is);
        return listCadres;

    }
    public List<String> searchCadres(String name,List<String> list){
        List<String> listCadres = new ArrayList<>();
        for (String element:list){
            if (element.contains(name)){
                listCadres.add(element);
                break;
            }
        }
        return listCadres;

    }

}