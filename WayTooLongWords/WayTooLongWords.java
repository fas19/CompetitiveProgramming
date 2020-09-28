package WayTooLongWords;

import java.util.Scanner;


public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        while (n>=1){
            String word = r.next();
            int wordLength = word.length();

            if (wordLength>10){
                word = word.charAt(0)+String.valueOf(wordLength-2)+word.charAt(wordLength-1);
            }
            System.out.println(word);
            n--;
        }
    }
}
