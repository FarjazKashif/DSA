import java.util.*;

class App {
    public static void main(String args[]) {
        // Note: We cannot add same numbers in a set it'll consider as duplicate
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> newSet = new HashSet<>();
        // [10, 5, 3, 4, 3, 5, 6]
        set.add(10);set.add(5);set.add(3);set.add(4);set.add(3);set.add(5);set.add(6);
        for (int i=0; i<6; i++) {
            if(newSet.contains(set.cv))
        }
        System.out.print(set);
    }
}