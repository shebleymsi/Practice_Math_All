package basicMath;

public class ReverseStringWord_msi {

    public static void main(String[] args) {

        String name = "rahol";

        reverseString1("Shebley");

    }

    public static void reverseString1(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
            // System.out.print(name.charAt(i));
        }
        System.out.println(reverse);

    }
}

