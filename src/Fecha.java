public class Fecha {
    private int mes;

    private int dia;

    private int anio;


    //Setter


    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String mostrarFecha() {
        return mes+"/"+dia+"/"+anio;
    }
}
