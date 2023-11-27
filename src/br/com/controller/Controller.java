package br.com.controller;

import br.com.model.cronometro.MedidaTempo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JSpinner;

/**
 *
 * @author Lucas
 */
public class Controller {

    public boolean validaSpinners(JSpinner spinnerHoras, JSpinner spinnerMinutos, JSpinner spinnerSegundos) {
        return spinnerHoras.getValue().equals(0) && spinnerMinutos.getValue().equals(0) && spinnerSegundos.getValue().equals(0);
    }

    public Object verificarTempoVolta(String voltaAnterior, MedidaTempo tempo) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("mm:ss.SSS");
        Date DataVoltaAtual = formato.parse(tempo.formataTempo());
        Date DataVoltaAnterior = formato.parse(voltaAnterior);
        return formato.format(DataVoltaAtual.getTime() - DataVoltaAnterior.getTime());
    }

}
