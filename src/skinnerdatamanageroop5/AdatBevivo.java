/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skinnerdatamanageroop5;


import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kassai Ferenc
 */
public class AdatBevivo extends javax.swing.JFrame {
    
    private JFileChooser outF;
    private JFileChooser inpF;
    
    private DefaultListModel dlm;
    
    public AdatBevivo() {
        initComponents();
        this.outF = new JFileChooser();
        this.inpF = new JFileChooser();
        dlm = new DefaultListModel();
        jListLatencies.setModel(dlm);
        this.setResizable(false);
        
        
   

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbInpF = new javax.swing.JButton();
        jbOutFloc = new javax.swing.JButton();
        tfInName = new javax.swing.JTextField();
        tfOutName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLatencies = new javax.swing.JList<String>();
        jbLatencyArray = new javax.swing.JButton();
        jbDeleteArray = new javax.swing.JButton();
        tfArrayName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbOK = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbInpF.setText("Select input file");
        jbInpF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInpFActionPerformed(evt);
            }
        });

        jbOutFloc.setText("Create output file");
        jbOutFloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOutFlocActionPerformed(evt);
            }
        });

        tfInName.setEditable(false);

        tfOutName.setEditable(false);

        jListLatencies.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListLatencies);

        jbLatencyArray.setText("Add Latency Array");
        jbLatencyArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLatencyArrayActionPerformed(evt);
            }
        });

        jbDeleteArray.setText("Delete Selected Array(s)");
        jbDeleteArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteArrayActionPerformed(evt);
            }
        });

        jLabel1.setText("Name of the arrays in ORDER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbInpF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbOutFloc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfInName, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(tfOutName))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbLatencyArray)
                                .addGap(27, 27, 27)
                                .addComponent(tfArrayName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbDeleteArray))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbInpF, jbOutFloc});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInpF)
                    .addComponent(tfInName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbOutFloc)
                    .addComponent(tfOutName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbLatencyArray, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfArrayName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jbDeleteArray, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfInName, tfOutName});

        jbOK.setText("OK");
        jbOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOKActionPerformed(evt);
            }
        });

        jbCancel.setText("Cancel");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jbCancel)
                        .addGap(39, 39, 39)
                        .addComponent(jbOK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbOK)
                    .addComponent(jbCancel))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jbLatencyArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLatencyArrayActionPerformed
        
        String arrayName = tfArrayName.getText().toUpperCase();
        tfArrayName.setText("");
        if (!arrayName.equals("")) {
            if (arrayName.length() < 2) {
                if (!dlm.contains(arrayName)) {
                    dlm.addElement(arrayName);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "This array name already exists :-(", "SAME NAME", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Too many characters :-(", "TOO MANY CHARACTERS", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Array name is missing :-(", "MISSING NAME", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbLatencyArrayActionPerformed

    private void jbInpFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInpFActionPerformed
        
        int returnVal = inpF.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = inpF.getSelectedFile();

            // What to do with the file, e.g. display it in a TextArea
            tfInName.setText(file.getAbsolutePath());
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Input file selection was cancelled. :-(", "CANCELLED", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbInpFActionPerformed

    private void jbOutFlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOutFlocActionPerformed
        int returnVal = outF.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = outF.getSelectedFile();

            // What to do with the file, e.g. display it in a TextArea
            tfOutName.setText(file.getAbsolutePath());
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Output file selection was cancelled. :-(", "CANCELLED", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbOutFlocActionPerformed

    private void jbDeleteArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteArrayActionPerformed
        int[] indexek = jListLatencies.getSelectedIndices();
        
        for (int i = 0; i < indexek.length; i++) {
            dlm.removeElementAt(indexek[i]);
        }
    }//GEN-LAST:event_jbDeleteArrayActionPerformed

    private void jbOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOKActionPerformed
        String inputFileName = tfInName.getText();
        String outputFileName = tfOutName.getText();
        Boolean onlyB = false;
        if (dlm.isEmpty()) {
            onlyB = true;
        }
        if (!inputFileName.equals("") && !outputFileName.equals("")) {
            java.util.List<String> nameList = new ArrayList<>();
            if (!onlyB) {
                for (int i = 0; i < dlm.size(); i++) {
                    
                    nameList.add((String) dlm.getElementAt(i) + ":");
                }
                
            } else {
                nameList.add("B:");
            }
            PrintWriter pw = null;
            
            try {
                pw = new PrintWriter(new FileWriter(outputFileName));
                
                try {
                    BufferedReader br = new BufferedReader(new FileReader(inputFileName));
                    
                    String nextLine = br.readLine();
                    String name = "";
                    Array bArray = new Array();
                    
                    String DaName = "B:";
                    
                    String nextName = "";
                    
                    while (nextLine != null) {
                        
                        if (nextLine.startsWith("Subject")) {
                            String[] id = nextLine.split(" ");
                            pw.print(id[1] + ";");
                        }
                        
                        if (nextName.equals(DaName)) {
                            bArray = new Array(pw, br).readWriteData(nextLine, nameList.get(0));
                            pw = bArray.getPw();
                            br = bArray.getBr();
                            nextLine = bArray.getNextLine();
                        }
                        if (!onlyB) {
                            int i = 0;
                            while ((i < nameList.size() - 1) && !nextName.equals(nameList.get(i))) {
                                i++;
                            }
                            
                            if (nextLine.equals(nameList.get(nameList.size() - 1))) {
                                if (nextLine.equals("")) {
                                    pw.print(";");
                                }
                            }
                            
                            if (i != (nameList.size() - 1) && nextLine.equals(nameList.get(i + 1))) {
                            //    pw.print(";");
                                
                            }
                            
                            if (i < (nameList.size() - 1) || nextName.equals(nameList.get(nameList.size() - 1))) {
                                
                                Array lArray = new Array();
                                if (i == (nameList.size() - 1)) {
                                    lArray = new Array(pw, br).readWriteLatency(nextLine, "");
                                } else {
                                    lArray = new Array(pw, br).readWriteLatency(nextLine, nameList.get(i + 1));
                                }
                                pw = lArray.getPw();
                                br = lArray.getBr();
                                nextLine = lArray.getNextLine();
                                if (nextName.equals(nameList.get(nameList.size() - 1))) {
                                    pw.println("");
                                }
                            }
                            
                            nextName = "";
                            
                            if (nextLine.equals(DaName)) {
                                nextName = DaName;
                            }
                            
                            for (int j = 0; j < nameList.size(); j++) {
                                if (nextLine.equals(nameList.get(j))) {
                                    nextName = nameList.get(j);
                                }
                            }
                        } else if (nextLine!=null){
                                
                               if (nextLine.equals(DaName)) {
                            nextName = DaName;
                        } else {
                            nextName = "";
                        }
                        }
                        nextLine = br.readLine();
                        
                        if (nextLine == null){
                            JOptionPane.showMessageDialog(rootPane, "Data extraction completed", "Data extracted", JOptionPane.OK_OPTION);
                        }
                    }
                    
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Can't read the file", "Reading error", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Can't write in the file", "Writing error", JOptionPane.ERROR_MESSAGE);
            } finally {
                pw.close();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Name of the output or input file is missing", "Empty filed", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdatBevivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdatBevivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdatBevivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdatBevivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdatBevivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListLatencies;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbDeleteArray;
    private javax.swing.JButton jbInpF;
    private javax.swing.JButton jbLatencyArray;
    private javax.swing.JButton jbOK;
    private javax.swing.JButton jbOutFloc;
    private javax.swing.JTextField tfArrayName;
    private javax.swing.JTextField tfInName;
    private javax.swing.JTextField tfOutName;
    // End of variables declaration//GEN-END:variables
}
