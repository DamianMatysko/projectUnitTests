package Classes;

public class Text {
    public String reverse(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            newText += text.charAt((text.length()-1) - i);  // .charAt(text.length()-i);
        }
        return newText;
    }
}
