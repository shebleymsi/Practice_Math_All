package basicMath;

public class CountWord {


    public static void main(String[] args) {

        getCountOfTheWords();

    }


    public static void getCountOfTheWords() {
       // Scanner input = new Scanner(System.in);
        String str="Eid Mubarak to Every one";
    //   System.out.println("Enter your String");
      //  String str = input.nextLine();

        String name=" ";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            // && (str.charAt(i + 1) != ' ')
                // E == ' '
            if (   (str.charAt(i) == ' '  )  &&    (str.charAt(i + 1) != ' ')    ) {
                count++;

            }
        }
        System.out.println("Number of words in String : " + count);

    }


}
