/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademetrosparacentimetros;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeMetrosParaCentimetros {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a distancia em metros: ");
        double metros = leitor.nextDouble();
        double centimetros = metros * 100;
        System.out.print("A distancia em centimetros sera:" + centimetros);
        
        
    }
}
