package worldcapitalization;

import java.util.Scanner;

public class WorldCapitalization {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);

        String testString = r.next();

        System.out.println(testString.substring(0,1).toUpperCase().concat(testString.substring(1)));

    }
}
