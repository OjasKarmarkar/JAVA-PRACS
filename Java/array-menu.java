package Java;

import java.util.*;

class ArrMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements : ");

        String[] str = sc.nextLine().split(" ");
        List<Integer> arr = new ArrayList<Integer>();

        for(String c : str){
            arr.add(Integer.parseInt(c));
        }

        System.out.println(
                "Enter any of the choices below : \n1. Search Element \n2. Sort in Desc \n3. Delete Duplicates");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:

                System.out.print("Enter number to seach : ");
                int a = sc.nextInt();
                if (arr.indexOf(a) == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("Number found at " + arr.indexOf(a));
                }
                break;

            case 2:

                arr.sort(Comparator.reverseOrder());
                System.out.print("Sorted array : ");
                for (int i : arr){
                    System.out.print(i + " , ");
                }
                break;

            case 3:

                Set<Integer> x = new HashSet<>();
                x.addAll(arr);
                for (int i : x){
                    System.out.print(i + " , ");
                }
                break;

            default:
                break;
        }
        sc.close();
    }

}
