package wrongsubtraction;
//https://codeforces.com/problemset/problem/977/A

import java.util.Scanner;

public class WrongSubtraction {
    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        int number = r.nextInt();
        int subtractions = r.nextInt();

        while (subtractions>0){
            if(number%10==0){
                number/=10;
            }
            else{
                number--;
            }
            subtractions--;
        }
        System.out.println(number);
    }
}
