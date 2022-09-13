import java.util.Scanner;

class HelloWorld {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char word;
        String crop = "";
        String senc;

        System.out.println("Enter some text");
        senc = sc.nextLine();
        System.out.println("Enter a alphabet to crop");
        word = sc.next().charAt(0);
        sc.close();
        for (int i = 0; i < senc.length(); i++) {
            if (senc.charAt(i) == word) {
                crop = senc.substring(i + 1, senc.length());
                break;
            } else if (senc.charAt(i) != word) {
                crop = "The letter does not exist in the sentence";
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Here is the text after sliced : " + crop);
        System.out.println("---------------------------------------");

    }
}