package ba.unsa.etf.rpr.predavanje03;

import java.util.Scanner;

public class Zadatak2 {

    private static int sumaCifara(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Unesite n:");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i=2; i<n; i++)
            if(i%sumaCifara(i)==0)
                System.out.println(i);
    }
}
