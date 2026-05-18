/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package idid.atividadekmparacm;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeKmParaCm {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       System.out.print("informe a distancia em quilometros: ");
       double km = leitor.nextDouble();
       double cm = km * 100000;
       System.out.print(" A distancia em quilometros sera de:" + cm);
    }
}
