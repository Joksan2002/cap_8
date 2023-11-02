package cap_8;

public class PruebaCuentaAhorro {
    public static void main(String[] args) {
        CuentaAhorros ahorrador1 = new CuentaAhorros(2000.00);
        CuentaAhorros ahorrador2 = new CuentaAhorros(3000.00);

        CuentaAhorros.modificarTasaInteres(0.04);

        for (int i = 0; i < 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();

            System.out.printf("%nEl nuevo saldo de ahorrador1 es: $%.2f\n", ahorrador1.getsaldoAhorro());
            System.out.printf("El nuevo saldo de ahorrador2 es: $%.2f\n", ahorrador2.getsaldoAhorro());
        }

        CuentaAhorros.modificarTasaInteres(0.05);

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.printf("%nEl nuevo saldo de ahorrador1 es: $%.2f\n", ahorrador1.getsaldoAhorro());
        System.out.printf("El nuevo saldo de ahorrador2 es: $%.2f\n", ahorrador2.getsaldoAhorro());
    }
}
