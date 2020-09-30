package team;
//https://codeforces.com/problemset/problem/231/A

import java.util.Scanner;

public class Team {
    public static void main(String[] args){

        Scanner r = new Scanner(System.in);

        int n = r.nextInt();
        int counter = 0;

        while(n>0){
            int a = r.nextInt();
            int b = r.nextInt();
            int c = r.nextInt();

            if (a==1 && b == 1 || a==1 && c == 1 || b==1 && c ==1)
                counter++;
            n--;
        }
        System.out.println(counter);
    }
}
