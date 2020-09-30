package soilderandbananas;
//https://codeforces.com/problemset/problem/546/A

import java.util.Scanner;

public class SoilderAndBananas {
    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        int k = r.nextInt();
        int n = r.nextInt();
        int w = r.nextInt();

        int totalMoneyNeeded = 0;

        for(int i = 1; i <= w; i++){
            totalMoneyNeeded+=k*i;
        }

        if (totalMoneyNeeded <= n){
            System.out.println(0);
        }
        else{
            System.out.println(totalMoneyNeeded-n);
        }
    }
}
