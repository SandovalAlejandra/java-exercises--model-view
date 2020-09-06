
package Modelo;


public class Empleado {
    private String nombre, categoria;
    private int hijos;
    private double bonificacion, aumentoHijos;

    public Empleado(String nombre, int hijos, String categoria) {
        this.nombre = nombre;
        this.hijos = hijos;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
     public String getInformacion(){
        
        return "Nombre: " + getNombre() +  "\ncategoria: " + Categoria() +
                "\nCantidad de Hijos: " + getHijos() +
                "\nBonificacionm: " + bonificacion +
                "\nPago Total: " + bonificacionTotal(bonificacion, aumentoHijos) +
                "\n__________________________________\n";
    }
     
     
    public double bonificacionTotal(double bonificacion, double aumentoHijos) {
        return (bonificacion + aumentoHijos);
    }
    
    public String Categoria(){
        switch(categoria) {
            case "OBRERO" :
                bonificacion=100;
                break;
            case "EMPLEADO" :
                bonificacion=120;
                break;
        }
    
        if(hijos>0)
            aumentoHijos=41*hijos;
        else 
           aumentoHijos=0;
            return categoria;
    }
  }
    

