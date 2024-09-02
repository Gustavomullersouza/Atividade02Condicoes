import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Atividade01Condicoes {
    public static void main(String[] args) {

        int idade = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade : " );
        idade = sc.nextInt();

        if(idade > 17)
            System.out.println("Essa pessoa é de maior ");

        else
            System.out.println("Essa pessoa é de menor ");


    }

}

