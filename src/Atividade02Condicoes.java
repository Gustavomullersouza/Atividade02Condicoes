import java.util.Scanner;

public class Atividade02Condicoes {

    public static void main(String[] args) {

        int nota = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota: " );
        nota = sc.nextInt();

        if (nota >= 9 )
            System.out.println("Excelente");
        else if (nota >= 7)
            System.out.println("Bom");
        else if (nota >= 5)
            System.out.println("Satisfatório");
        else if (nota < 5) {
            System.out.println("Insatisfatório");

        }

    }
}