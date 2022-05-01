package home_work_2.sorts;

public class SortsUtils {
    public static int[] bubble(int[] arr){
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        int[] arrSort = new int[arr.length];
        for (int t = 0; t < arrSort.length; t++) {
            arrSort[t] = arr[t];
        }
        return arrSort;
    }
}
