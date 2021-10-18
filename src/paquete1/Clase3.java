/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete1.*;
/**
 *
 * @author Alumno Mañana
 */
public class Clase3 extends Clase1 {
    //constructor
    public Clase3() {
        super();//invocamos al constructor vacio de la clase padre
        this.atributoProtegido = "Modificamos el atributo Protegido";
        System.out.println("Atributo protegido desde la hija: "+this.atributoProtegido);
        //Accediendo con this al metodo protegido de la Padre
        this.metodoProtegido();
        this.atributoDefault = "Modificamos el atributo Protegido";
        System.out.println("Atributo protegido desde la hija: "+this.atributoDefault);
        //Accediendo con this al metodo default de la Padre
        this.metodoDefault();
    }
    //a el atributo privado de la clase 1 no puedo acceder desde esta clase
    
}
