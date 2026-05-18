/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeantecessorsucessor;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeAntecessorSucessor {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero");
        int num1 = leitor.nextInt();
        int antecessor = num1 - 1;
        System.out.print("O antecessor desse numero e" + antecessor);
        int sucessor = num1 + 1;
        System.out.print(" O sucessor desse numero e:" + sucessor);
    }
}
