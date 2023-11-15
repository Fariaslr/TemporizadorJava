package br.com.view;

import br.com.model.MedidasTempo;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.text.DefaultFormatter;

/**
 *
 * @author aluno
 */
public class VIEWtemporizador extends javax.swing.JFrame {

    MedidasTempo tempo = new MedidasTempo();

    public VIEWtemporizador() {
        initComponents();
        formattedSpinner(spinnerHoras);
        formattedSpinner(spinnerMinutos);
        formattedSpinner(spinnerSegundos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedTemporizador = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        spinnerHoras = new javax.swing.JSpinner();
        spinnerMinutos = new javax.swing.JSpinner();
        spinnerSegundos = new javax.swing.JSpinner();
        btnIniciar = new javax.swing.JButton();
        lbHoras = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        lblSegundos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        spinnerHoras.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spinnerHoras.setBorder(null);

        spinnerMinutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spinnerMinutos.setBorder(null);

        spinnerSegundos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spinnerSegundos.setToolTipText("");
        spinnerSegundos.setBorder(null);

        btnIniciar.setText("INICIAR");
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
        });

        lbHoras.setText("jLabel1");

        lblMinutos.setText("jLabel2");

        lblSegundos.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spinnerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(spinnerMinutos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblMinutos)
                        .addGap(37, 37, 37)
                        .addComponent(lblSegundos)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinutos)
                    .addComponent(lblSegundos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addGap(18, 18, 18))
        );

        tabbedTemporizador.addTab("Temporizador", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedTemporizador)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedTemporizador)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        if (spinnerSegundos.getValue().hashCode() == 0 && spinnerMinutos.getValue().hashCode() == 0 && spinnerHoras.getValue().hashCode() == 0) {
            JOptionPane.showMessageDialog(this, "Temporizador vazio", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            insereMedidasTempo();
            tempo.converteEmSegundos();
            iniciaTemporizador(tempo);
        }
    }//GEN-LAST:event_btnIniciarMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEWtemporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new VIEWtemporizador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHoras;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblSegundos;
    public javax.swing.JSpinner spinnerHoras;
    public javax.swing.JSpinner spinnerMinutos;
    public javax.swing.JSpinner spinnerSegundos;
    private javax.swing.JTabbedPane tabbedTemporizador;
    // End of variables declaration//GEN-END:variables

    private void formattedSpinner(JSpinner spinner) {
        JSpinner.DefaultEditor editor = (JSpinner.NumberEditor) spinner.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) editor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);
    }

    private void insereMedidasTempo() {
        tempo.setHoras(spinnerHoras.getValue().hashCode());
        tempo.setMinutos(spinnerMinutos.getValue().hashCode());
        tempo.setSegundos(spinnerSegundos.getValue().hashCode());
    }

    private void iniciaTemporizador(MedidasTempo tempo) {
        int segundos = tempo.getSegundosTotais();
        int h, m, s, resto;
        
        lbHoras.setText(null);
        lblMinutos.setText(null);
        lblSegundos.setText(null);

        try {
            while (segundos >= 0) {

                h = segundos / 3600;
                resto = segundos % 3600;
                m = resto / 60;
                s = resto % 60;

                segundos--;

                System.out.printf(" %2d: %2d: %2d\n", h, m, s);
                spinnerHoras.setValue(h);
                spinnerMinutos.setValue(m);
                spinnerSegundos.setValue(s);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}
