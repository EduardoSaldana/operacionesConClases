



package aritmetica;

import common.operaciones;


public class Aritmetica {

    /*
     llamar metodos de otras clases que haga las operaciones matemáticas
     Clase operaciones:
        - Suma
        - Resta
        - Multiplicacion
        - Division
    */
    public static void main(String[] args) {
        System.out.println("OPERACIONES");
        operaciones o1 = new operaciones();
        operaciones o = new operaciones(o1.getNum1(),o1.getNum2());
        
        System.out.print("\nSuma: ");
        System.out.print(o.suma());
        System.out.print("\nResta: ");
        System.out.print(o.resta());
         System.out.print("\nMultiplicación: ");
        System.out.print(o.multiplicacion());
         System.out.print("\nDivisión: ");
        System.out.println(o.division());
        
    }
    
}
