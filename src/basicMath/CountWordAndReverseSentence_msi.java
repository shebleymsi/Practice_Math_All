package basicMath;

public class CountWordAndReverseSentence_msi {

    public static void main(String[] args) {

        getCountOfTheWordsAndReverseSentence("Eid Mubarak to Everyone and love you all");

    }

    public static void getCountOfTheWordsAndReverseSentence(String sentence) {

        int count = 1;
        String reverse = "";

        for (int i = 0; i < sentence.length(); i++) {
            reverse = sentence.charAt(i) + reverse;
            if ((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in String : " + count);
        System.out.println(reverse);

    }


}


