
package casa;

/**
 *
 * @author OTHONIEL
 */
public class casa {
     int habitaciones;
    String material;
    String color;
    String dueño;

public casa(){
    this.habitaciones=6;
    this.material="concreto";
    this.color="rojo";
    this.dueño="tony";
}

    public casa(int habitaciones, String material, String color, String dueño) {
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
