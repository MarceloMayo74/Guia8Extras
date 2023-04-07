package Ejercicio2.servicio;

import Ejercicio2.entidad.NIF;
import java.util.Scanner;

public class NIFServicio {
    public NIF crearNif() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el DNI:");
        long DNI = sc.nextLong();
        double resto = DNI % 23;
        char letra = letras[(int) resto];
        return new NIF(DNI, letra);
    }

    public void mostrar(NIF nif) {
        System.out.println(nif.getDNI() + "-" + nif.getLetra());
    }
}
