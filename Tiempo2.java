package cap_8;

public class Tiempo2{
    private int hora; // 0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59

    // Constructor de Tiempo2 sin argumentos:
    // inicializa cada variable de instancia a cero
    public Tiempo2(){
        this(0, 0, 0); // invoca al constructor de Tiempo2 con tres argumentos
    }

    // Constructor de Tiempo2: se suministra hora, minuto y segundo con valor 
    //predeterminado de 0
    public Tiempo2(int hora){
        this(hora, 0, 0); // invoca al constructor con tres argumentos
    }
    // Constructor de Tiempo2: se suministran hora y minuto, segundo con valor 
    //preeterminado de 0
    public Tiempo2(int hora, int minuto){
        this(hora, minuto, 0); // invoca al constructor con tres argumentos
    }

    // Constructor de Tiempo2: se suministran hora, minuto y segundo
    public Tiempo2(int hora, int minuto, int segundo){
        if (hora < 0 || hora >= 24)
        throw new IllegalArgumentException("hora debe estar entre 0 y 23");
        if (minuto < 0 || minuto >= 60)
        throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        if (segundo < 0 || segundo >= 60)
        throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Constructor de Tiempo2: se suministra otro objeto Tiempo2
    public Tiempo2(Tiempo2 tiempo){
        // invoca al constructor con tres argumentos
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    }

    // Métodos Establecer
    // establece un nuevo valor de tiempo usando la hora universal;
    // valida los datos
    public void establecerTiempo(int hora, int minuto, int segundo){
        if (hora < 0 || hora >= 24)
        throw new IllegalArgumentException ("hora debe estar entre 0 y 23");
        if (minuto < 0 || minuto >= 60)
        throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
        if (segundo < 0 || segundo >= 60)
        throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    // valida y establece la hora
    public void establecerHora(int hora){
        if (hora < 0 || hora >= 24)
        throw new IllegalArgumentException ("hora debe estar entre 0 y 23");
        this.hora = hora;
    }
    // valida y establece el minuto
    public void establecerMinuto(int minuto){
        if (minuto < 0 && minuto >= 60)
        throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        this.minuto = minuto;
    }

    // valida y establece el segundo
    public void establecerSegundo(int segundo){
        if (segundo >= 0 && segundo < 60)
        throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.segundo = segundo;
    }

    // Métodos Obtener
     // obtiene el valor de la hora
    public int obtenerHora(){
        return hora;
    }

     // obtiene el valor del minuto
    public int obtenerMinuto(){
        return minuto;
    } // obtiene el valor del segundo
    public int obtenerSegundo(){
        return segundo;
    }

     // convierte a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal()
    {
        return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }

     // convierte a String en formato de hora estándar (H:MM:SS AM o PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
        ((obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12),
        obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
    }
}