public class empleado {
    private String nombre;
    private String cargo;
    private int sueldobase;

    public empleado(String nombre, String cargo, int sueldobase) {
        this.nombre = nombre;
        this.cargo = cargo;
        if(sueldobase<0) {
            System.out.println("Error el sueldo base no puede ser negativo, se establecera a 0");
            this.sueldobase = 0;
        }else{
            this.sueldobase = sueldobase;
        }
    }
    public double getSueldoFinal() {
        if (cargo.equalsIgnoreCase("Jefe")) {
            return sueldobase * 1.20; // 20% más
        } else {
            return sueldobase;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSueldobase() {
        return sueldobase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldobase(int sueldobase) {
        if (sueldobase >= 0) {
            this.sueldobase = sueldobase;
        } else {
            System.out.println("Error: El sueldo base no puede ser negativo.");
        }
    }
    // Método para probar la clase
    public static void main(String[] args) {
        empleado e1 = new empleado("Ana", "Jefe", 1000);
        empleado e2 = new empleado("Luis", "Empleado", 800);
        empleado e3 = new empleado("Mario", "Jefe", -300);

        System.out.println(e1.getNombre() + " - Sueldo final: $" + e1.getSueldoFinal());
        System.out.println(e2.getNombre() + " - Sueldo final: $" + e2.getSueldoFinal());
        System.out.println(e3.getNombre() + " - Sueldo final: $" + e3.getSueldoFinal());
    }
}
