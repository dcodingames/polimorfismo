/*
 * d.CodinGames.com
 * Clase que ejemplifica polimorfismo estático y polimorfismo dinámico.
 */
package blogpolimorfismo;

/**
 *
 * @author Gaby Nieva Paredes  - dCodinGames.com
 */
public class BlogPolimorfismo {

     public static void main(String[] args) {
        // Polimorfismo estático
        Clase objeto = new Clase();
        System.out.println("Resultado del llamado a sumar: " + objeto.sumar(1,2));
        System.out.println("Resultado del llamado a sumar: " + objeto.sumar(1,2,3));
        
        // Polimorfismo dinámico
        FiguraGeometrica unaFigura = new FiguraGeometrica("una figura");
        Cuadrado unCuadrado = new Cuadrado(20);
        System.out.println("Area del cuadrado: " + unCuadrado.getArea());
        unCuadrado.setArea(unCuadrado.getArea());
        System.out.println(unaFigura.toString());
        System.out.println(unCuadrado.toString());
        
        // Otro ejemplo de polimorfismo dinámico
        FiguraGeometrica c = new Cuadrado(20);
        System.out.println("Área del cuadrado: " + c.getArea());
        
    }
    
}
