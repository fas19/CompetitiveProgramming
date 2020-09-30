package tram;
//https://codeforces.com/problemset/problem/116/A

import java.util.Scanner;

public class Tram {
    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        int stops = r.nextInt();

        int maxSeats = 0;
        int currentPassengers=0;

        for(int i = 1; i<=stops; i++){
            int a = r.nextInt();
            int b = r.nextInt();

            if (i==1) {
                maxSeats = a;
                currentPassengers=b-a;
            }
            else {
                currentPassengers += (b - a);
            }
            if(currentPassengers>maxSeats)
                maxSeats=currentPassengers;
        }
        System.out.println(maxSeats);
    }
}
