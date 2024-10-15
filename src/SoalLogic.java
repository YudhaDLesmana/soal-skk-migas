import java.util.Arrays;

public class SoalLogic {
    public static void main(String[] args) {
       soal1(15);
       soal2a(5);
       soal2b(5);
       soal2c(5);
       soal2d(5);
       soal3test();



    }
    public static void soal1(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("OKYES");
            } else if (i % 3 == 0) {
                System.out.print("OK ");
            } else if (i % 4 == 0) {
                System.out.print("YES ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    public static void soal2a(int n){
        for(int i = 1; i<=n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void soal2b(int n){
        for (int i = 1; i<=n; i++){
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void soal2c(int n){
        int p = 1;
        boolean inc = true;

        for (int i = 1; i<=n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                if (inc){
                    p++;
                } else{
                    p--;
                }
                if(p==n){
                    inc = false;
                }else if (p==1){
                    inc = true;
                }
            }
            System.out.println();
        }
    }
    public static void soal2d(int n){
        int[][] matrix = new int[n][n];
        int value = 1;

        for(int col = 0; col < n; col++ ) {

            if (col % 2 == 0) {
                for (int row = 0; row < n; row++)
                    matrix[col][row] = value++;
            } else {
                for (int row = n - 1; row >= 0; row--)
                    matrix[col][row] = value++;
            }
        }
        for(int col = 0; col < n; col++ ){
            for(int row = 0; row < n; row++) {
                System.out.print(matrix[row][col] + "\t");
            }

            System.out.println();
        }
    }
    public static void soal3(){
        int[] arr = {12,9,13,6,10,4,7,2};
        int[] new_arr = new int[5];
        for (int i = 0, k = 0; i < arr.length; i++){
            if (arr[i]%3 != 0){
                new_arr[k] = arr[i];
                k++;
            }
        }
        // bubble sort
        int n = new_arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if(new_arr[j] > new_arr[j+1]){
                    int temp = new_arr[j];
                    new_arr[j] = new_arr[j+1];
                    new_arr[j+1] = temp;
                }
            }
        }

        System.out.println("n = " + Arrays.toString(new_arr));
        System.out.println("n = " + Arrays.toString(arr));
    }
    public static void soal3test(){
        int[] arr = {12,9,13,6,10,4,7,2};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            if (arr[i]%3==0){
                n--;
            }
        }
        int [] new_arr = new int[n];
        for (int i = 0, k = 0; i < arr.length; i++){
            if (arr[i]%3 != 0){
                new_arr[k] = arr[i];
                k++;
            }
        }
        bubbleSort(new_arr);

        System.out.println("n = " + Arrays.toString(new_arr));
    }


    public static int[] bubbleSort(int[] arr){
        int s = arr.length;
        for (int i = 0; i < s - 1; i++){
            for (int j = 0; j < s - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}


