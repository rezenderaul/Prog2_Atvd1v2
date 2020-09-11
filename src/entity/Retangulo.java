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
public class Retangulo extends Poligono {
    
    public Retangulo(){
        sides = 2;
        form = "Retângulo";
    }
    
    @Override
    public double area() {
        return base * height;
    }   
        
}
