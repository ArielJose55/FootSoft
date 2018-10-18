/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.dialogs.administrator;

import datechooser.model.exeptions.IncompatibleDataExeption;
import datechooser.model.multiple.PeriodSet;
import footsoft.model.core.daos.FechaDeCorteDao;
import footsoft.model.core.entities.FechasDeCorte;
import footsoft.view.dialogs.MainDialog;


/**
 *
 * @author Klac
 */
public class DialogConfigurationDate extends MainDialog {

    
    
    public DialogConfigurationDate() {
        super();
        initComponents();
        initComponentsDates();
        setLocationRelativeTo(null);
    }

    private void initComponentsDates() {
        try{
            FechasDeCorte fecha = new FechaDeCorteDao().getFechasDeCorte();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(fecha.getFechaDeInicio().getTime());
            PeriodSet period = new PeriodSet();
            period.add(calendar);
            dateChooserComboStart.setDefaultPeriods(period);
            
            calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(fecha.getFechaDeCierre().getTime());
            period = new PeriodSet();
            period.add(calendar);
            dateChooserComboEnd.setDefaultPeriods(period);
            
            jCheckBoxPredominante.setSelected(fecha.isFechaDeCortePredominante());
        }catch(java.sql.SQLException ex){   
        } catch (IncompatibleDataExeption ex) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateChooserComboStart = new datechooser.beans.DateChooserCombo();
        dateChooserComboEnd = new datechooser.beans.DateChooserCombo();
        jCheckBoxPredominante = new javax.swing.JCheckBox();
        jButtonAceptar = createButton();
        jButton2 = createButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración de Fechas de Corte");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Seleccione las fechas de corte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel.setForeground(new java.awt.Color(102, 102, 102));
        jLabel.setText("Fecha de corte inicial:");

        jLabel2.setFont(jLabel.getFont());
        jLabel2.setForeground(jLabel.getForeground());
        jLabel2.setText("Fecha de corte final:");

        dateChooserComboStart.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserComboStart.setCalendarBackground(jPanel1.getBackground());
    dateChooserComboStart.setCalendarPreferredSize(new java.awt.Dimension(330, 220));
    dateChooserComboStart.setNothingAllowed(false);
    try {
        dateChooserComboStart.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2015, 7, 12),
            new java.util.GregorianCalendar(2015, 7, 12))));
} catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
    e1.printStackTrace();
    }
    dateChooserComboStart.setFieldFont(jLabel.getFont());
    dateChooserComboStart.setNavigateFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 15));
    dateChooserComboStart.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    dateChooserComboStart.setShowOneMonth(true);

    dateChooserComboEnd.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dateChooserComboEnd.setCalendarBackground(jPanel1.getBackground());
dateChooserComboEnd.setCalendarPreferredSize(new java.awt.Dimension(330, 220));
dateChooserComboEnd.setNothingAllowed(false);
dateChooserComboEnd.setFieldFont(jLabel.getFont());
dateChooserComboEnd.setNavigateFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 15));
dateChooserComboEnd.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
dateChooserComboEnd.setShowOneMonth(true);

jCheckBoxPredominante.setBackground(getBackground());
jCheckBoxPredominante.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
jCheckBoxPredominante.setText("<html>Convertir estos días como fechas de corte de cada mes</html>");
jCheckBoxPredominante.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBoxPredominanteActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jCheckBoxPredominante, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateChooserComboEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(dateChooserComboStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(dateChooserComboStart, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addComponent(dateChooserComboEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addComponent(jCheckBoxPredominante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jButtonAceptar.setText("Aceptar");
    jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAceptarActionPerformed(evt);
        }
    });

    jButton2.setText("Cancelar");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonAceptar)
                .addComponent(jButton2))
            .addContainerGap(29, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if(dateChooserComboEnd.getSelectedDate().before(dateChooserComboStart.getSelectedDate())){
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Selección de fecha de cierre no valida");
            return;
        }
        if(!jCheckBoxPredominante.isSelected() && dateChooserComboEnd.getSelectedDate().before(java.util.Calendar.getInstance())){
            if(dateChooserComboStart.getSelectedDate().before(java.util.Calendar.getInstance())){
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Las fechas de cortes ingresadas corresponden a fechas pasadas");
            }else{
                javax.swing.JOptionPane.showMessageDialog(rootPane, "La fecha de corte final debe ser futura");
            }
            return;
        }
        FechasDeCorte fechaDeCorte = new FechasDeCorte();
        fechaDeCorte.setFechaDeInicio(new java.sql.Date(dateChooserComboStart.getSelectedDate().getTimeInMillis()));
        fechaDeCorte.setFechaDeCierre(new java.sql.Date(dateChooserComboEnd.getSelectedDate().getTimeInMillis()));
        fechaDeCorte.setFechaDeCortePredominante(jCheckBoxPredominante.isSelected());
        try{
            FechaDeCorteDao fechaDao = new FechaDeCorteDao();
            fechaDao.updateFechaDeCorte(fechaDeCorte);
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Configuración de fachas de corte exitosa");
            doClose();
        }catch(java.sql.SQLException ex){
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jCheckBoxPredominanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPredominanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPredominanteActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserComboEnd;
    private datechooser.beans.DateChooserCombo dateChooserComboStart;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserDialog dateChooserDialog2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JCheckBox jCheckBoxPredominante;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
