import java.util.ArrayList;
import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args){
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {new int[] {11, 12, 13},
                         new int[] {21, 22, 23},
                         new int[] {31, 32, 33}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2D));     //각 행의 주소값 나옴
        System.out.println(Arrays.deepToString(arr2D)); //각 행의 데이터 출력
        System.out.println("========================");

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("arr2 : " + Arrays.toString(arr2));
        System.out.println("========================");

        int[] arr3 = Arrays.copyOf(arr, 3);
        System.out.println("arr3 : " + Arrays.toString(arr3));
        System.out.println("========================");

        int[] arr4 = Arrays.copyOf(arr, 7);
        System.out.println("arr4 : " + Arrays.toString(arr4));
        System.out.println("========================");

        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("arr5 : " + Arrays.toString(arr5));
        System.out.println("========================");

        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
        System.out.println("arr6 : " + Arrays.toString(arr6));
        System.out.println("========================");

    }
}
