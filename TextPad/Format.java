
package TextPad;

import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.geom.*;
import java.awt.font.*;


public class Format extends javax.swing.JFrame {

    
    public Format() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fontField = new javax.swing.JTextField();
        fontStyleField = new javax.swing.JTextField();
        fontSizeField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        fontSizeList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        fontStyleList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        fontList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        previewArea = new javax.swing.JTextArea();
        Preview = new javax.swing.JButton();
        OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Font");

        jLabel2.setText("Font Style");

        jLabel3.setText(" Font Size");

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("FORMAT");

        fontField.setEditable(false);

        fontStyleField.setEditable(false);

        fontSizeField.setEditable(false);

        fontSizeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(fontSizeList);

        fontStyleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Plain", "Bold", "Italic" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(fontStyleList);

        fontList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Arial", "Broadway", "Cooper", "Courier", "Elephant", "Forte", "Latin", "Lucida Handwritting" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(fontList);

        previewArea.setBackground(new java.awt.Color(240, 240, 240));
        previewArea.setColumns(20);
        previewArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        previewArea.setRows(5);
        previewArea.setText("Sample Text");
        previewArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview"));
        jScrollPane5.setViewportView(previewArea);

        Preview.setText("Preview");
        Preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviewActionPerformed(evt);
            }
        });

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fontField))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fontStyleField)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fontSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Preview)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cancel)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fontStyleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fontSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Preview)
                    .addComponent(OK))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    static Font newFont = null;
    String font = "Arial";
    int fontSize = 10;
    String Style = "PLAIN";
    TextpadFrame textpad = new TextpadFrame();
    static JTextArea area = null;
    
    
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void PreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviewActionPerformed
        String tempfont = null;
        int tempSize = 10;
        switch(fontList.getSelectedIndex())
        {
            case 0: tempfont = "Arial"; 
            fontField.setText(tempfont); break;
            case 1: tempfont = "Broadway"; 
            fontField.setText(tempfont); break;
            case 2: tempfont = "Cooper"; 
            fontField.setText(tempfont); break;
            case 3: tempfont = "Courier"; 
            fontField.setText(tempfont); break;
            case 4: tempfont = "Elephant"; 
            fontField.setText(tempfont); break;
            case 5: tempfont = "Forte"; 
            fontField.setText(tempfont); break;
            case 6: tempfont = "Latin"; 
            fontField.setText(tempfont); break;
            case 7: tempfont = "Lucida Handwriting"; 
            fontField.setText(tempfont); break;
            default: tempfont = "Arial"; 
            fontField.setText(tempfont); break;
        }
        font = tempfont;
        
        switch(fontSizeList.getSelectedIndex())
        {
            case 0: tempSize = 8; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 1: tempSize = 9; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 2: tempSize = 10; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 3: tempSize = 11; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 4: tempSize = 12; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 5: tempSize = 14; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 6: tempSize = 16; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 7: tempSize = 18; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 8: tempSize = 20; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 9: tempSize = 22; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 10: tempSize = 24; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 11: tempSize = 26; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 12: tempSize = 28; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 13: tempSize = 36; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 14: tempSize = 48; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            case 15: tempSize = 72; 
            fontSizeField.setText(Integer.toString(tempSize)); break;
            default: tempSize = 10;
            fontSizeField.setText(Integer.toString(tempSize)); ;break;
        }
        fontSize = tempSize;
        
        switch(fontStyleList.getSelectedIndex())
        {
            case 0: Style = "PLAIN";
            newFont = new Font(font , Font.PLAIN, fontSize); break;
            case 1: Style = "BOLD";
            newFont = new Font(font , Font.BOLD, fontSize); break;
            case 2: Style = "ITALIC";
            newFont = new Font(font , Font.ITALIC, fontSize); break;
            default: Style = "PLAIN"; 
            newFont = new Font(font , Font.PLAIN, fontSize);break;
        }
        fontStyleField.setText(Style);
        previewArea.setFont(newFont);
    }//GEN-LAST:event_PreviewActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        area.setFont(newFont);
    }//GEN-LAST:event_OKActionPerformed

    
    public static void ShowFont(JTextArea textArea)
    {
        Format format = new Format();
        format.setVisible(true);
        area = textArea;
    }
    
    
    
   /* public static Font Ok(java.awt.event.ActionEvent evt)
    {
        new TextpadFrame().textArea.setFont(newFont);
        return newFont;
    }*/

    
    
    
    
    
    
    public static Font main(String args[]) {
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
            java.util.logging.Logger.getLogger(Format.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Format.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Format.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Format.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Format().setVisible(true);
                
            }
        });
        return newFont;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton OK;
    private javax.swing.JButton Preview;
    private javax.swing.JTextField fontField;
    private javax.swing.JList<String> fontList;
    private javax.swing.JTextField fontSizeField;
    private javax.swing.JList<String> fontSizeList;
    private javax.swing.JTextField fontStyleField;
    private javax.swing.JList<String> fontStyleList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea previewArea;
    // End of variables declaration//GEN-END:variables
}
