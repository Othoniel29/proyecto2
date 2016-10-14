
package vivienda;

import casa.casa;
import departamento.departamento;
/**
 *
 * @author OTHONIEL
 */
public class Vivienda {

    public static void main(String[] args) {
        // TODO code application logic here
        casa mivivienda = new casa();
        casa mivivienda2 = new casa(8,"madera","azul","raymond");
        System.out.println(mivivienda.getHabitaciones());
        System.out.println(mivivienda.getMaterial());
        System.out.println(mivivienda.getColor());
        System.out.println(mivivienda.getDueño());
        System.out.println("-----------------------");
        System.out.println(mivivienda2.getHabitaciones());
        System.out.println(mivivienda2.getMaterial());
        System.out.println(mivivienda2.getColor());
        System.out.println(mivivienda2.getDueño());
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        departamento midepartamento = new departamento();
        departamento midepartamento2 = new departamento(6,"cpncreto","plata","iker");
        System.out.println(midepartamento.getHabitaciones());
        System.out.println(midepartamento.getMaterial());
        System.out.println(midepartamento.getColor());
        System.out.println(midepartamento.getDueño());
        System.out.println("-----------------------");
        System.out.println(midepartamento2.getHabitaciones());
        System.out.println(midepartamento2.getMaterial());
        System.out.println(midepartamento2.getColor());
        System.out.println(midepartamento2.getDueño());
    }    
}
