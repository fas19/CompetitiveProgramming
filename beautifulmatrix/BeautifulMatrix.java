package beautifulmatrix;
//https://codeforces.com/problemset/problem/263/A

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        int current = 0;
        int finalrow = 0;
        int finalcol = 0;

        for(int row = 1; row <=5; row++){
            for (int col = 1; col <= 5; col++){
                current = r.nextInt();

                if (current == 1){
                    finalrow = row;
                    finalcol = col;
                    break;
                }
            }
            if (current == 1){
                break;
            }
        }

        int moves = (Math.abs(finalcol - 3) + Math.abs(finalrow - 3));
        System.out.println(moves);


    }
}
