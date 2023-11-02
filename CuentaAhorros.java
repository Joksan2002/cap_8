package cap_8;

public class CuentaAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public void calcularInteresMensual() {
        double interesMensual = this.saldoAhorros * (CuentaAhorros.tasaInteresAnual / 12);
        this.saldoAhorros += interesMensual;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }
    public double getsaldoAhorro(){
        return saldoAhorros;
    }
}
