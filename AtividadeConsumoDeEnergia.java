/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package idid.atividadeconsumodeenergia;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeConsumoDeEnergia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       System.out.print("Informe a potencia do aparelho: ");
       double potencia = leitor.nextDouble();
       System.out.print(" Informe as horas de uso do aparelho:  ");
       double h = leitor.nextDouble();
       double consumo = (potencia * h)/1000;
       System.out.print(" O consumo do aparelho sera de:" + consumo);
    }
}
