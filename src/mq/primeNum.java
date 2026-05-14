package mq;

public class primeNum {//o(n) , 0(1)
    public static void main(String[] args) {

        int num = 9;

        if(num <= 1) {
            System.out.println(num + " : is NOT a Prime Number");
            return;
        }

        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) {
                System.out.println(num + " : is NOT a Prime Number1");
                return;
            }
        }

        System.out.println(num + " : is a Prime Number");
    }
}
