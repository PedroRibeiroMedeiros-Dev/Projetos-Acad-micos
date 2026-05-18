/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeclassificacaonumero;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeClassificacaoNumero {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = leitor.nextInt();
        if (n>0){
            System.out.print(" Positivo");
        }
        else if (n<0){
            System.out.print(" Negativo");
        }
        else {
            System.out.print("Zero");
        }
    }
}
