/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejogoadivinha;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeJogoAdivinha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         System.out.print("Insira um numero de 1 a 10: ");
         int segredo = leitor.nextInt();
         if(segredo==7) System.out.print(" Parabens, ganhou");
         else System.out.print(" Errou, tente denovo");
    }
}
