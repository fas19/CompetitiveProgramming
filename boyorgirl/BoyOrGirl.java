package boyorgirl;
//https://codeforces.com/problemset/problem/236/A

import java.util.Hashtable;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main (String[] args){
        Scanner r = new Scanner(System.in);
        String username = r.next();

        Hashtable<String, Integer> table = new Hashtable<>();


        for(char x : username.toCharArray()){

            String current = String.valueOf(x);

            if(table.containsKey(current)){
                table.put(String.valueOf(x), table.get(String.valueOf(x))+1);
            }
            else{
                table.put(String.valueOf(x),1);
            }


        }
        if (table.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }

    }
}
