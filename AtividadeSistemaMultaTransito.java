/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesistemamultatransito;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeSistemaMultaTransito {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print(" Insira a velocidade: ");
        int v = leitor.nextInt();
        if (v<=60){
            System.out.print(" Dentro do limite");
        }
        
        else if (v<=80) {
        System.out.print("Multa leve");
        }
        else if (v<=100) {
            System.out.print("Multa grave");
             }
    
        else if (v>100){
            System.out.print("Multa gravissima");
        }
               
    }
}
