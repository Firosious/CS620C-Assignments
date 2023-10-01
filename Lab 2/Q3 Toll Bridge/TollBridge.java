public class TollBridge {
    public static void main(String args[]) {

        char vehicle = 'c';

        if (vehicle == 'c') {
            System.out.println("Car - 2.00");
        } else if (vehicle == 'm') {
            System.out.println("Motorbike - 1.10");
        } else if (vehicle == 'b') {
            System.out.println("Bus - 4.25");
        } else if (vehicle == 't') {
            System.out.println("Truck - 6.70");
        } else {
            System.out.println("Van - 4.00");
        }

    }
}
