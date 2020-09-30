package dominoPiling;

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);

        int x = r.nextInt();
        int y = r.nextInt();

        int area = x*y;

        int dominos = area/2;


        System.out.println(dominos);
    }
}
