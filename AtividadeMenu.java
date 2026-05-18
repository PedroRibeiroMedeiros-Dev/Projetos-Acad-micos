/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademenu;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeMenu {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int esc;
        do {
            
            System.out.print(" O que voce deseja fazer: 1-Jogar, 2-Opcoes ou 3-Sair");
             esc = leitor.nextInt();
             
        }
            while (esc!=3);
        System.out.print("Saindo...");
}

}

        
        
    
