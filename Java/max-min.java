package Java;
import java.util.*;

class MaxMin {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4,2,10,5,6);
        int max = 0;
        int min = 0;

        arr.sort(Comparator.naturalOrder());
        for (int i=1 ; i< arr.size(); i++){
            max+=arr.get(i);
        }

        for (int i=0 ; i< arr.size()-1; i++){
            min+=arr.get(i);
        }

        System.out.println(max + " " + min);

    }
}