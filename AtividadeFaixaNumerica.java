/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadefaixanumerica;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeFaixaNumerica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double n = leitor.nextDouble();
        if (n>20 && n<50){
        System.out.print(" Sim, o numero pertence a faixa");                
        }
        else{
            System.out.print(" Nao, o numero nao pertence a faixa");
        }
    }
}
