import java.util.*;

public class SortCity {

    public static void main(String[] args) {
        City[] cities = new City[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            double area = sc.nextDouble();
            int pop = sc.nextInt();
            cities[i] = new City(name, area, pop);
        }

        bubbleSortCity(cities);
        printCityArray(cities);
        sc.close();
    }

    public static void bubbleSortCity(City data[]) {
        int n = data.length;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j].getPop() < data[j + 1].getPop()) {
                    City temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void printCityArray(City data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());
            if (i != data.length - 1) {
                System.out.print("");
            }
        }
    }
}
