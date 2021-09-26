//A program that shows a multiplication table of a number

import java.util.*;

public class multiplication {
    public static void main(String[] args) {
        System.out.println("Enter the number of multilplication table");
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(i*m);
        }
        scan.close();
    }
}
