public class Main {

    public static void main(String[] args) {
        System.out.println("Addition Program ");

        int size = args.length;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("The " + i + "th argument value is " + args[i]);
            sum = sum + Integer.parseInt(args[i]);

        }

        System.out.println("The sum is : " + sum);

    }
}
