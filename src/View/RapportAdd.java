package View;

import Controller.MysqlConnection;
import Controller.RapportController;
import View.EchantillonAdd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
/**
 *
 * @author Gael Bernaténé
 */
public class RapportAdd extends javax.swing.JFrame 
{
    PreparedStatement pst = null;
    Statement st = null;
    ResultSet rs = null;
    String query = "";
    private int id_rapport;
    private int id_utilisateur;
    
    /**
     * Constructeur. Il affiche la Vue permettant d'ajouter les 
     * rapports de visite , les paramètres ont été envoyé depuis la vue 
     * MenuVisiteur
     * @param id_utilisateur
     * @param id_rapport
     */
    public RapportAdd(int id_rapport, int id_utilisateur) {
        initComponents();
        Show_Combo_Praticien();
        this.id_rapport = id_rapport;
        this.id_utilisateur = id_utilisateur;
        button_ok.setVisible(false);
        label_ajouter_echantillon.setVisible(false);
        label_attention.setVisible(false);
              
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        L_praticien = new javax.swing.JLabel();
        c_praticien = new javax.swing.JComboBox<>();
        L_date = new javax.swing.JLabel();
        L_motif = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_bilan = new javax.swing.JTextArea();
        L_bilan = new javax.swing.JLabel();
        T_motif = new javax.swing.JTextField();
        b_valider = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        B_ajouter_echantillon_ = new javax.swing.JButton();
        d_rapport = new org.jdesktop.swingx.JXDatePicker();
        b_annuler = new javax.swing.JButton();
        label_ajouter_echantillon = new javax.swing.JLabel();
        button_ok = new javax.swing.JButton();
        label_attention = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("                                                RAPPORTS DE VISITE");

        L_praticien.setText("Praticien :");

        c_praticien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_praticienActionPerformed(evt);
            }
        });

        L_date.setText("Date de Rapport :");

        L_motif.setText("Motif de Visite :");

        T_bilan.setColumns(20);
        T_bilan.setRows(5);
        jScrollPane1.setViewportView(T_bilan);

        L_bilan.setText("BILAN :");

        b_valider.setText("VALIDER");
        b_valider.setEnabled(false);
        b_valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_validerMouseClicked(evt);
            }
        });

        jLabel2.setText("Ajouter un échantillon : ");

        B_ajouter_echantillon_.setText("Ajouter");
        B_ajouter_echantillon_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ajouter_echantillon_MouseClicked(evt);
            }
        });

        b_annuler.setText("ANNULER");
        b_annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_annulerMouseClicked(evt);
            }
        });

        label_ajouter_echantillon.setText("Ajouter  de nouveau un échantillon ? :");

        button_ok.setText("ok");
        button_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_okActionPerformed(evt);
            }
        });

        label_attention.setText("ATTENTION annule le précédent échantillon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_motif)
                            .addComponent(L_praticien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_bilan))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(L_date, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d_rapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_praticien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_motif, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_annuler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_ajouter_echantillon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(B_ajouter_echantillon_, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(label_attention, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_praticien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(B_ajouter_echantillon_)
                    .addComponent(c_praticien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_date)
                    .addComponent(d_rapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_motif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_motif)
                            .addComponent(label_ajouter_echantillon)
                            .addComponent(button_ok))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(L_bilan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b_valider)
                                    .addComponent(b_annuler))
                                .addContainerGap(52, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(label_attention)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_praticienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_praticienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_praticienActionPerformed
    
    /**
     * Cette fonction permet de valider le rapport de Visite et
     * de le Stocker en base
     * @param evt
     */
    private void b_validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_validerMouseClicked
        
        String praticien = c_praticien.getSelectedItem().toString().substring(0, 1);
        int praticienId = Integer.parseInt(praticien);
        
        int id_visiteur = 0; // recupere l'id du visiteur
        //JOptionPane.showMessageDialog(rootPane, praticienId);

        java.util.Date utilDate = d_rapport.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        
        
        RapportController rapport = new RapportController();
    
       
        try 
        {   
            id_visiteur = rapport.getVisiteurId(id_utilisateur);
        } catch (SQLException ex) 
        {
            Logger.getLogger(RapportAdd.class.getName()).log(Level.SEVERE, null, ex);
        }


        // Mets à jours la table Rapport de visite
        try 
        {
            Connection connection = MysqlConnection.ConnectDB();
           
            String query = "UPDATE `rapportdevisite` SET `motifvisite` = ?, `bilan` = ?, `date_visite` = ?, `id_visiteur` = ?, `id_praticien` = ? WHERE `rapportdevisite`.`id_rapport` = "+ this.id_rapport;
            pst = connection.prepareStatement(query);
            pst.setString(1, T_bilan.getText());
            pst.setString(2, T_motif.getText());
            pst.setDate(3, sqlDate);
            pst.setInt(4, id_visiteur);
            pst.setInt(5, praticienId);
            pst.executeUpdate();  
            pst.close();
            this.setVisible(false);
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_b_validerMouseClicked
    
    /**
     * Permet de créer l'échantillon à partir des étapes
     * suivantes:
     * - Insère dans la table échantillon une ref_echantillon ainsi que l'id du
     * rapport passer en paramètre dans le Constructeur de la classe RapportAdd
     * - Retourne la dernière id inséré
     * - Retourne la vue EchantillonAdd pour compléter l'échantillon et passe en
     * paramètre la dernière id inséré. La dernière id inséré est récupérée à la
     * 2ème étape grâce à la méthode Statement.RETURN_GENERATED_KEYS. On passe 
     * aussi en paramètre à la vue EchantillonAdd l'id_rapport.
     * @param evt
     */
    private void B_ajouter_echantillon_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ajouter_echantillon_MouseClicked
        //Génère aléatoirement une référence à l'échantillon
        Random r = new Random();
        int max = 9999999;
        int min = 1000001;
        int key = 0;
        
        int valeur = min + r.nextInt(max - min);
        String nbr = Integer.toString(valeur);
        String ref = "ref_"+ nbr;
        
        String sql = "INSERT INTO echantillon(ref_echantillon, id_rapport) VALUES (?, ?)";
        
        try 
        {  
           Connection cnx = MysqlConnection.ConnectDB();
            PreparedStatement prest;
            prest = cnx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prest.setString(1,ref);
            prest.setInt(2, this.id_rapport);
            prest.executeUpdate();
            ResultSet rs = prest.getGeneratedKeys();
            if(rs.next())
            {
                key = rs.getInt(1);
                EchantillonAdd ech = new EchantillonAdd(key, this.id_rapport);
                // Dégrise le bouton "valider" le rapport
                b_valider.setEnabled(true);
                button_ok.setVisible(true);
                label_ajouter_echantillon.setVisible(true);
                label_attention.setVisible(true);
                B_ajouter_echantillon_.setVisible(false);
                jLabel2.setVisible(false);
                ech.setVisible(true);
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_B_ajouter_echantillon_MouseClicked
    /**
     * Au cas où on clique sur le bouton annulé , celui-çi
     * détruit le rapport de visite en cours de création.
     * @param evt
     */
    private void b_annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_annulerMouseClicked
        Connection connection = MysqlConnection.ConnectDB();
        String sql = "DELETE FROM rapportdevisite WHERE "+this.id_rapport;
        try {
            st = connection.createStatement();
            st.executeUpdate(sql);
        this.setVisible(false);
        } catch (SQLException ex) {
            ex.getMessage();
        }       
    }//GEN-LAST:event_b_annulerMouseClicked

    private void button_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_okActionPerformed
        button_ok.setVisible(false);
        label_ajouter_echantillon.setVisible(false);
        label_attention.setVisible(false);
        B_ajouter_echantillon_.setVisible(true);
        jLabel2.setVisible(true);
    }//GEN-LAST:event_button_okActionPerformed

    /**
     * Permet d'afficher dans la comboBox 
     * La liste des praticiens. Cette fonction est appelé dans le constructeur
     */
    public void Show_Combo_Praticien()
    {
        try 
        {
            Connection connection = MysqlConnection.ConnectDB();
            Statement st = connection.createStatement();
            String query = "SELECT * FROM praticien";
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {      
                c_praticien.addItem(rs.getInt("id_praticien")+ " " + rs.getString("nom") + " " + rs.getString("prenom"));
            }//end while
            connection.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(RapportAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RapportAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RapportAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RapportAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_ajouter_echantillon_;
    private javax.swing.JLabel L_bilan;
    private javax.swing.JLabel L_date;
    private javax.swing.JLabel L_motif;
    private javax.swing.JLabel L_praticien;
    private javax.swing.JTextArea T_bilan;
    private javax.swing.JTextField T_motif;
    private javax.swing.JButton b_annuler;
    private javax.swing.JButton b_valider;
    private javax.swing.JButton button_ok;
    private javax.swing.JComboBox<String> c_praticien;
    private org.jdesktop.swingx.JXDatePicker d_rapport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_ajouter_echantillon;
    private javax.swing.JLabel label_attention;
    // End of variables declaration//GEN-END:variables
}
