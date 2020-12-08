public class MultiplicationTable {
    void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            //System.out.println(number*i);
            System.out.println(number + "x" + i + "= " + (number * i));

        }
    }

    void printTable(int table, int from, int to) {
        for (int i = from; i <= to; i++)
            System.out.printf("%d * %d = %d ", table, i, table * i).println();
    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        mt.printTable(5);
        mt.printTable(6, 11, 20);
    }

}
