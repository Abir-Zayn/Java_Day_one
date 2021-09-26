
public class sumDigit {
    public static int digitsum(int i){
        int sum=0;
        while(i!=0){
            sum=sum+i%10;
            i=i/10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int i=123456;
        System.out.println("The sum is "+digitsum(i));
    }
}
