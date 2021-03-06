/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w1620428
 */
import java.util.*;
public class GuessFrame extends javax.swing.JFrame {
    String[] WordFrame ={"cat","hello","tiger","help","frame"};
    
    Random random = new Random();
    int index = random.nextInt(5);
    String FindWord = WordFrame[index] ;
    int count=0;

    /**
     * Creates new form GuessFrame
     */
    public GuessFrame() {
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

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        RIGHT = new javax.swing.JLabel();
        won = new javax.swing.JLabel();
        lost = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        inCorrect1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Hangman = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Start Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 170, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Startgame1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        RIGHT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        RIGHT.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(RIGHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 700, 80));

        won.setIcon(new javax.swing.ImageIcon(getClass().getResource("/win.png"))); // NOI18N
        getContentPane().add(won, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        lost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gameover.jpg"))); // NOI18N
        lost.setText("jLabel4");
        getContentPane().add(lost, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 860, 550));

        Char0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Char0.setText("X");
        getContentPane().add(Char0, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        Char1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Char1.setText("X");
        getContentPane().add(Char1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        Char2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Char2.setText("X");
        getContentPane().add(Char2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        Char3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Char3.setText("X");
        getContentPane().add(Char3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        Char4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Char4.setText("X");
        getContentPane().add(Char4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        Char5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Char5.setText("X");
        getContentPane().add(Char5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        aLetter.setText("e");
        aLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLetterActionPerformed(evt);
            }
        });
        getContentPane().add(aLetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 90, 30));

        inCorrect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inCorrect.setText("0");
        getContentPane().add(inCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 10, 30));

        myMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myMessage.setText("Look Here");
        getContentPane().add(myMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        tryLetter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tryLetter.setText("Try Letter");
        tryLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryLetterActionPerformed(evt);
            }
        });
        getContentPane().add(tryLetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, 20));

        myMessage1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myMessage1.setText(".");
        getContentPane().add(myMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Chances used :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        inCorrect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100.png"))); // NOI18N
        inCorrect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCorrect1ActionPerformed(evt);
            }
        });
        getContentPane().add(inCorrect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 270, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("/5");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 30));

        Hangman.setForeground(new java.awt.Color(240, 240, 240));
        Hangman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startgame.png"))); // NOI18N
        Hangman.setText("jButton1");
        Hangman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HangmanActionPerformed(evt);
            }
        });
        getContentPane().add(Hangman, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 300, 420));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 860, 560));

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
        myMessage.setText("The position is " + charPos);
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
        if (charPos == -1) {

            int dd = Integer.parseInt(inCorrect.getText());

            dd = dd + 1;
            String ss = Integer.toString(dd);
            inCorrect.setText(ss);

            int ones = Integer.parseInt(inCorrect.getText());
            if (ones == 1) {
                inCorrect1.setIcon(new javax.swing.ImageIcon("80.png"));
                Hangman.setIcon(new javax.swing.ImageIcon("1.png"));
            }
            if (ones == 2) {
                inCorrect1.setIcon(new javax.swing.ImageIcon("60.png"));
                Hangman.setIcon(new javax.swing.ImageIcon("2.png"));
            }
            if (ones == 3) {
                inCorrect1.setIcon(new javax.swing.ImageIcon("40.png"));
                Hangman.setIcon(new javax.swing.ImageIcon("3.png"));
            }
            if (ones == 4) {
                inCorrect1.setIcon(new javax.swing.ImageIcon("20.png"));
                Hangman.setIcon(new javax.swing.ImageIcon("4.png"));
            }
            if (ones == 5) {
                RIGHT.setText("The word is " +FindWord);
            RIGHT.setVisible(true);
                lost.setVisible(true);

                inCorrect1.setIcon(new javax.swing.ImageIcon("0.png"));
                Hangman.setIcon(new javax.swing.ImageIcon("5.png"));
            }

        } else {
            
            count++;
            charPos = FindWord.indexOf(letter, charPos + 1);
            
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
        if (count == FindWord.length()) {
            System.out.println("game won");
            won.setVisible(true);
            RIGHT.setText("The word is " +FindWord);
            RIGHT.setVisible(true);
        }
        
    }//GEN-LAST:event_tryLetterActionPerformed

    private void inCorrect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCorrect1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inCorrect1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        lost.setVisible(false);
        won.setVisible(false);
        RIGHT.setVisible(false);

    }//GEN-LAST:event_formWindowOpened

    private void HangmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HangmanActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_HangmanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(false);
        jLabel4.setVisible(false);
        if (FindWord.length()==3)
        {
            Char3.setVisible(false);
            Char4.setVisible(false);
            Char5.setVisible(false);
        }

        else if (FindWord.length()==4){
            Char4.setVisible(false);
            Char5.setVisible(false);
        }
        else if(FindWord.length()==5)
        {
            Char5.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton Hangman;
    private javax.swing.JLabel RIGHT;
    private javax.swing.JTextField aLetter;
    private javax.swing.JLabel inCorrect;
    private javax.swing.JButton inCorrect1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lost;
    private javax.swing.JLabel myMessage;
    private javax.swing.JLabel myMessage1;
    private javax.swing.JButton tryLetter;
    private javax.swing.JLabel won;
    // End of variables declaration//GEN-END:variables
}
