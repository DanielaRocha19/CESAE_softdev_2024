package FichaPratica01;
import java.util.Scanner;

public class Ex_09 { public static void main(String[] args) {

    // Importar dados
    Scanner input = new Scanner(System.in);

    double valorIliquido, dias, alimentaçao, irs, segSocialFuncionario, segSocialEP, valorLiquido;

    // Ler código do funcionário e dias de trabalho durante o mês
    System.out.print("Introduzir código de funcionário: ");
    int codigo = input.nextInt();
    System.out.print("Introduzir dias de trabalho durante o mês: ");
    dias = input.nextInt();

    // Calcular valores para apresentar no recibo
    valorIliquido = 40 * dias;
    alimentaçao = 5 * dias;
    irs = valorIliquido * 0.1;
    segSocialFuncionario = valorIliquido * 0.11;
    segSocialEP = valorIliquido * 0.2375;
    valorLiquido = valorIliquido + alimentaçao - irs - segSocialFuncionario;

    // Apresentar valores
    System.out.println("Valor ilíquido: "+ valorIliquido + "€");
    System.out.println("Valor do subsídio de alimentação: "+ alimentaçao + "€");
    System.out.println("Valor da retenção do IRS: " + irs + "€");
    System.out.println("Valor para a Segurança Social (11%): " + segSocialFuncionario + "€");
    System.out.println("Valor para a Segurança Social a cargo da entidade patronal (23,75%): " + segSocialEP + "€");
    System.out.println("Valor líquido: " + valorLiquido + "€");
}
}
