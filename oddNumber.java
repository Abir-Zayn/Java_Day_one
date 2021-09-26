//finding the all odd numbers in the range of 1 to 100
public class oddNumber {
    public static void main(String[] args) {

        for(int i=0; i<=100; i++){
            if(i%2==0) {
                i = i + 1;
            }
            System.out.println(i);
        }

    }
}
