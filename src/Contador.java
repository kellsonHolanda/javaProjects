import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        contagem();
    }

    static void contagem() throws ParametrosInvalidosException {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite dois números. O primeiro deve ser menor que o segundo.");
            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            scanner.close();
            if (num1 > num2) {
                throw new ParametrosInvalidosException(num1, num2);
            }
            System.out.println("Excelente! Foram digitados os números " + num1 + " " + "e" + " " + num2);
            System.out.println("De " + num1 + " até o " + num2 + " temos os seguintes números: ");
            for (int lista = num1; lista <= num2; lista++) {
                System.out.print(lista + " ");
            }
        } catch (InputMismatchException i) {
            System.out.println("Ocorreu um erro.");
            System.out.println("Por favor, digite apenas algarismos numéricos e inteiros.");
            System.out.print("Vamos começar novamente?");
            contagem();
        } catch (ParametrosInvalidosException i) {
            System.out.println("Vamos começar novamente?");
            

        }
    }
}
