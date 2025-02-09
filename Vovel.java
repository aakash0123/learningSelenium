public class Vovel {
    public static void main(String[] args) {
        char alphabet = 'a';

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {

            System.out.println("Vovel");

        } else if (alphabet == 'b' || alphabet == 'c' || alphabet == 'd' || alphabet == 'f' || alphabet == 'j'
                || alphabet == 'k' || alphabet == 'l' || alphabet == 'm' || alphabet == 'n' || alphabet == 'p'
                || alphabet == 'q' || alphabet == 'r' || alphabet == 's' || alphabet == 't' || alphabet == 'v'
                || alphabet == 'w' || alphabet == 'x' || alphabet == 'y' || alphabet == 'z') {

            System.out.println("Consonent");

        } else {

            System.out.println("Invalid");
        }

    }

}
