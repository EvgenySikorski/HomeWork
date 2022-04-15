package test_02;

public class test_17 {
    public static void main(String[] args) {
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        for (int y = 0, z = 0; z < x.length; z++)
         //   int y = 0; for(y : x) {
       // int y = 0; for(int z=0; z<x.length; z++) { y = x[z];
           // for(int y=0, int z=0; z<x.length; z++) { y = x[z];
            //   for(int y : x) {
          //  /       for(x : int y) {

                {
            y = x[z];
            System.out.println(y + " ");

        }
    }



}
