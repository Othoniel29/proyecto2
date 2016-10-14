
package departamento;

/**
 *
 * @author OTHONIEL
 */
public class departamento {
   int habitaciones;
    String material;
    String color;
    String dueño;

public departamento(){
    this.habitaciones=3;
    this.material="triplai";
    this.color="gris";
    this.dueño="othoniel";
}

    public departamento(int habitaciones, String material, String color, String dueño) {
        this.habitaciones = habitaciones;
        this.material = material;
        this.color = color;
        this.dueño = dueño;
    }
   public int getHabitaciones() {
        return habitaciones;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getDueño() {
        return dueño;
    } 
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    } 
}
