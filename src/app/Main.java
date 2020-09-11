/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Retangulo;
import entity.Triangulo;
import java.util.Scanner;

/**
 *
 * @author raulrezende
 */
public class Main {
    
    public static void main (String Args[]) {
        
        boolean exit = false;
        int option;
        
        Scanner input = new Scanner(System.in);
        Retangulo rectangle = new Retangulo();
        Triangulo triangle = new Triangulo();
        
        while (exit == false)
        {
            System.out.println("###########################");
            System.out.println("##### Calculo de Área #####");
            System.out.println("###########################");
            System.out.println("0 - Sair");
            System.out.println("1 - Retângulo");
            System.out.println("2 - Triângulo");
            
            option = input.nextInt();
            
            switch (option){
                
                case 0:
                    exit = true;
                    break;

                case 1:
                    System.out.println("Digite a quantidade de lados: ");
                    rectangle.setSides(input.nextInt());

                    System.out.println("Digite o tamanho da base: ");
                    rectangle.setBase(input.nextDouble());

                    System.out.println("Digite a altura: ");
                    rectangle.setHeight(input.nextDouble());

                    System.out.println("\n" + rectangle);
                    break;

                case 2:
                    System.out.println("Digite a quantidade de lados: ");
                    triangle.setSides(input.nextInt());

                    System.out.println("Digite o tamanho da base: ");
                    triangle.setBase(input.nextDouble());

                    System.out.println("Digite o altura: ");
                    triangle.setHeight(input.nextDouble());

                    System.out.println("\n" + triangle);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
    
        }
        input.close();
    }
    
}
