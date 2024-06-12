package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Introduza um salario: ");
        salario = input.nextDouble();

        double impostos20 = salario * 0.2;
        double impostos30 = salario * 0.3;
        double impostos35 = salario * 0.35;
        double impostos40 = salario * 0.4;


        if (salario < 15000)
            System.out.println("Paga taxa de 20%: " + impostos20);
        if (salario >= 15000 && salario < 20000)
            System.out.println("Paga taxa de 30%: " + impostos30);
        if (salario >= 20000 && salario < 25000)
            System.out.println("Paga taxa de 35%: " + impostos35);
        if (salario >= 25000)
            System.out.println("Paga taxa de 40%: " + impostos40);
    }
}
