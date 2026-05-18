/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesenhaincorreta;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeSenhaIncorreta {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int senhaC = 1234;
        int senhaD;
        
        System.out.print(" Digite a senha: ");
        senhaD = leitor.nextInt();
        while (senhaD != senhaC)
                {
                    System.out.println(" Senha incorreta, tente novamente: ");
                    senhaD = leitor.nextInt();
                }
        System.out.print(" Senha correta, acesso liberado");
    }
}
