import java.util.Scanner;

public class HelloWorld{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Me fale o seu nome, por favor? ");
        String nome = scanner.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome + ", Idade: " + idade + " Anos.");

        scanner.close();
    }
}
