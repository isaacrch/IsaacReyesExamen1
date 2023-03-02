package isaacreyesexamen1;

import java.util.Scanner;

public class procesos {

    static int cargo = 1000;
    static String[] nombre = new String[10];
    static long[] cedula = new long[10];
    private static Scanner leer = new Scanner(System.in);
    static int indice = 0;
    static long factura = 0;

    public static void entradasSolNorteSur() {
        float entradasol = 10500;
        float subtotal = 0;
        float total = 0;
        char continuar = 'n';
        byte acumulador = 0;
        do {
            if (indice > 9) {
                System.out.println("arreglo lleno");
                continuar = 'n';
            } else {
                System.out.println("digite su nombre: ");
                nombre[indice] = leer.next();
                System.out.println("digite su numero de cedula: ");
                cedula[indice] = leer.nextLong();
                System.out.println("digite el numero de factura: ");
                factura = leer.nextLong();
                System.out.println("cuantas entradas desea comprar: ");
                acumulador = leer.nextByte();
                subtotal = entradasol * acumulador;
                float cargoEntrada = acumulador * 1000;
                total = subtotal + cargoEntrada;

                System.out.println("numero de factura: " + factura);
                for (int i = 0; i < indice; i++) {
                    System.out.println("numero de cedula: " + cedula[i]);
                }
                System.out.println("nombre del comprador: " + nombre[indice]);
                indice++;
                System.out.println("localidad: entrada sol ");
                System.out.println("cantidad de entradas: " + acumulador);
                System.out.println("el subtotal es: " + subtotal);
                System.out.println("cargos por servicios: " + cargoEntrada);
                System.out.println("el total es: " + total);
                System.out.println("desea comprar otra entrada: ");
                continuar = leer.next().toLowerCase().charAt(0);
            }
        } while (continuar != 'n');
    }

    public static void SombraEsteOeste() {

        float entradasombra = 20500;
        float subtotal = 0;
        float total = 0;
        char continuar = 'n';
        byte acumulador = 0;
        do {
            if (indice > 9) {
                System.out.println("arreglo lleno");
                continuar = 'n';
            } else {
                System.out.println("digite su nombre: ");
                nombre[indice] = leer.next();
                System.out.println("digite su numero de cedula: ");
                cedula[indice] = leer.nextLong();
                System.out.println("digite el numero de factura: ");
                factura = leer.nextLong();
                System.out.println("cuantas entradas desea comprar: ");
                acumulador = leer.nextByte();
                subtotal = entradasombra * acumulador;
                float cargoEntrada = acumulador * 1000;
                total = subtotal + cargoEntrada;

                System.out.println("numero de factura: " + factura);
                for (int i = 0; i < indice; i++) {
                    System.out.println("numero de cedula: " + cedula[i]);
                }
                System.out.println("nombre del comprador: " + nombre[indice]);
                indice++;
                System.out.println("localidad: entrada sombra ");
                System.out.println("cantidad de entradas: " + acumulador);
                System.out.println("el subtotal es: " + subtotal);
                System.out.println("cargos por servicios: " + cargoEntrada);
                System.out.println("el total es: " + total);
                System.out.println("desea comprar otra entrada: ");
                continuar = leer.next().toLowerCase().charAt(0);
            }
        } while (continuar != 'n');
    }

    public static void preferencial() {

        float entradapreferencial = 25500;
        float subtotal = 0;
        float total = 0;
        char continuar = 'n';
        byte acumulador = 0;
        do {
            if (indice > 9) {
                System.out.println("arreglo lleno");
                continuar = 'n';
            } else {
                System.out.println("digite su nombre: ");
                nombre[indice] = leer.next();
                System.out.println("digite su numero de cedula: ");
                cedula[indice] = leer.nextLong();
                System.out.println("digite el numero de factura: ");
                factura = leer.nextLong();
                System.out.println("cuantas entradas desea comprar: ");
                acumulador = leer.nextByte();
                subtotal = entradapreferencial * acumulador;
                float cargoEntrada = acumulador * 1000;
                total = subtotal + cargoEntrada;

                System.out.println("numero de factura: " + factura);
                for (int i = 0; i < indice; i++) {
                    System.out.println("numero de cedula: " + cedula[i]);
                }
                System.out.println("nombre del comprador: " + nombre[indice]);
                indice++;
                System.out.println("localidad: preferencial ");
                System.out.println("cantidad de entradas: " + acumulador);
                System.out.println("el subtotal es: " + subtotal);
                System.out.println("cargos por servicios: " + cargoEntrada);
                System.out.println("el total es: " + total);
                System.out.println("desea comprar otra entrada: ");
                continuar = leer.next().toLowerCase().charAt(0);
            }
        } while (continuar != 'n');
    }
}
