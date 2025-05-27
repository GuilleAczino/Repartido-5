import java.util.Scanner;

public class Cuenta {
    private String numero;
    private String titular;
    private int saldo;

    public Cuenta(String numero, String titular, int saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double monto){
    saldo +=monto;
    }
    public void retirar(double monto){
        if(saldo<monto) {
            System.out.println("El monto a retirar es mayor que el de la cuenta");
        }else{
            saldo -= monto;
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumero(String nombre) {
        this.numero = nombre;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        int a=0;
        String t;
        Cuenta cuenta=null;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1-Abrir cuenta");
            System.out.println("2-Depositar");
            System.out.println("3-Retirar");
            System.out.println("4-Mostrar datos");
            System.out.println("5-Salir");
            System.out.print("Seleccione una opción: ");
            a = s.nextInt();
            s.nextLine(); // Limpiar buffer
            switch (a) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String nom = s.nextLine();
                    System.out.println("Ingrese numero de cuenta: ");
                    String cuen = s.nextLine();
                    System.out.println("Saldo inicial es 0");
                    int sal = 0;
                    cuenta = new Cuenta(cuen, nom, sal);
                    break;
                case 2:
                    if (cuenta == null) {
                        System.out.println("Primero debe abrir una cuenta.");
                    } else {
                        System.out.print("Monto a depositar: ");
                        int montoDep = s.nextInt();
                        cuenta.depositar(montoDep);
                        System.out.println("Depósito realizado.");
                    }
                    break;
                case 3:
                    if (cuenta == null) {
                        System.out.println("Primero debe abrir una cuenta.");
                    } else {
                        System.out.print("Monto a retirar: ");
                        int montoRet = s.nextInt();
                        cuenta.retirar(montoRet);
                    }
                    break;
                case 4:
                    if (cuenta == null) {
                        System.out.println("No hay cuenta creada.");
                    } else {
                        System.out.println("Número de cuenta: " + cuenta.getNumero());
                        System.out.println("Titular: " + cuenta.getTitular());
                        System.out.println("Saldo: $" + cuenta.getSaldo());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }while(a!=5);
    }
}
