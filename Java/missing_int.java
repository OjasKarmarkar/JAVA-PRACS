package Java;
import java.util.*;

class MissingInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements : ");

        String[] str = sc.nextLine().split(" ");
        boolean[] present = new boolean[10000];
        int maxele = Integer.MIN_VALUE;

        for (int i=0; i<str.length; i++){
            int ele = Integer.parseInt(str[i]);

            if(ele>0 && ele<=str.length){
                present[ele] = true;

            }
            maxele = Math.max(maxele, ele);
        }

        for (int i = 1; i < present.length; i++)
            if (!present[i]){
                System.out.println("Number " + i + " Not present");
                System.exit(0);
                break;

            }

        System.out.println("Number " + (maxele+1) + "Not present");
        sc.close();
    }

}
