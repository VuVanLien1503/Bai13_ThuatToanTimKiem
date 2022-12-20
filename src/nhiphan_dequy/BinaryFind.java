package nhiphan_dequy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BinaryFind {
    Scanner scanner=new Scanner(System.in);
   static ArrayList<Integer>list;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("element " + i + " :");
            list.add(Integer.parseInt(scanner.nextLine()));
            Collections.sort(list);
        }

    }

}