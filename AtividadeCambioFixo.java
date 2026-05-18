/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadecambiofixo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeCambioFixo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor em reais: ");
        double reais = leitor.nextDouble();
        double dolar = reais * 5;
        System.out.print(" O valor em dolar sera de:" + dolar);
    }
        
        
       
}
