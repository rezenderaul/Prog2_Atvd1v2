/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author raulrezende
 */
public class Triangulo extends Poligono {
    
    public Triangulo() {
        sides = 3;
        form = "Triângulo";
    }

    @Override
    public double area() {
        return base * height / 2;
    }
    
}
