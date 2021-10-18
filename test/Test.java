/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import paquete1.*;

/**
 *
 * @author Alumno Mañana
 */
public class Test {
    public static void main(String[] args) {
                //la clase1 es de tipo default y no puedo acceder desde la clase principal(main) a la clase1
            Clase1 c1 = new Clase1();
            System.out.println(c1.atributoPublico);
            c1.metodoPublico();
                //la clase 3 es publica y por ende puedo acceder desde la clase principal
              Clase3 Clasehija = new Clase3();
              System.out.println("ClaseHija"+Clasehija);
              
    }
}
