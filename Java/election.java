package Java;

import java.util.*;

public class election {

    public static void main(String[] args) {
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        hMap.put("6", 0); // Spoilt Votes
        String maxVoteCand = "None";
        int maxVotes = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter election votes (1-5) : ");

        String[] str = sc.nextLine().split(" ");

        for (String c : str) {
            int count = hMap.containsKey(c) ? hMap.get(c) : 0;
            hMap.put(c, count + 1);
        }

        for (Map.Entry<String, Integer> neta : hMap.entrySet()) {
            if (maxVotes < neta.getValue()) {
                maxVoteCand = neta.getKey();
                maxVotes = neta.getValue();
            }


        }

        System.err.println("Winner is candidate " + maxVoteCand);
        System.err.println("Spoilt votes are " + hMap.get("6"));
        sc.close();
    }
}
