package relacion10.ejercicio2;

public class Articulo {
    private String codigo;
    private String descripcion;
    private int precioCompra;
    private int precioVenta;
    private int stock;

        //CONSTRUCTOR
    public Articulo(String codigo, String descripcion){
        this.codigo=codigo;
        this.descripcion=descripcion;
    }


        //GETTERS
    public String getCodigo(){
        return codigo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getPrecioCompra(){
        return precioCompra;
    }

    public int getPrecioVenta(){
        return precioVenta;
    }

    public int getStock(){
        return stock;
    }


        //SETTERS
    public void setPrecioCompra(int precioCompra){
        this.precioCompra=precioCompra;
    }

    public void setPrecioVenta(int precioVenta){
        this.precioVenta=precioVenta;
    }

    public void setStock(int stock){
        this.stock=stock;
    }

    @Override
    public String toString(){
        return "Código: "+codigo+" Descripción: "+descripcion;
    }
    
}
