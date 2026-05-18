/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package idid.atividadeareatrapezio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeAreaTrapezio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       System.out.print("informe o valor da base maior do trapezio: ");
       double bA = leitor.nextDouble();
       System.out.print(" inforome o valor da base menor do trapezio: ");
       double bB = leitor.nextDouble();
       System.out.print(" Informe a altura do trapezio: ");
       double h = leitor.nextDouble();
       double aT = (bA + bB) * h /2;
       System.out.print(" A area do trapezio sera de" + aT);
     
    }
}
