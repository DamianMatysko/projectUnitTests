package Tests;

public class MyMath {
    public boolean isPrimeNumber(int x) {
        for (int i=x-1;x==2;i--){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }

    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public boolean isExistingTriangle(int a, int b, int c) {
        return a > b + c && b > a + c && c > a + b;
    }

}
