
package Modelo;

import java.text.DecimalFormat;

public class Zapatilla {
    private int talla, cantidad;
    private String marca;
    private double precioFinal, precioDescuento, precioMarca;

    public Zapatilla(int talla, int cantidad, String marca) {
        this.talla = talla;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getInformation() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "\nMarca: " + getMarca() +
                "\nTalla: " + getTalla()+
                "\nCantidad: " + getCantidad()+
                "\nPrecio inicial: " + df.format(precioMarca())+
                "\nDescuento: " + df.format(precioDescuento()) +
                "\nPrecio final: " + df.format(precioFinal()) +
                "\n__________________________________\n";
    }
    
    
    public double precioMarca() {
        switch(marca) {
            case "Nike":
                switch(talla) {
                    case 38: precioMarca = 150;
                        break;
                    case 40: precioMarca = 160;
                        break;
                    case 42: precioMarca = 160;
                        break;
                }
                break;
            case "Adidas":
                switch(talla) {
                    case 38: precioMarca = 140;
                        break;
                    case 40: precioMarca = 150;
                        break;
                    case 42: precioMarca = 150;
                        break;
                }
                break;
            case "Fila":
                switch(talla) {
                    case 38: precioMarca = 80;
                        break;
                    case 40: precioMarca = 85;
                        break;
                    case 42: precioMarca = 90;
                        break;
                }
                break;
        }
        return precioMarca*cantidad;
    }
    
    public double precioDescuento() {
        if(cantidad>=2 && cantidad<=5) {
            precioDescuento = (precioMarca())*0.05;
        } else if(cantidad>=6 && cantidad<=10) {
            precioDescuento = (precioMarca())*0.08;
        } else if(cantidad>=11 && cantidad<=20) {
            precioDescuento = (precioMarca())*0.1;
        } else if(cantidad>20) {
            precioDescuento = (precioMarca())*0.15;
        } else {
            precioDescuento = precioMarca();
        }
        return precioDescuento;
    }
    
    public double precioFinal() {
        return precioMarca() - precioDescuento();
    }
    
}
