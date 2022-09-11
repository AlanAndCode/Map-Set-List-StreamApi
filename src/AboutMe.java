import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args){
        try {
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            String idade = scanner.next();

            System.out.println("Digite sua altura(metros)");
            String alt = scanner.next();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + alt + "m");
            scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idades e altura precisam ser numericos");
        }
    }

}
