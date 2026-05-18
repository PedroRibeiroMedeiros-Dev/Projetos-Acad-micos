/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package idid.atividademinutosdeestudo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeMinutosDeEstudo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       System.out.print("informe a quantidade de horas estudadas no dia: ");
       double h = leitor.nextDouble();
       double m = h * 60;
       System.out.print(" O total de minutos estudados sera de:" + m);
    }
}
