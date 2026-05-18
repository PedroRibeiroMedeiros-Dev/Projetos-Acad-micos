/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesistemacompras;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeSistemaCompras {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        double total = 0;
        int quantidade = 0;
        double valor;
        
        do {
            System.out.print("Digite o valor do produto: ");
            valor = leitor.nextDouble();
            
            if (valor != -1) {
                total = total + valor;
                quantidade = quantidade + 1;
            }
            
        } while (valor != -1);
        
        System.out.println("Total da compra: R$ " + total);
        System.out.println("Quantidade de produtos: " + quantidade);
        
    }
}
    


