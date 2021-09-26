public class binaryToDecimal {

    static void binaryDeci(String s){
        System.out.println(Integer.parseInt(s,2));
    }

    public static void main(String[] args) {
      int num= 11011;
      String s=Integer.toString(num);
      binaryDeci(s);
    }
}
