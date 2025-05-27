public class Producto {
    private int codigo;
    private String nombre;
    private  int stock;
    private int precio;

    public Producto(int codigo, String nombre, int stock, int precio) {

        this.codigo = codigo;
        this.nombre = nombre;
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Advertencia: El stock no puede ser negativo. Se establece en 0.");
            this.stock = 0;
        }

        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Advertencia: El precio debe ser mayor que 0. Se establece en 1.0.");
            this.precio = 1;
        }
    }

    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida. Debe ser mayor que 0.");
        } else if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada. Stock restante: " + stock);
        } else {
            System.out.println("No hay stock suficiente para realizar la venta.");
        }
    }
    // Método para reponer stock
    public void reponer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Stock actualizado. Nuevo stock: " + stock);
        } else {
            System.out.println("Cantidad inválida para reponer.");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(int nuevoPrecio) {
        if (nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
        } else {
            System.out.println("El precio debe ser mayor que 0.");
        }
    }
}
