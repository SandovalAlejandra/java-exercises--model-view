
package Modelo;

import java.text.DecimalFormat;

public class Vendedor {
    private double monto,comision;
    private String nombre ;

    public Vendedor(double monto, String nombre) {
        this.monto = monto;
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getInformacion(){
         DecimalFormat df = new DecimalFormat("#0.00");
         return "Nombre: " + getNombre() + "\nVenta: " + df.format(getMonto())+
                "\nComision: " +  df.format(getComision()) +
                "\n__________________________________\n";
    }
    
    public double getComision(){
        if(monto<=10000)
             comision=monto*0.05;
         else if (monto>=10000 && monto<=50000)
              comision=(monto*0.075)+200;
         else if (monto>50000)
             comision=(monto*0.09)+300;
        return comision;
    }
    
}
