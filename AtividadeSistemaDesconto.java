/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesistemadesconto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeSistemaDesconto {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double compra = leitor.nextDouble();
        if (compra>500){        
        double vf1 = compra * 0.8; 
        System.out.print(vf1);
        }
        else if (compra>200){
        double vf2 = compra * 0.9;
        System.out.print(vf2);
        }
    }
}
