package br.com.model;

/**
 *
 * @author aluno
 */
public class MedidasTempo {
    private int horas;
    private int minutos;
    private int segundos;
    private int segundosTotais;

    public int getSegundosTotais() {
        return segundosTotais;
    }

    public void setSegundosTotais(int segundosTotais) {
        this.segundosTotais = segundosTotais;
    }
    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void converteEmSegundos(){
        this.segundosTotais = this.horas * 3600 + this.minutos * 60 + this.segundos;
    }
}
