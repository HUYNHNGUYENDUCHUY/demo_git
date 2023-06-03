package Department;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Town {

    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        Town town = new Town();
        System.out.println("nhan");
        int i = sc.nextInt();
        if (town.enterArray(i)){
            for (int j = 0 ; j<5;j++){

                arr[j]=i ;
            }


        }
    }





        public boolean enterArray(int i) throws ArrayIndexOutOfBoundsException {
            boolean is = false;
            boolean t = true;
            while (t){
                try{
                    addArray();
                    is = true;
                    t = false;
                }
                catch (Exception e){
                    System.out.println("you input wrong ");
                }

            }
            return is;
        }
        public int addArray (){
            Scanner sc = new Scanner(System.in);
            int v = sc.nextInt();
            return v;
        }


}

