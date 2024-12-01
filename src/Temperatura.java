public class Temperatura {


    //Variables
    private double Celsius;
    private double Fahrenheit;
    private static Tipo tipo = Tipo.CELSIUS; // Inicializar por defecto el tipo de temperatura en CELSIUS
    private Semana diaSemana;



    //Constructor
    /**
     * Establece los valores esperados a introducir por el usuario
     * @param temperatura
     * @param diaSemana
     */
    public Temperatura(double temperatura, Semana diaSemana) {
        this.diaSemana = diaSemana;
        setTemperatura(temperatura);
    }





    //Getter y setter
    static void setToCelsius() {
        tipo = Tipo.CELSIUS;
    }


    static void setToFahrenheit() {
        tipo = Tipo.FAHRENHEIT;
    }


    public void setDia(Semana diaSemana) {
        this.diaSemana = diaSemana;
    }

    /**
     * Devuelve la temperatura establecida o en F o en C
     * @return
     */
    public double getTemperatura() {
        double temperatura;
        if (tipo == Tipo.CELSIUS) {
            temperatura = Celsius;
        } else {
            temperatura = Fahrenheit;
        }
        return temperatura;
    }


    public static Tipo getConfiguracionActual(){
        return tipo;
    }


    public Semana getDiaSemana() {
        return this.diaSemana;
    }


    /**
     * Llamada a un metodo para hacer la conversion de la temperatura en funcion del tipo establecido
     * @param temperatura
     */
    public void setTemperatura(double temperatura) {
        if (tipo == Tipo.CELSIUS) {
            this.Celsius = temperatura;
            this.Fahrenheit = toFahrenheit(temperatura);
        } else {
            this.Fahrenheit = temperatura;
            this.Celsius = toCelsius(temperatura);
        }
    }





    // Metodos
    /**
     * Metodo encargado de convertir a F
     * @param num
     * @return
     */
    public static double toFahrenheit(double num) {
        double entero;
        entero = (9.0 / 5.0 * num) + 32;
        return entero;
    }


    /**
     * Metodo encargado de convertir a C
     * @param num
     * @return
     */
    public static double toCelsius(double num) {
        double entero;
        entero = 5.0 / 9.0 * (num - 32);
        return entero;
    }


    // ToString para imprimir los valores correctamente
    @Override
    public String toString() {
        return "Temperatura:\n" +
                "Celsius: " + Celsius + " ºC" +
                "\nFahrenheit: " + Fahrenheit + " ºF" +
                "\ndiaSemana: " + diaSemana + "\n"
                ;
    }
}
