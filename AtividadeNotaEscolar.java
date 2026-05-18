/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadenotaescolar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeNotaEscolar {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        System.out.print("Insira sua nota: ");
        double nota = leitor.nextDouble();
        if(nota>=7) System.out.print("Aluno Aprovado");
        else System.out.print("Aluno Reprovado");
    }
}
