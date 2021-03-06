/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogpolimorfismo;

/**
 *
 * @author Gaby
 */
public class Cuadrado extends FiguraGeometrica{
    
    private double lado;
    
    public Cuadrado(double l){
        super("cuadrado");
        this.lado = l;
    }
    
    @Override
    public double getArea() {
        return this.lado * this.lado;
    }
    
    
    @Override
     public double getPerimetro() {
        return 4 * this.lado;
    }

    @Override
    public String toString() {
        return super.toString() + "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
    
}
