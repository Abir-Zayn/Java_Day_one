
import java.util.*;

public class Binaryconc {
    static void decimaltoBinary(int s){
        System.out.println(Integer.toBinaryString(s));
    }


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int r=sc.nextInt();
    int q=sc.nextInt();
    int s=r+q;
        System.out.println("The result is in decimal "+s);
        System.out.println("The result in binary");
        decimaltoBinary(s);
        sc.close();
    }

}
