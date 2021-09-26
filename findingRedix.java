public class findingRedix {
    public static void main(String[] args) {
        int num=101;
        String s=Integer.toString(num);

        if(s.matches("[0-1]*")) System.out.println("Binary");
        else if (s.matches("[0-7]+")) System.out.println("Octal");
        else if(s.matches("[0-9]+")) System.out.println("Decimal");
        else if(s.matches("[0-9][A-F]+")) System.out.println("Hexa-Decimal");
        else System.out.println("Wrong Number");
    }
}
