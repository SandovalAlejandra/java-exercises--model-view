
package Modelo;

import java.text.DecimalFormat;


public class Trabajador {
    private String nombre,cargo;
    private double basico, total,asignacion,bon,re;
    

    public Trabajador(String nombre, String cargo,double basico) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.basico= basico;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getInformacion() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "Nombre: " + getNombre() + 
                "\nCargo: " + getCargo() + 
                "\nBasico: " + df.format(getBasico())+
                "\nAsignacion: " + df.format(getAsignacion())+
                "\nRefrigerio: " + df.format(getRefrigerio())+
                "\nBonificacion: " + df.format(getBonificacion())+
                "\nIngreso Total: " + df.format(getTotal()) +
                "\n__________________________________\n";
    }
    
    public double getAsignacion(){
         switch(cargo){
                case "Obrero":
                    asignacion=120;
                    break;
                case "Empleado":
                    asignacion=150;
                    break;
                case "Ejecutivo":
                    asignacion=500;
                    break;
         }
         return asignacion;
    }
        
    public double getBonificacion(){
         switch(cargo){
                case "Obrero":
                    bon=100;
                    break;
                case "Empleado":
                    bon=120;
                    break;
                case "Ejecutivo":
                    bon=250;
                    break;
         }
         return bon;
    }
    
    public double getRefrigerio(){
         switch(cargo){
                case "Obrero":
                    re=0;
                    break;
                case "Empleado":
                    re=200;
                    break;
                case "Ejecutivo":
                    re=250;
                    break;
         }
         return re;
    }
    
    public double getTotal() {
        total = getAsignacion() + getRefrigerio() + getBonificacion() + getBasico();
        return total;
    }
}
    