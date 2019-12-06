import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner run = new Scanner(System.in);
        String rerun;
        do {
            System.out.println("This program converts English to Morse code and visa versa,");
            System.out.println("   please press 1 to convert English to morse code and");
            System.out.println("          2 to convert Morse code to English.");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    LettersToMorseCode letter = new LettersToMorseCode();
                    letter.lettersToMorse();
                    break;
                case 2:
                    MorseCodeToLetters morse = new MorseCodeToLetters();
                    morse.morseToLetters();
                    break;
            }
            System.out.println("Type 'yes' to run again or any key to exit");
            rerun = run.nextLine();
        }while (rerun.equalsIgnoreCase("Yes"));
    }
}
