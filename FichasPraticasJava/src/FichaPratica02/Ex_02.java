package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Introduza um salario: ");
        salario = input.nextDouble();

        double impostos20 = salario * 0.2;
        double impostos30 = salario * 0.3;

        if (salario <= 15000)
            System.out.println("Paga taxa de 20%: " + impostos20);
        else
            System.out.println("Paga taxa de 30%: " + impostos30);
    }
}
