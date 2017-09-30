import clases.baraja.Baraja;
import clases.naipe.Carta;
import clases.naipe.Numero;
import clases.naipe.Pinta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creamos una baraja
        Baraja baraja = new Baraja();
        // la barajamos (virtualmente ^_^)
        baraja.barajar();
        // ahora vamos a preguntar al usuario por una carta
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una carta. Yo te diré en que posición de la baraja está.");
        System.out.println("Primero elige una pinta:");
        Pinta pintaSeleccionada;
        while (true) {
            try {
                for (Pinta pinta : Pinta.values()) {
                    System.out.println(pinta.ordinal() + ". " + pinta.name());
                }
                int indicePinta = scanner.nextInt();
                pintaSeleccionada = Pinta.values()[indicePinta];
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Opción no válida. Intente nuevamente");
                System.out.println();
            }
        }
        System.out.println("Ahora elige un número:");
        Numero numeroSeleccionado;
        while (true) {
        try {
            for (Numero numero : Numero.values()) {
                System.out.println(numero.ordinal() + ". " + numero.name());
            }
            int indiceNumero = scanner.nextInt();
            numeroSeleccionado = Numero.values()[indiceNumero];
            break;
        } catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("Opción no válida. Intente nuevamente");
            System.out.println();
        }
    }
        Carta cartaUsuario = new Carta(pintaSeleccionada, numeroSeleccionado);
        // ahora recorremos la baraja
        Integer posicion = 1;
        for(Carta carta: baraja.getCartas()) {
            System.out.println("Comparando con carta " + carta);
            if (carta.equals(cartaUsuario)) {
                System.out.println("Tu carta está en la posición " + posicion);
                break;
            }
            posicion++;
        }
    }
}