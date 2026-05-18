/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadediasvividos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeDiasVividos {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua idade:");
        int idade = leitor.nextInt();
        int dV = idade * 365;
        System.out.print(" Voce viveu aproximadamente" + dV + " dias");
       
    }
}
