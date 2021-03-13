public class TableGenerator {

    public static void main(String[] args) {
        int table = 3;
        float per = 34.98f;

        System.out.printf("The float value is %f %n %n" , per);

//        for (int i = 1; i <= 10; i++) {
//            String str = table + " x " + i + " = " + table * i;
//            System.out.println(str);
//        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d",table, i, table * i);
            System.out.println();
        }

    }

}
