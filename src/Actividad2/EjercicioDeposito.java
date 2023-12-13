package Actividad2;

public class EjercicioDeposito {
    private int cantidadMax;
    private String aceite;
    private String agua;
    private String gasoleo;
    private String gasolina;

    public EjercicioDeposito() {
    }

    public EjercicioDeposito(int cantidadMax, String aceite, String agua, String gasoleo, String gasolina) {
        this.cantidadMax = cantidadMax;
        this.aceite = aceite;
        this.agua = agua;
        this.gasoleo = gasoleo;
        this.gasolina = gasolina;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getGasoleo() {
        return gasoleo;
    }

    public void setGasoleo(String gasoleo) {
        this.gasoleo = gasoleo;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }
}
