import java.util.Arrays;

class Item implements Comparable<Item> {
    int profit, weight;
    double ratio;

    Item(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
        this.ratio = (double) profit / weight;
    }

    public int compareTo(Item other) {
        return Double.compare(other.ratio, this.ratio);
    }
}

public class FractionalKnapsack {

    public static double knapsack(Item[] items, int capacity) {
        Arrays.sort(items);

        double totalProfit = 0.0;

        for (Item item : items) {
            if (capacity == 0)
                break;

            if (item.weight <= capacity) {
                totalProfit += item.profit;
                capacity -= item.weight;
            } else {
                totalProfit += item.ratio * capacity;
                capacity = 0;
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {

        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        int capacity = 50;

        double maxProfit = knapsack(items, capacity);

        System.out.println("Maximum Profit : " + maxProfit);
    }
}
