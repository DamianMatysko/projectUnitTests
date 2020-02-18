package Classes;

public class Main {
    public static void main(String[] args) {
        MyMath myMath= new MyMath();
        System.out.println(myMath.isExistingTriangle(5,5,5));
        System.out.println(myMath.isPrimeNumber(100));
        int[] arr = {10, 23, 23};
        System.out.println(myMath.min(arr));

        Information information = new Information();
        System.out.println(information.convertToBinary(1372987932));
    }
}
