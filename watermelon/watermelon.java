package watermelon;
//https://codeforces.com/problemset/problem/4/A

import java.util.Scanner;

public class watermelon {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);

        int w = r.nextInt();

        if (w%2==0 && w > 2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}