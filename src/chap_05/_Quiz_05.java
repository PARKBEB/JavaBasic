package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 신발 사이즈 옵션 출력 프로그램
        // 신발 사이즈는 250 ~ 290까지 5 단위로 증가
        // 신발 사이즈 수는 총 10 가지

        // 내 코드
        int[][] size = new int[5][2];
        int m = 250;
        int sum = 0;

        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i].length; j++) {
                size[i][j] = 250 + sum;
                if (size[i][j] > 290) {
                    break;
                }
                System.out.print(size[i][j] + " ");
                sum += 5;
            }
            System.out.println();
        }

        // 선생님 코드
        int[] sizeArray = new int[10];
        int x = 0;
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size2 : sizeArray) {
            System.out.println("사이즈" + size2 + " (재고있음)");
        }
    }
}
