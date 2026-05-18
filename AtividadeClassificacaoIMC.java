/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeclassificacaoimc;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeClassificacaoIMC {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print(" Insira o IMC: ");
        double imc = leitor.nextDouble();
        if (imc<18.5){
            System.out.print(" Abaixo do peso");
        }
        
        else if (imc<=24.5) {
        System.out.print(" Peso normal");
        }
        else if (imc<29.9) {
            System.out.print(" Sobrepeso");
             }
    
        else if (imc>=30){
            System.out.print(" Obesidade");
        }
       
    }
}
