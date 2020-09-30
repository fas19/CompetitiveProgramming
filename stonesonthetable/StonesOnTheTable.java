package stonesonthetable;
//https://codeforces.com/problemset/problem/266/A

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        int n = r.nextInt();
        String stones = r.next();



        int removable = 0;
        char tempstone = stones.charAt(0) ;
        char currentstone;


        for (int i = 1; i < stones.length(); i++){
            currentstone = stones.charAt(i);

            if(currentstone == tempstone){
                removable++;
            }
            else{
                tempstone = currentstone;
            }
        }

        System.out.println(removable);
    }
}
