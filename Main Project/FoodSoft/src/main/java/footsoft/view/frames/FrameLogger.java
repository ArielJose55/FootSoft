/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.frames;

import footsoft.model.util.readers.ReaderFingerprint;
import footsoft.view.panels.registrator.PanelRegistratorEmployee;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Klac
 */
public class FrameLogger extends MainFrame {

    
    public FrameLogger() {
        super("FootSoft - Registrador",false);
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator = new javax.swing.JSeparator();
        jPanelWork = new javax.swing.JPanel();
        jPanelWest = new javax.swing.JPanel();
        jButtonRegistrar = createButtonMenu();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonConsultar = createButtonMenu();
        jButton1 = createButtonMenu();
        jButton2 = createButtonMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemRegistrar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        setForeground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        jSeparator.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(jSeparator, java.awt.BorderLayout.PAGE_START);

        jPanelWork.setBackground(getBackground());
        jPanelWork.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelWork, java.awt.BorderLayout.CENTER);

        jPanelWest.setBackground(getBackground());
        jPanelWest.setMaximumSize(new java.awt.Dimension(190, 32767));
        jPanelWest.setMinimumSize(new java.awt.Dimension(190, 100));
        jPanelWest.setPreferredSize(new java.awt.Dimension(190, 322));
        jPanelWest.setRequestFocusEnabled(false);

        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footsoft/view/dialogs/components/toolbars/businessman248.png"))); // NOI18N
        jButtonRegistrar.setText("Registrar Empleado");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(51, 153, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footsoft/view/resources/viewing1.png"))); // NOI18N
        jButtonConsultar.setText("Consulta por Huella");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footsoft/view/resources/coins21.png"))); // NOI18N
        jButton1.setText("Pagos en Caja");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footsoft/view/resources/soft2.png"))); // NOI18N
        jButton2.setText("Refrigerios");

        javax.swing.GroupLayout jPanelWestLayout = new javax.swing.GroupLayout(jPanelWest);
        jPanelWest.setLayout(jPanelWestLayout);
        jPanelWestLayout.setHorizontalGroup(
            jPanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelWestLayout.setVerticalGroup(
            jPanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanelWestLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelWest, java.awt.BorderLayout.WEST);

        jMenuBar1.setBackground(getBackground());

        jMenuArchivo.setBackground(getBackground());
        jMenuArchivo.setForeground(getForeground());
        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(getFont());

        jMenuItemRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemRegistrar.setText("Registrar nuevo empleado");
        jMenuArchivo.add(jMenuItemRegistrar);
        jMenuArchivo.add(jSeparator1);

        jMenuItemSalir.setFont(jMenuItemRegistrar.getFont());
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuAyuda.setBackground(getBackground());
        jMenuAyuda.setForeground(getForeground());
        jMenuAyuda.setText("Ayuda");
        jMenuAyuda.setFont(getFont());
        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        changedPanelWork(new PanelRegistratorEmployee());
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        String input = javax.swing.JOptionPane.showInputDialog("Ingrese huella");
        try {
            Integer cedula = new ReaderFingerprint().procesar(input.getBytes());
            javax.swing.JOptionPane.showMessageDialog(rootPane, " cedula encontrada "+cedula);
        } catch (Exception ex) {
            Logger.getLogger(FrameLogger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed
    
    private void changedPanelWork(javax.swing.JPanel panel){
        jPanelWork.removeAll();
        jPanelWork.add(panel, java.awt.BorderLayout.CENTER);
        jPanelWork.updateUI();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemRegistrar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanelWest;
    private javax.swing.JPanel jPanelWork;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
