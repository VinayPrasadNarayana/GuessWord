/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w1620428
 */
public class GuessFrame1 extends javax.swing.JFrame {
 String FindWord = "hello";
    /**
     * Creates new form GuessFrame
     */
    public GuessFrame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Char0 = new javax.swing.JLabel();
        Char1 = new javax.swing.JLabel();
        Char2 = new javax.swing.JLabel();
        Char3 = new javax.swing.JLabel();
        Char4 = new javax.swing.JLabel();
        Char5 = new javax.swing.JLabel();
        aLetter = new javax.swing.JTextField();
        inCorrect = new javax.swing.JLabel();
        myMessage = new javax.swing.JLabel();
        tryLetter = new javax.swing.JButton();
        myMessage1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Char0.setText("X");
        getContentPane().add(Char0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Char1.setText("X");
        getContentPane().add(Char1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        Char2.setText("X");
        getContentPane().add(Char2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        Char3.setText("X");
        getContentPane().add(Char3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        Char4.setText("X");
        getContentPane().add(Char4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        Char5.setText("X");
        getContentPane().add(Char5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        aLetter.setText("e");
        aLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLetterActionPerformed(evt);
            }
        });
        getContentPane().add(aLetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, -1));

        inCorrect.setText("0");
        getContentPane().add(inCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 40, -1));

        myMessage.setText("Look Here");
        getContentPane().add(myMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        tryLetter.setText("Try Letter");
        tryLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryLetterActionPerformed(evt);
            }
        });
        getContentPane().add(tryLetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        myMessage1.setText(".");
        getContentPane().add(myMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel1.setText("Incorrect");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, -1));

        jLabel2.setText(":");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aLetterActionPerformed

    private void tryLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryLetterActionPerformed
        // TODO add your handling code here:

        int charPos;
        String letter = aLetter.getText();
        charPos = FindWord.indexOf(letter);
        myMessage.setText("position is " + charPos);
        if (charPos == 0) {
            Char0.setText(letter);
        }
        if (charPos == 1) {
            Char1.setText(letter);
        }
        if (charPos == 2) {
            Char2.setText(letter);
        }
        if (charPos == 3) {
            Char3.setText(letter);
        }
        if (charPos == 4) {
            Char4.setText(letter);
        }
        if (charPos == 5) {
            Char5.setText(letter);
        }
        if(charPos == -1)
        {
            int dd = Integer.parseInt(inCorrect.getText());
            dd=dd+1;
            String ss = Integer.toString( dd);
            inCorrect.setText(ss);
        }

        if (charPos != -1) {
            charPos =  FindWord.indexOf(letter, charPos + 1);
            if (charPos != -1)
            {
                
                myMessage1.setText(" and " + charPos);
            }
            if (charPos == -1)
            {
               myMessage1.setText(".");
            }
            if (charPos == 0) {
                Char0.setText(letter);
            }
            if (charPos == 1) {
                Char1.setText(letter);
            }
            if (charPos == 2) {
                Char2.setText(letter);
            }
            if (charPos == 3) {
                Char3.setText(letter);
            }
            if (charPos == 4) {
                Char4.setText(letter);
            }
            if (charPos == 5) {
                Char5.setText(letter);
            }

        }

    }//GEN-LAST:event_tryLetterActionPerformed

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
            java.util.logging.Logger.getLogger(GuessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Char0;
    private javax.swing.JLabel Char1;
    private javax.swing.JLabel Char2;
    private javax.swing.JLabel Char3;
    private javax.swing.JLabel Char4;
    private javax.swing.JLabel Char5;
    private javax.swing.JTextField aLetter;
    private javax.swing.JLabel inCorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel myMessage;
    private javax.swing.JLabel myMessage1;
    private javax.swing.JButton tryLetter;
    // End of variables declaration//GEN-END:variables
}
