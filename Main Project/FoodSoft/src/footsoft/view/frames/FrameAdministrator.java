/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.frames;

import footsoft.view.dialogs.administrator.DialogConfigurationBolsaAndCentro;
import footsoft.view.dialogs.administrator.DialogConfigurationDate;
import footsoft.view.dialogs.components.toolbars.FSToolBarRegistrator;

/**
 *
 * @author Klac
 */
public class FrameAdministrator extends MainFrame{

    
    public FrameAdministrator() {
        super("FootSoft - Administrador");
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();
        jToolBar1 = new FSToolBarRegistrator(this);
        jPanelWork = new javax.swing.JPanel();
        panelState = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuConfiguracion = new javax.swing.JMenu();
        jMenuItemFechasDeCorte = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        setPanelWorkCenter(jPanelWork);
        jPanelWork.setBackground(getBackground());
        jPanelWork.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelWork, java.awt.BorderLayout.CENTER);

        setPanelStateSouth(panelState);
        panelState.setBackground(getBackground());
        panelState.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelState, java.awt.BorderLayout.SOUTH);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenuArchivo.setBackground(new java.awt.Color(255, 255, 255));
        jMenuArchivo.setForeground(new java.awt.Color(102, 102, 102));
        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jMenuArchivo.add(jSeparator1);

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuArchivo.add(jMenuItem1);

        jMenuBar1.add(jMenuArchivo);

        jMenu2.setBackground(jMenuArchivo.getBackground());
        jMenu2.setForeground(jMenuArchivo.getForeground());
        jMenu2.setText("Reportes");
        jMenu2.setFont(jMenuArchivo.getFont());
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(jMenuArchivo.getBackground());
        jMenu3.setForeground(jMenuArchivo.getForeground());
        jMenu3.setText("Graficas");
        jMenu3.setFont(jMenuArchivo.getFont());
        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(jMenuArchivo.getBackground());
        jMenu4.setForeground(jMenuArchivo.getForeground());
        jMenu4.setText("Contabilidad");
        jMenu4.setFont(jMenuArchivo.getFont());
        jMenuBar1.add(jMenu4);

        jMenuConfiguracion.setBackground(jMenuArchivo.getBackground());
        jMenuConfiguracion.setForeground(jMenuArchivo.getForeground());
        jMenuConfiguracion.setText("Configuración");
        jMenuConfiguracion.setFont(jMenuArchivo.getFont());

        jMenuItemFechasDeCorte.setFont(jMenuItem1.getFont());
        jMenuItemFechasDeCorte.setText("Fechas de Corte");
        jMenuItemFechasDeCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFechasDeCorteActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(jMenuItemFechasDeCorte);
        jMenuConfiguracion.add(jSeparator2);

        jMenuItem4.setFont(jMenuItem1.getFont());
        jMenuItem4.setText("Centros de Costos y Bolsas de Empleo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(jMenuItem4);
        jMenuConfiguracion.add(jSeparator3);

        jMenuItem6.setFont(jMenuItem1.getFont());
        jMenuItem6.setText("Configuración de Usuarios");
        jMenuConfiguracion.add(jMenuItem6);

        jMenuBar1.add(jMenuConfiguracion);

        jMenu6.setBackground(jMenuArchivo.getBackground());
        jMenu6.setForeground(jMenuArchivo.getForeground());
        jMenu6.setText("Ayuda");
        jMenu6.setFont(jMenuArchivo.getFont());
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFechasDeCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFechasDeCorteActionPerformed
        runDialog(DialogConfigurationDate.class);
    }//GEN-LAST:event_jMenuItemFechasDeCorteActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        waitingDialog();
        runDialog(DialogConfigurationBolsaAndCentro.class,this);
    }//GEN-LAST:event_jMenuItem4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConfiguracion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemFechasDeCorte;
    private javax.swing.JPanel jPanelWork;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panelState;
    // End of variables declaration//GEN-END:variables
}
