package br.com.model.temporizador;

import br.com.view.VIEWtemporizador;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Temporizador implements Runnable {

    private int horas;
    private int minutos;
    private int segundos;
    private long segundosTotais;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public Temporizador() {
        this.estaSuspensa = false;
        this.foiTerminada = false;
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

    public void calcularSegundosTotais() {
        this.segundosTotais = horas * 3600 + minutos * 60 + segundos;
    }

    public boolean isEstaSuspensa() {
        return estaSuspensa;
    }

    public void setEstaSuspensa(boolean estaSuspensa) {
        this.estaSuspensa = estaSuspensa;
    }

    public long getSegundosTotais() {
        return segundosTotais;
    }

    public void setSegundosTotais(long segundosTotais) {
        this.segundosTotais = segundosTotais;
    }

    public boolean isFoiTerminada() {
        return foiTerminada;
    }

    public void setFoiTerminada(boolean foiTerminada) {
        this.foiTerminada = foiTerminada;
    }
    
    @Override
    public void run() {
        try {
            for (;;) {
                VIEWtemporizador.spinnerHoras.setValue(segundosTotais / 3600);
                int resto = (int) (segundosTotais % 360);
                VIEWtemporizador.spinnerMinutos.setValue(resto / 60);
                VIEWtemporizador.spinnerSegundos.setValue(resto % 60);
                Thread.sleep(1000);
                segundosTotais--;
                
                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                    if (this.foiTerminada) {
                        break;
                    }
                }
                if (segundosTotais == 0) {
                    suspend();
                }
            }
        } catch (Exception e) {
        }

    }

    public void suspend() {
        this.estaSuspensa = true;
    }

    public synchronized void resume() {
        this.estaSuspensa = false;
        notify();
    }

    public synchronized void stop() {
        this.foiTerminada = true;
        notify();
    }

}
