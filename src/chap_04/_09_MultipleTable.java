package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단

        for (int i = 2; i <= 9; i++) {
            System.out.println();
            System.out.println("[" + i + "단" + "]");
            for (int j = 1; j <= 9; j++) {
                int k = i * j;
                System.out.println(i + " x " + j + " = " + k);
                // System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
