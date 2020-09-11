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
public abstract class Poligono {
    
    protected String form;
    protected int sides;
    protected double base;
    protected double height;

    public String printSides() {
        return "Números de lados: " + sides;
    }
    
    @Override
    public String toString(){
        return "Forma: " + form + "\n"
                + printSides() + "\n"
                + "Lados: " + sides + "\n"
                + "Base: " + String.format("%.2f", base) + "\n"
                + "Altura: " + String.format("%.2f", height) + "\n"
                + "Área: " + String.format("%.2f", area()) + "\n";
    }
    
    public abstract double area();

    public void setSides(int sides) {
        this.sides = sides;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
}
