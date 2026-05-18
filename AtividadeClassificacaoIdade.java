/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadefaixaetariadetalhada;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeFaixaEtariaDetalhada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print(" Insira sua idade: ");
        int idade = leitor.nextInt();
        if (idade<=2){
            System.out.print(" Bebe");
        }
        
        else if (idade<=12) {
        System.out.print("Crianca");
        }
        else if (idade<=17) {
            System.out.print("Adolescente");
             }
    
        else if (idade<=59){
            System.out.print("Adulto");
        }
            
        else if (idade>=60){
            System.out.print("Idoso");
        }
    }   
    }

