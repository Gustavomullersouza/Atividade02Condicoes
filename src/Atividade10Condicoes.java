import java.util.Scanner;

public class Atividade10Condicoes {
    public static void main(String[] args) {

        double valorOriginal;
        double desconto = 0d;
        double valorDescontado;
        double percentualdesconto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        valorOriginal = sc.nextDouble();

        if (valorOriginal > 500) {
            desconto = valorOriginal - (20 / 100);
        } else if (valorOriginal > 200) {
            desconto = valorOriginal - (10 / 100);
        } else if (valorOriginal > 100) {
            desconto = valorOriginal - (5 / 100);
        }else
            System.out.println("Não teve desconto");

        percentualdesconto = desconto / 100;
        valorDescontado = valorOriginal - percentualdesconto;
        System.out.println("Valor Original: " + valorOriginal + "O persentual de desconto é " + percentualdesconto + "o valor do desconto é: " + desconto + "Valor final é: " + valorDescontado);







    }






}
