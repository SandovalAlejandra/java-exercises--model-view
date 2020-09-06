
package Modelo;

import java.text.DecimalFormat;

public class Obrero {
    private String nombre, actividad;
    private double pag, pagEx, total;
    private int hEx, horas;

    public Obrero(String nombre, String actividad, int horas) {
        this.nombre = nombre;
        this.actividad = actividad;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public String getInformation() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "Nombre: " + getNombre() + 
                "\nActividad realizada: " + getActividad() +
                "\nJornal Extra: " + pagoExtra() + 
                "\nJornal Total: " + df.format(pagoFinal()) +
                "\n__________________________________\n";
    }
    
    public int getHorasExtras() {
        if(horas > 40) {
            hEx = horas - 40;
        } else {
            hEx = 0;
        }
        
        return hEx;
    }
    
    public double pagoPorActividad() {
        switch(actividad) {
            case "Pintado" : pag = (horas-hEx)*10;
                break;
            case "Laqueado" : pag = (horas-hEx)*12 ;
                break;
            case "Barnizado" : pag = (horas-hEx)*14 ;
                break;
        }
        return pag;
    }
    
    public double pagoExtra() {
        switch(actividad) {
            case "Pintado" : pagEx = (getHorasExtras()*10)*1.3;
                break;
            case "Laqueado" : pagEx = (getHorasExtras()*12)*1.3;
                break;
            case "Barnizado" : pagEx = (getHorasExtras()*14)*1.3; ;
                break;
        }
        return pagEx;
    }
    
    public double pagoFinal() {
        return pagoPorActividad() + pagoExtra();
    }
    
    
}
