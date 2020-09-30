package helpfulmaths;

import java.util.Scanner;

public class HelpfulMaths {

    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        String s = r.next();
        int countOfOne = 0;
        int countOfTwo = 0;
        int countOfThree = 0;

        for(int i = 0; i<=s.length()-1; i++){
            if(i%2==0){
                char current = s.charAt(i);
                if(current=='1'){
                    countOfOne++;
                }
                else if (current=='2'){
                    countOfTwo++;
                }
                else if(current == '3'){
                    countOfThree++;
                }
            }
        }

        StringBuilder newString = new StringBuilder();
        int total = countOfOne+countOfTwo+countOfThree;

        for(int i = 1; i <= total; i++){
            if(countOfOne>0){
                newString.append('1');
                countOfOne--;
            }
            else if (countOfTwo>0){
                newString.append('2');
                countOfTwo--;
            }
            else if(countOfThree>0){
                newString.append('3');
                countOfThree--;
            }

            if(i!=total){
                newString.append('+');
            }
        }
        System.out.println(newString);
    }
}
