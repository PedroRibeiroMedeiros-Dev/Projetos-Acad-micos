/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadealarme;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeAlarme {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         System.out.print("Insira a temperatura da caldeira: ");
         double temp = leitor.nextDouble();
         if(temp>35) System.out.print(" PERIGO: Sobreaquecimento");
         else System.out.print(" Temperatura normal");
    }
}
