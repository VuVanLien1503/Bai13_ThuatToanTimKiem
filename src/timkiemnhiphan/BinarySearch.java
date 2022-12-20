package timkiemnhiphan;

import java.util.Scanner;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static String binarySearch(int[]list,int key){
        int low=0;
        int high=list.length-1;
        while (high>=low){
            int mid =(low+high)/2;
            if (key>list[mid]){
                low=mid+1;
            }else if (key==list[mid]){
                return "Index = "+ mid;
            }else {
                high=mid-1;
            }
        }
        return " No Find "+key;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        for (int list :
                list) {
            System.out.print(list+" ");
        }
        do {
            System.out.println();
            System.out.println("Enter Number Want Find : ");
            choice=Integer.parseInt(scanner.nextLine());
            System.out.println(binarySearch(list,choice));
            System.out.println("0. Exit");
        }while (choice!=0);
      }

}
