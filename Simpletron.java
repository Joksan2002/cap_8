package cap_8;

import java.util.Scanner;

public class Simpletron {
    public static void main(String[] args) {
        int[] memoria = new int[100];

        Scanner entrada = new Scanner(System.in);

        System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instruccion ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare ***");
        System.out.println("*** el numero de ubicacion y un signo de interrogacion (?) ***");
        System.out.println("*** Entonces usted escribira la palabra para esa ubicacion. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");

        // Permitir al usuario ingresar al programa
        int contadorInstrucciones = 0;
        int numero;
        do {
            System.out.printf("%02d ? ", contadorInstrucciones);
            numero = entrada.nextInt();
            if (numero != -9999) {
                memoria[contadorInstrucciones] = numero;
                contadorInstrucciones++;
            }
        } while (numero != -9999);

        // Ejecucion del programa
        int acumulador = 0;
        int instruccionRegistro;
        int operacionCodigo;
        int operando;
        contadorInstrucciones = 0;

        while (contadorInstrucciones < 100) {
            instruccionRegistro = memoria[contadorInstrucciones];
            operacionCodigo = instruccionRegistro / 100;
            operando = instruccionRegistro % 100;

            switch (operacionCodigo) {
                case 10:
                    System.out.print("Ingrese un numero: ");
                    memoria[operando] = entrada.nextInt();
                    break;
                case 11:
                    System.out.println("escribe: " + memoria[operando]);
                    break;
                case 20:
                    acumulador = memoria[operando];
                    break;
                case 21:
                    memoria[operando] = acumulador;
                    break;
                case 30:
                    acumulador += memoria[operando];
                    break;
                case 31:
                    acumulador -= memoria[operando];
                    break;
                case 32:
                    if (memoria[operando] != 0) {
                        acumulador /= memoria[operando];
                    } else {
                        System.out.println("*** Intento de dividir entre cero ***");
                        System.out.println("*** La ejecucion de Simpletron se termino en forma anormal ***");
                        System.exit(1);
                    }
                    break;
                case 33:
                    acumulador *= memoria[operando];
                    break;
                case 40:
                    contadorInstrucciones = operando;
                    break;
                case 41:
                    if (acumulador < 0) {
                        contadorInstrucciones = operando;
                    }
                    break;
                case 42:
                    if (acumulador == 0) {
                        contadorInstrucciones = operando;
                    }
                    break;
                case 43:
                    // Vaciado de la computadora
                    System.out.printf("/n*** Vaciado de la computadora ***");
                    System.out.println("Registro de Acumulador: " + acumulador);
                    System.out.println("Contador de Instrucciones: " + contadorInstrucciones);
                    System.out.println("Contenido de Memoria:");

                    for (int i = 0; i < memoria.length; i++) {
                    System.out.printf("%02d: %d%n", i, memoria[i]);
                    }
            }
            contadorInstrucciones++;
        }
        
        entrada.close();
    }
}