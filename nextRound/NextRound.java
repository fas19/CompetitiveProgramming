package nextRound;
//https://codeforces.com/problemset/problem/158/A

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);

        int n = r.nextInt();
        int k = r.nextInt();

        int[] points = new int[n];
        int poinsOfkth = -1;

        for(int i = 1; i <= n; i++){
            points[i-1] = r.nextInt();
            if(i==k){
                poinsOfkth = points[i-1];
            }
        }
        int counter = 0;
        for(int x : points){
            if (x>=poinsOfkth && x>0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
