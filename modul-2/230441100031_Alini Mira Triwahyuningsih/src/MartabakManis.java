/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO V13 HENDRIK
 */
public class MartabakManis extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MartabakManis() {
        initComponents();
        buttontotal.setEditable(false);
        buttonkembalian.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttongroupmenu = new javax.swing.ButtonGroup();
        buttonGroupToping = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kacangsusu = new javax.swing.JRadioButton();
        coklatsusu = new javax.swing.JRadioButton();
        pisangsusu = new javax.swing.JRadioButton();
        durensusu = new javax.swing.JRadioButton();
        pisangcoklat = new javax.swing.JRadioButton();
        spesialkeju = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        topingkeju = new javax.swing.JRadioButton();
        topingcoklat = new javax.swing.JRadioButton();
        topingduren = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        buttonkurang = new javax.swing.JButton();
        buttonjumlah = new javax.swing.JTextField();
        buttonpertambahan = new javax.swing.JButton();
        buttontotal = new javax.swing.JTextField();
        buttonsamadengan = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttoncash = new javax.swing.JTextField();
        buttonkembalian = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        notoping = new javax.swing.JRadioButton();
        buttonreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel1.setText("MARTABAK JAKARTA");

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel2.setText("PAK SELAMET");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("No.Telp: 08354827332");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenov\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-10-05 084540.png")); // NOI18N
        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Menu Martabak:");

        buttongroupmenu.add(kacangsusu);
        kacangsusu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kacangsusu.setText("Kacang Susu-Rp. 13.000");

        buttongroupmenu.add(coklatsusu);
        coklatsusu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        coklatsusu.setText("Coklat Susu-Rp. 13.000");
        coklatsusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coklatsusuActionPerformed(evt);
            }
        });

        buttongroupmenu.add(pisangsusu);
        pisangsusu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pisangsusu.setText("Pisang Susu-Rp. 14.000");

        buttongroupmenu.add(durensusu);
        durensusu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        durensusu.setText("Duren Susu-Rp. 18.000");
        durensusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durensusuActionPerformed(evt);
            }
        });

        buttongroupmenu.add(pisangcoklat);
        pisangcoklat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pisangcoklat.setText("Pisang Coklat-Rp. 16.000");

        buttongroupmenu.add(spesialkeju);
        spesialkeju.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spesialkeju.setText("Spesial Keju-Rp. 17.000");
        spesialkeju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spesialkejuActionPerformed(evt);
            }
        });

        jLabel5.setText("==========================================================================");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Tambah Toping:");

        buttonGroupToping.add(topingkeju);
        topingkeju.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        topingkeju.setText("Keju-Rp. 3.000");

        buttonGroupToping.add(topingcoklat);
        topingcoklat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        topingcoklat.setText("Coklat-Rp.4.000");

        buttonGroupToping.add(topingduren);
        topingduren.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        topingduren.setText("Duren-Rp.6.000");
        topingduren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topingdurenActionPerformed(evt);
            }
        });

        jLabel7.setText("==========================================================================");

        buttonkurang.setText("-");
        buttonkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkurangActionPerformed(evt);
            }
        });

        buttonjumlah.setText("1");
        buttonjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonjumlahActionPerformed(evt);
            }
        });

        buttonpertambahan.setText("+");
        buttonpertambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpertambahanActionPerformed(evt);
            }
        });

        buttontotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontotalActionPerformed(evt);
            }
        });

        buttonsamadengan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonsamadengan.setText("=");
        buttonsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsamadenganActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Jumlah");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Total");

        jLabel10.setText("-----------------------------------------------------------------------------------------------------------------");

        buttoncash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncashActionPerformed(evt);
            }
        });
        buttoncash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buttoncashKeyReleased(evt);
            }
        });

        buttonkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkembalianActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Cash");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Kembali");

        buttonGroupToping.add(notoping);
        notoping.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        notoping.setText("No Toping-RP.0");

        buttonreset.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        buttonreset.setText("RESET");
        buttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(224, 224, 224)
                .addComponent(jLabel9)
                .addGap(275, 275, 275))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pisangsusu, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(kacangsusu)
                                        .addGap(72, 72, 72)
                                        .addComponent(durensusu)))
                                .addGap(64, 64, 64)
                                .addComponent(spesialkeju))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(coklatsusu)
                                .addGap(77, 77, 77)
                                .addComponent(pisangcoklat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(topingkeju)
                                .addGap(71, 71, 71)
                                .addComponent(topingcoklat)
                                .addGap(51, 51, 51)
                                .addComponent(topingduren)
                                .addGap(27, 27, 27)
                                .addComponent(notoping))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel11)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(buttoncash, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(84, 84, 84)
                            .addComponent(buttonkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonreset))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(buttonkurang)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buttonjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buttonpertambahan)
                                    .addGap(18, 18, 18)
                                    .addComponent(buttonsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(buttontotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kacangsusu)
                    .addComponent(durensusu)
                    .addComponent(spesialkeju))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coklatsusu)
                    .addComponent(pisangcoklat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pisangsusu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topingkeju)
                    .addComponent(topingcoklat)
                    .addComponent(topingduren)
                    .addComponent(notoping))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonpertambahan)
                            .addComponent(buttonkurang)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttontotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttoncash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonreset))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topingdurenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topingdurenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topingdurenActionPerformed

    private void buttonkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkurangActionPerformed
        // TODO add your handling code here:
        String jumlah;
        jumlah = buttonjumlah.getText();
        
        int jumlahInteger = Integer.parseInt(jumlah);// buat ngubah tadinya string jadi integer
        if (jumlahInteger==1){
            return;
        }
        
        buttonjumlah.setText(Integer.toString(jumlahInteger - 1));
    }//GEN-LAST:event_buttonkurangActionPerformed

    private void buttonsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsamadenganActionPerformed
        int hargamartabak = 0;
        int hargatoping =0;
        
        if (kacangsusu.isSelected()){
            hargamartabak = 13000;
        } else if (coklatsusu.isSelected()){
            hargamartabak = 13000;
        } else if (pisangsusu.isSelected()){
            hargamartabak = 14000;
        } else if (durensusu.isSelected()){
            hargamartabak = 18000;
        } else if (pisangcoklat.isSelected()){
            hargamartabak = 16000;
        }else if (spesialkeju.isSelected()){
            hargamartabak = 17000;
        }
        
        if (topingkeju.isSelected()){
            hargatoping = 3000;
        } else if (topingcoklat.isSelected()){
            hargatoping = 4000;
        } else if (topingduren.isSelected()){
            hargatoping = 6000;
        } else if (notoping.isSelected()){
            hargatoping = 0;
        }
        
        if (hargamartabak == 0 || hargatoping == 0){//jika salah satu ada yang noll maka akan muncul peringatan 
            JOptionPane.showMessageDialog(null, "Isi Pesanan Terlebih Dahulu", "Peringatan",JOptionPane.INFORMATION_MESSAGE);
        }
       
        String total=buttonjumlah.getText();
        int jumlahinteger=Integer.parseInt(total);
        int totalsemua =(hargamartabak + hargatoping)* jumlahinteger;
        
        if (totalsemua > 100000){
            totalsemua=totalsemua*95/100;
        }
        buttontotal.setText(Integer.toString(totalsemua));
        
    }//GEN-LAST:event_buttonsamadenganActionPerformed

    private void buttonjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonjumlahActionPerformed
        
    }//GEN-LAST:event_buttonjumlahActionPerformed

    private void spesialkejuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spesialkejuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spesialkejuActionPerformed

    private void durensusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durensusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durensusuActionPerformed

    private void coklatsusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coklatsusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coklatsusuActionPerformed

    private void buttonpertambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpertambahanActionPerformed
        // TODO add your handling code here:
        String jumlah;
        jumlah = buttonjumlah.getText();
        
        int jumlahInteger = Integer.parseInt(jumlah);// buat ngubah tadinya string jadi integer
        
        buttonjumlah.setText(Integer.toString(jumlahInteger + 1));
    }//GEN-LAST:event_buttonpertambahanActionPerformed

    private void buttoncashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncashActionPerformed

    private void buttoncashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttoncashKeyReleased
        // TODO add your handling code here:
        String cash=buttoncash.getText();
        int cashinteger = Integer.parseInt(cash);
        
        String total = buttontotal.getText();
        int totalinteger = Integer.parseInt(total);
        
        buttonkembalian.setText(Integer.toString(cashinteger - totalinteger));
        
    }//GEN-LAST:event_buttoncashKeyReleased

    private void buttontotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttontotalActionPerformed

    private void buttonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonresetActionPerformed
        // TODO add your handling code here:
        buttongroupmenu.clearSelection();
        buttonGroupToping.clearSelection();
        buttonjumlah.setText(null);
        buttontotal.setText(null);
        buttoncash.setText(null);
        buttonkembalian.setText(null);
    }//GEN-LAST:event_buttonresetActionPerformed

    private void buttonkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonkembalianActionPerformed

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
            java.util.logging.Logger.getLogger(MartabakManis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MartabakManis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MartabakManis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MartabakManis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MartabakManis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupToping;
    private javax.swing.JTextField buttoncash;
    private javax.swing.ButtonGroup buttongroupmenu;
    private javax.swing.JTextField buttonjumlah;
    private javax.swing.JTextField buttonkembalian;
    private javax.swing.JButton buttonkurang;
    private javax.swing.JButton buttonpertambahan;
    private javax.swing.JButton buttonreset;
    private javax.swing.JButton buttonsamadengan;
    private javax.swing.JTextField buttontotal;
    private javax.swing.JRadioButton coklatsusu;
    private javax.swing.JRadioButton durensusu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton kacangsusu;
    private javax.swing.JRadioButton notoping;
    private javax.swing.JRadioButton pisangcoklat;
    private javax.swing.JRadioButton pisangsusu;
    private javax.swing.JRadioButton spesialkeju;
    private javax.swing.JRadioButton topingcoklat;
    private javax.swing.JRadioButton topingduren;
    private javax.swing.JRadioButton topingkeju;
    // End of variables declaration//GEN-END:variables
}