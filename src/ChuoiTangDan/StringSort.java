package ChuoiTangDan;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSort {


    public static void main(String[] args) {
        ArrayList<Character>listString=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter String : ");
        String string= scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (listString.isEmpty()){
                listString.add(string.charAt(i));
                System.out.println("List isEmpty add ("+string.charAt(i)+")");
            }else {
                if (string.charAt(i)>listString.get(listString.size()-1)){
                    listString.add(string.charAt(i));
                    System.out.println(string.charAt(i)+ "  >  "+listString.get(listString.size()-1)+" Add ("+string.charAt(i)+")");
                }else {
                    System.out.println(string.charAt(i)+" < "+listString.get(listString.size()-1)+" No Add Array ");
                }
            }
        }
        System.out.println("Sort :");
        for (Character c :
                listString) {
            System.out.print(c);
        }


    }
}
