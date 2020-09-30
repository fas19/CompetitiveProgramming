package bearandbigbrother;
//https://codeforces.com/problemset/problem/791/A

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        int a = r.nextInt();
        int b = r.nextInt();
        int counter = 0;

        while (a<=b){
            a=3*a;
            b=2*b;
            counter++;
        }
        System.out.println(counter);
    }
}
