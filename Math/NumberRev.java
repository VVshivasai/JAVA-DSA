package Math;

public class NumberRev {
    public static void main(String[] args) {
        int n = 123;

        int rev = 0;
        while(n > 0){
            int last = n % 10;
            n = n / 10;
            rev = rev * 10 + last ;
        }
        System.out.println("The num is reversed : "+ rev);
    }
}
