/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadealertaestoque;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeAlertaEstoque {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         System.out.print("Quantidade do produto: ");
         int quant = leitor.nextInt();
         if(quant<5) System.out.print(" Aviso: necessario repor stock");
         else System.out.print(" Estoque adequado");
    }
}
