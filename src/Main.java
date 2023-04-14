import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese el año");
        int anio = sc.nextInt();

        f1.setMes(mes);
        f1.setDia(dia);
        f1.setAnio(anio);


        System.out.println("La fecha ingresada es: " +f1.mostrarFecha());




    }
}