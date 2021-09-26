import java.util.*;
public class octal {

    static  void decimalToOctal(int g){
        System.out.println(Integer.toOctalString(g));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 decimal numbers");
        int e=sc.nextInt();
        int f=sc.nextInt();
        int g=e+f;
        System.out.println("The decimal point addition"+g);
        System.out.println("The decimal to octal convert");
        decimalToOctal(g);
    }
}
