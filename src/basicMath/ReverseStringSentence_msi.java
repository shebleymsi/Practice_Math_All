package basicMath;

public class ReverseStringSentence_msi {


    public static void main(String[] args) {

        reverseString("We are learning reverse string");

    }

    public static void reverseString(String name) {
        String reverse = "";
        for (int i = 0; i <= name.length()-1; i++) {
            reverse = name.charAt(i) + reverse;
        }
        System.out.println(reverse);

    }


}


