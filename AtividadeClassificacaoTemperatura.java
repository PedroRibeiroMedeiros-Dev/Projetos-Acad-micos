/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeclassificacaotemperatura;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeClassificacaoTemperatura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a temperatura: ");
        int n = leitor.nextInt();
        if (n<15){
            System.out.print(" Frio");
        }
        else if (n>30){
            System.out.print(" Calor");
        }
        else if (n>15) {
            System.out.print(" Clima Agradavel");
        }
    }
}
