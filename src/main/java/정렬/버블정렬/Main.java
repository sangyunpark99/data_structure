package 정렬.버블정렬;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,3,8,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for(int t = 0; t < arr.length; t++) {
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
    }
}
