package FichaPratica02;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();
        System.out.print("Introduza um numero: ");
        num2 = input.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " " + num2);
        if (num1 < num2)
            System.out.println(num2 + " " + num1);
    }
}
