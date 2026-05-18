/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademultiplo7;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeMultiplo7 {

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite um numero inteiro: ");
    int n = leitor.nextInt();
    int resto = n % 7;
    if (resto==0){
        System.out.print(" Sim, o numero e multiplo de 7");
    }
    else{
        System.out.print(" O numero nao e multiplo de 7");
    }
    }
    }

