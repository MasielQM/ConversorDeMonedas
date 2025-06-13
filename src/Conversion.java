public class Conversion {
    private String monedaBase;
    private String monedaDestino;
    private double tasa;

    public Conversion(String monedaBase, String monedaDestino, double tasa) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
        this.tasa = tasa;
    }

    public String mostrarConversion() {
        return "El valor 1 " + monedaBase + " corresponde al valor final de " + tasa + " " + monedaDestino;
    }
}