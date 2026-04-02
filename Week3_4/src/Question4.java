import java.util.*;

class Asset {
    String name;
    int returnRate;

    Asset(String n, int r) {
        name = n;
        returnRate = r;
    }
}

public class Question4 {
    public static void main(String[] args) {

        List<Asset> list = new ArrayList<>();
        list.add(new Asset("AAPL", 12));
        list.add(new Asset("TSLA", 8));
        list.add(new Asset("GOOG", 15));

        // Merge sort (using sort)
        list.sort(Comparator.comparingInt(a -> a.returnRate));

        System.out.println("Ascending:");
        for (Asset a : list)
            System.out.println(a.name + ":" + a.returnRate);

        // Desc
        list.sort((a, b) -> b.returnRate - a.returnRate);

        System.out.println("\nDescending:");
        for (Asset a : list)
            System.out.println(a.name + ":" + a.returnRate);
    }
}