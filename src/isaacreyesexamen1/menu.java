package isaacreyesexamen1;

import java.util.Scanner;

public class menu {

    private byte opcion;
    public Scanner leer = new Scanner(System.in);

    public menu() {

        opcion = 0;
    }

    public void mostrar() {

        do {
            System.out.println("1-comprar entrada Sol Norte/Sur 10500 colones ");
            System.out.println("2-comprar entrada Sombra Este/Oeste 20500 colones");
            System.out.println("3-comprar entrada Preferencial 25500 ");
            System.out.println("4-salir");

            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    procesos.entradasSolNorteSur();

                    break;

                case 2:
                    procesos.SombraEsteOeste();

                    break;
                case 3:
                    procesos.preferencial();

                    break;

                default:
                    throw new AssertionError();
            }

        } while (opcion != 4);

    }

}
