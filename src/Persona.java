public class Persona {
        private String nombre;
        private int edad;

         public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;

            System.out.println("Persona creada: " + this.nombre); // Imprime el mensaje
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            if (edad > 0) { // La edad no debería ser negativa
                this.edad = edad;
            } else {
                System.out.println("Advertencia: La edad no puede ser negativa. Se mantendrá el valor actual.");
            }
        }
        public static void main(String[] args) {
            Persona p1 = new Persona("Laura", 28);
            Persona p2 = new Persona("Pedro", 35);
        }
    }

