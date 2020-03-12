import java.util.Scanner;

public class Converter {
    public void lettersToMorse () {
        Scanner input = new Scanner(System.in);
        char [] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', '?'};

        String [] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.", "...",
                "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---",
                "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
                "--..--", ".-.-.-", "..--.."};

        System.out.println(" This is an Letters to Morse Code Translator.  ");
        System.out.println(" Please enter what you would like translate ");
        System.out.println("             into Morse Code. ");
        System.out.println(" ============================================ ");

        //String userInput = keyboard.nextLine().toLowerCase();
        String userInput = input.nextLine().toLowerCase();

        char[] chars = userInput.toCharArray();

        String str = "";
        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < letters.length; j++){

                if (letters[j] == chars[i]){
                    str = str + morse[j] + " ";
                }
            }
        }
        System.out.println(str);
    }

    public static String decode (String toEncode) {
        String morse = toEncode;

        if (toEncode.equalsIgnoreCase(".-"))
            morse = "a";
        if (toEncode.equalsIgnoreCase("-..."))
            morse = "b";
        if (toEncode.equalsIgnoreCase("-.-."))
            morse = "c";
        if (toEncode.equalsIgnoreCase("-.."))
            morse = "d";
        if (toEncode.equalsIgnoreCase("."))
            morse = "e";
        if (toEncode.equalsIgnoreCase("..-."))
            morse = "f";
        if (toEncode.equalsIgnoreCase("--."))
            morse = "g";
        if (toEncode.equalsIgnoreCase("...."))
            morse = "h";
        if (toEncode.equalsIgnoreCase(".."))
            morse = "i";
        if (toEncode.equalsIgnoreCase(".---"))
            morse = "j";
        if (toEncode.equalsIgnoreCase("-.-"))
            morse = "k";
        if (toEncode.equalsIgnoreCase(".-.."))
            morse = "l";
        if (toEncode.equalsIgnoreCase("--"))
            morse = "m";
        if (toEncode.equalsIgnoreCase("-."))
            morse = "n";
        if (toEncode.equalsIgnoreCase("---"))
            morse = "o";
        if (toEncode.equalsIgnoreCase(".--."))
            morse = "p";
        if (toEncode.equalsIgnoreCase("--.-"))
            morse = "q";
        if (toEncode.equalsIgnoreCase(".-."))
            morse = "r";
        if (toEncode.equalsIgnoreCase("..."))
            morse = "s";
        if (toEncode.equalsIgnoreCase("-"))
            morse = "t";
        if (toEncode.equalsIgnoreCase("..-"))
            morse = "u";
        if (toEncode.equalsIgnoreCase("...-"))
            morse = "v";
        if (toEncode.equalsIgnoreCase(".--"))
            morse = "w";
        if (toEncode.equalsIgnoreCase("-..-"))
            morse = "x";
        if (toEncode.equalsIgnoreCase("-.--"))
            morse = "y";
        if (toEncode.equalsIgnoreCase("--.."))
            morse = "z";
        if (toEncode.equalsIgnoreCase("-----"))
            morse = "0";
        if (toEncode.equalsIgnoreCase(".----"))
            morse = "1";
        if (toEncode.equalsIgnoreCase("..---"))
            morse = "2";
        if (toEncode.equalsIgnoreCase("...--"))
            morse = "3";
        if (toEncode.equalsIgnoreCase("....-"))
            morse = "4";
        if (toEncode.equalsIgnoreCase("....."))
            morse = "5";
        if (toEncode.equalsIgnoreCase("-...."))
            morse = "6";
        if (toEncode.equalsIgnoreCase("--..."))
            morse = "7";
        if (toEncode.equalsIgnoreCase("---.."))
            morse = "8";
        if (toEncode.equalsIgnoreCase("----."))
            morse = "9";
        if (toEncode.equalsIgnoreCase(" "))
            morse = "/";

        return morse;
    }

    public void morseToLetters() {
        System.out.println(" This is a Morse to Letters Code Translator.  ");
        System.out.println(" Please enter the morse you would like translate ");
        System.out.println("             into English Code. ");
        System.out.println(" ============================================ ");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String newEnglish = ""; //sets string for newEnglish
        String selectedEnglish; //sets string for selectedEnglish
        String convertedEnglish; //sets string for convertedEnglish
        String[] morseChars = text.split(" ");

        for (int i = 0; i < morseChars.length; i++)
        {
            //Select the next Morse character
            selectedEnglish = morseChars[i];
            boolean endsWithWordSeparator = selectedEnglish.endsWith("|");
            if(endsWithWordSeparator) selectedEnglish = selectedEnglish.substring(0, selectedEnglish.length() - 1);
            // Convert the string
            convertedEnglish = decode(selectedEnglish);

            newEnglish = newEnglish + convertedEnglish;
            if (endsWithWordSeparator)
            {
                newEnglish = newEnglish + " ";
            }
        }
        System.out.print(newEnglish);
        System.out.println();
    }
}
