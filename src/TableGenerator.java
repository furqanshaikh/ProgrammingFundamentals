public class TableGenerator {

    public static void main(String[] args) {
        int table = 3;

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
