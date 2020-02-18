package Classes;

public class Information {
    public String convertToBinary(int x) {
        //return Integer.toBinaryString(x);
        int number = x;
        String result = "";
        while (number >= 1) {
            if (number % 2 == 0) {
                result += 0;
            } else {
                result += 1;
            }
            number = number / 2;
        }
        Text text = new Text();
        return text.reverse(result);
    }
}
