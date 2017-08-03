
package TextPad;

import java.awt.Color;
import java.io.*;

import java.awt.Font;;
import javax.swing.*;
import javax.swing.JFileChooser;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

public class TextpadFrame extends javax.swing.JFrame {

    
    public TextpadFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        Characters = new javax.swing.JLabel();
        Line = new javax.swing.JLabel();
        Words = new javax.swing.JLabel();
        Col = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        SaveAs = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Undo = new javax.swing.JMenuItem();
        Cut = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        Delete = new javax.swing.JMenuItem();
        SelectAll = new javax.swing.JMenuItem();
        TimeDate = new javax.swing.JMenuItem();
        Format = new javax.swing.JMenu();
        areafont = new javax.swing.JMenuItem();
        fontColour = new javax.swing.JMenuItem();
        View = new javax.swing.JMenu();
        statusBar = new javax.swing.JCheckBoxMenuItem();
        Help = new javax.swing.JMenu();
        ViewHelp = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TextPad");
        setFocusable(false);

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        Characters.setText("Characters: 0");
        Characters.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Line.setText("Line: 0");

        Words.setText("Word: 0");

        Col.setText("Col: 0");

        File.setText("File");

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New.setText(" New");
        New.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewMouseClicked(evt);
            }
        });
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        File.add(New);

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        File.add(Save);

        SaveAs.setText("Save As...");
        SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
        File.add(SaveAs);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        jMenuBar1.add(File);

        Edit.setText("Edit");

        Undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, 0));
        Undo.setText("Undo");
        Edit.add(Undo);

        Cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        Cut.setText("Cut");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        Edit.add(Cut);

        Copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        Edit.add(Copy);

        Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        Paste.setText("Paste");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        Edit.add(Paste);

        Delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        Edit.add(Delete);

        SelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        SelectAll.setText("Select All");
        SelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAllActionPerformed(evt);
            }
        });
        Edit.add(SelectAll);

        TimeDate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        TimeDate.setText("Time/Date");
        TimeDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeDateActionPerformed(evt);
            }
        });
        Edit.add(TimeDate);

        jMenuBar1.add(Edit);

        Format.setText("Format");

        areafont.setText("Font");
        areafont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areafontActionPerformed(evt);
            }
        });
        Format.add(areafont);

        fontColour.setText("Font Colour");
        fontColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontColourActionPerformed(evt);
            }
        });
        Format.add(fontColour);

        jMenuBar1.add(Format);

        View.setText("View");

        statusBar.setSelected(true);
        statusBar.setText("Status");
        statusBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusBarActionPerformed(evt);
            }
        });
        View.add(statusBar);

        jMenuBar1.add(View);

        Help.setText("Help");

        ViewHelp.setText("View Help");
        ViewHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewHelpActionPerformed(evt);
            }
        });
        Help.add(ViewHelp);

        About.setText("About ");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        Help.add(About);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Characters, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Words, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Line, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Col, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Characters)
                    .addComponent(Line)
                    .addComponent(Words)
                    .addComponent(Col)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/* GLOBAL VARIABLES FOR EDITING RELATED WORK*/
    
    String currentDataInTextArea = null , previousData = null;
    String temporaryData = null;
    File currentFile = null;
    Font fontForArea = null;
    
    private void NewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMouseClicked
        
    }//GEN-LAST:event_NewMouseClicked

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if(evt.getSource()==Save)
        {
            if(currentFile!=null)
            {
                File f = currentFile;
                
                try
                {
                    FileWriter fw = new FileWriter(f.getAbsoluteFile());
                    String s1 = "", s2 = "";
                    
                    s1 = textArea.getText();
                    fw.write(s1);
                    fw.flush();
                    fw.close();
                    
                    JOptionPane.showMessageDialog(this, "File Saved!");
                    
                    
                }
                catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "File not created!\nRedirecting to Save As.");
                
            JFileChooser fc = new JFileChooser();
            int i = fc.showSaveDialog(this);
            if(i==JFileChooser.APPROVE_OPTION)
            {
                File f = new File(fc.getSelectedFile()+".txt");
                JOptionPane.showMessageDialog(this, "Save file as: "+f.getAbsolutePath());
                
                try
                {
                    FileWriter fw = new FileWriter(f.getAbsoluteFile());
                    String s1 = "", s2 = "";
                    
                    s1 = textArea.getText();
                    fw.write(s1);
                    fw.flush();
                    fw.close();
                    
                    
                }
                catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                currentFile = f;
            }
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        if(evt.getSource()==Open)
        {
            JFileChooser fc = new JFileChooser();
            int i = fc.showOpenDialog(this);
            if(i==JFileChooser.APPROVE_OPTION)
            {
                File f = fc.getSelectedFile();
                String path = f.getPath();
                try
                {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
                    String s1 = "", s2 = "";
                    while((s1=bufferedReader.readLine())!=null)
                    {
                        s2+=s1+"\n";
                    }
                    textArea.setText(s2);
                    bufferedReader.close();
                    
                }
                catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                currentFile = f;
            }
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void TimeDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeDateActionPerformed
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm");
        String curDate = date.format(format);
        String preData = textArea.getText();
        
        String postData = preData+"\n"+curDate;

        
        textArea.setText(postData);
    }//GEN-LAST:event_TimeDateActionPerformed

    private void textAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyTyped
        String curData  = textArea.getText();
        previousData = currentDataInTextArea;
        currentDataInTextArea = curData;
        long characters = curData.length() + 1;
        String words[] = curData.split(" ");
        String labelCharacters = "Character : "+characters;
        String labelWords = "Words : "+(words.length);
        Characters.setText(labelCharacters);
        Words.setText(labelWords);
        int pos = textArea.getCaretPosition();
        int ypos=0;
        try
        {ypos = textArea.getLineOfOffset(pos);}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this , e.getMessage());
        }
        
        ypos = ypos+1;
        
       
        /*int position = pos - textArea.getLineStartOffset(ypos);
        Col.setText("Col: "+Integer.toString(position));*/
        
        
        Line.setText("Line: "+Integer.toString(ypos));
        
        
    }//GEN-LAST:event_textAreaKeyTyped

    private void SelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectAllActionPerformed
        String tempData = textArea.getText();
        temporaryData = tempData;
        textArea.selectAll();
        
    }//GEN-LAST:event_SelectAllActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        String copiedText = null;
        if(textArea.getSelectedText()!=null)
        {
            copiedText = textArea.getSelectedText();
        }
        temporaryData = copiedText;
    }//GEN-LAST:event_CopyActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        if(temporaryData!=null)
        {
            textArea.insert(temporaryData, textArea.getCaretPosition());
        }
        
    }//GEN-LAST:event_PasteActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       // textArea.setText(textArea.getText().replace(textArea.getSelectedText(),""));
        textArea.replaceSelection("");
    }//GEN-LAST:event_DeleteActionPerformed

    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsActionPerformed
        if(evt.getSource()==SaveAs)
        {
            JFileChooser fc = new JFileChooser();
            int i = fc.showSaveDialog(this);
            if(i==JFileChooser.APPROVE_OPTION)
            {
                File f = new File(fc.getSelectedFile()+".txt");
                JOptionPane.showMessageDialog(this, "Save file as: "+f.getAbsolutePath());
                
                try
                {
                    FileWriter fw = new FileWriter(f.getAbsoluteFile());
                    
                    String s1 = textArea.getText();
                    fw.write(s1);
                    fw.flush();
                    fw.close();
                    
                    
                }
                catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                currentFile = f;
            }
        }                                    
    }//GEN-LAST:event_SaveAsActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // Yes-->0   No-->1   Cancel-->2
        int x = 0;
        if(currentFile == null)
        {
            x = JOptionPane.showConfirmDialog(this, "File not saved!\nWould you still like to exit?");
        }
        else
        {
            System.exit(0);
        }
        if(x==0)
        {
            System.exit(0);
        }
        else if(x==1)
        {
            JOptionPane.showMessageDialog(this, "Please click on Save as");
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed

         new TextpadFrame().setVisible(true);
    }//GEN-LAST:event_NewActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed
        temporaryData = textArea.getSelectedText();
        textArea.replaceSelection("");
    }//GEN-LAST:event_CutActionPerformed

    private void statusBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusBarActionPerformed
        if(statusBar.isSelected())
        {
            Words.setVisible(true);
            Characters.setVisible(true);
            Line.setVisible(true);
            
            
        }
        else if(statusBar.isSelected()==false)
        {
            
            Words.setVisible(false);
            Characters.setVisible(false);
            Line.setVisible(false);
            
        }
    }//GEN-LAST:event_statusBarActionPerformed

    private void ViewHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewHelpActionPerformed
        try { 
         String url = "https://github.com/Saksham-Bhardwaj/";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_ViewHelpActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_AboutActionPerformed

    private void areafontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areafontActionPerformed
        Format form = new Format();
        form.ShowFont(textArea);
        //textArea.setFont(fontForArea);
        
        
        
        //JOptionPane.showMessageDialog(this, "This button is being developed.\nWait for a while");
    }//GEN-LAST:event_areafontActionPerformed

    private void fontColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontColourActionPerformed
        Color color = JColorChooser.showDialog(this, "Select a color", Color.black);
        textArea.setForeground(color);
        
    }//GEN-LAST:event_fontColourActionPerformed

    
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
            java.util.logging.Logger.getLogger(TextpadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextpadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextpadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextpadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextpadFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JLabel Characters;
    private javax.swing.JLabel Col;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenuItem Delete;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Format;
    private javax.swing.JMenu Help;
    private javax.swing.JLabel Line;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem SaveAs;
    private javax.swing.JMenuItem SelectAll;
    private javax.swing.JMenuItem TimeDate;
    private javax.swing.JMenuItem Undo;
    private javax.swing.JMenu View;
    private javax.swing.JMenuItem ViewHelp;
    private javax.swing.JLabel Words;
    private javax.swing.JMenuItem areafont;
    private javax.swing.JMenuItem fontColour;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBoxMenuItem statusBar;
    public javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
