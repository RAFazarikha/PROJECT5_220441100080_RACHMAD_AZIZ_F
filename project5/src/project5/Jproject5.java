/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project5;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Jproject5 extends javax.swing.JFrame {
    DefaultComboBoxModel<String> modelcb = new DefaultComboBoxModel<>();
    int hargaBarang;

    /**
     * Creates new form Jproject5
     */
    public Jproject5() {
        initComponents();
        cbbarang.setModel(modelcb);
        modelcb.addElement("--- Pilih Barang ---");
        fillComboBox();
        tampil_data();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cbbarang = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fkodebeli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fkodebarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fhargabarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fnamabeli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fjumlahbeli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ftotalharga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ftotalbayar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fkembalian = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jdata = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        barang = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        fkodebeli1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fkodebarang1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fhargabarang1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fnamabeli1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fjumlahbeli1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ftotalharga1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ftotalbayar1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fkembalian1 = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(62, 0, 255));
        jTabbedPane1.setForeground(new java.awt.Color(181, 255, 217));
        jTabbedPane1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(62, 0, 255));

        jPanel3.setBackground(new java.awt.Color(62, 0, 255));
        jPanel3.setLayout(new java.awt.GridLayout(5, 0, 10, 10));

        cbbarang.setBackground(new java.awt.Color(181, 255, 217));
        cbbarang.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        cbbarang.setForeground(new java.awt.Color(23, 0, 85));
        cbbarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Barang ---" }));
        cbbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbarangActionPerformed(evt);
            }
        });
        jPanel3.add(cbbarang);

        jPanel4.setBackground(new java.awt.Color(62, 0, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(181, 255, 217));
        jLabel1.setLabelFor(fkodebeli);
        jLabel1.setText("Kode Pembelian");
        jPanel3.add(jLabel1);

        fkodebeli.setBackground(new java.awt.Color(181, 255, 217));
        fkodebeli.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fkodebeli.setForeground(new java.awt.Color(23, 0, 85));
        jPanel3.add(fkodebeli);

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(181, 255, 217));
        jLabel2.setLabelFor(fkodebarang);
        jLabel2.setText("Kode Barang");
        jPanel3.add(jLabel2);

        fkodebarang.setBackground(new java.awt.Color(181, 255, 217));
        fkodebarang.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fkodebarang.setForeground(new java.awt.Color(23, 0, 85));
        jPanel3.add(fkodebarang);

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(181, 255, 217));
        jLabel3.setLabelFor(fhargabarang);
        jLabel3.setText("Harga Barang");
        jPanel3.add(jLabel3);

        fhargabarang.setBackground(new java.awt.Color(181, 255, 217));
        fhargabarang.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fhargabarang.setForeground(new java.awt.Color(23, 0, 85));
        jPanel3.add(fhargabarang);

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(181, 255, 217));
        jLabel4.setLabelFor(fnamabeli);
        jLabel4.setText("Nama Pembeli");
        jPanel3.add(jLabel4);

        fnamabeli.setBackground(new java.awt.Color(181, 255, 217));
        fnamabeli.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fnamabeli.setForeground(new java.awt.Color(23, 0, 85));
        jPanel3.add(fnamabeli);

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(181, 255, 217));
        jLabel5.setLabelFor(fjumlahbeli);
        jLabel5.setText("Jumlah Pembelian");
        jPanel3.add(jLabel5);

        fjumlahbeli.setBackground(new java.awt.Color(181, 255, 217));
        fjumlahbeli.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fjumlahbeli.setForeground(new java.awt.Color(23, 0, 85));
        jPanel3.add(fjumlahbeli);

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(181, 255, 217));
        jLabel6.setLabelFor(ftotalharga);
        jLabel6.setText("Total Harga");
        jPanel3.add(jLabel6);

        ftotalharga.setEditable(false);
        ftotalharga.setBackground(new java.awt.Color(181, 255, 217));
        ftotalharga.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ftotalharga.setForeground(new java.awt.Color(23, 0, 85));
        jPanel3.add(ftotalharga);

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(181, 255, 217));
        jLabel7.setLabelFor(ftotalbayar);
        jLabel7.setText("Total Pembayaran");
        jPanel3.add(jLabel7);

        ftotalbayar.setBackground(new java.awt.Color(181, 255, 217));
        ftotalbayar.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ftotalbayar.setForeground(new java.awt.Color(23, 0, 85));
        jPanel3.add(ftotalbayar);

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(181, 255, 217));
        jLabel8.setLabelFor(fkembalian);
        jLabel8.setText("Kembalian");
        jPanel3.add(jLabel8);

        fkembalian.setEditable(false);
        fkembalian.setBackground(new java.awt.Color(181, 255, 217));
        fkembalian.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fkembalian.setForeground(new java.awt.Color(23, 0, 85));
        jPanel3.add(fkembalian);

        btnreset.setBackground(new java.awt.Color(181, 255, 217));
        btnreset.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(23, 0, 85));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset);

        btnhitung.setBackground(new java.awt.Color(181, 255, 217));
        btnhitung.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnhitung.setForeground(new java.awt.Color(23, 0, 85));
        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        jPanel3.add(btnhitung);

        btnsimpan.setBackground(new java.awt.Color(181, 255, 217));
        btnsimpan.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(23, 0, 85));
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Input Data", jPanel2);

        jPanel1.setBackground(new java.awt.Color(62, 0, 255));

        jdata.setBackground(new java.awt.Color(181, 255, 217));
        jdata.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jdata.setForeground(new java.awt.Color(23, 0, 85));
        jdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Pembelian", "Kode Barang", "Nama Barang", "Harga Barang", "Nama Pembeli", "Jumlah Pembelian", "Total Harga", "Total Pembayaran", "Kembalian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jdata.setUpdateSelectionOnSort(false);
        jdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jdata);

        jInternalFrame1.setBackground(new java.awt.Color(62, 0, 255));
        jInternalFrame1.setVisible(true);

        jPanel6.setBackground(new java.awt.Color(62, 0, 255));
        jPanel6.setLayout(new java.awt.GridLayout(5, 0, 10, 10));

        barang.setEditable(false);
        barang.setBackground(new java.awt.Color(181, 255, 217));
        barang.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        barang.setForeground(new java.awt.Color(23, 0, 85));
        barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangActionPerformed(evt);
            }
        });
        jPanel6.add(barang);

        jPanel7.setBackground(new java.awt.Color(62, 0, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7);

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(181, 255, 217));
        jLabel12.setLabelFor(fkodebeli);
        jLabel12.setText("Kode Pembelian");
        jPanel6.add(jLabel12);

        fkodebeli1.setEditable(false);
        fkodebeli1.setBackground(new java.awt.Color(181, 255, 217));
        fkodebeli1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fkodebeli1.setForeground(new java.awt.Color(23, 0, 85));
        jPanel6.add(fkodebeli1);

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(181, 255, 217));
        jLabel13.setLabelFor(fkodebarang);
        jLabel13.setText("Kode Barang");
        jPanel6.add(jLabel13);

        fkodebarang1.setEditable(false);
        fkodebarang1.setBackground(new java.awt.Color(181, 255, 217));
        fkodebarang1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fkodebarang1.setForeground(new java.awt.Color(23, 0, 85));
        jPanel6.add(fkodebarang1);

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(181, 255, 217));
        jLabel14.setLabelFor(fhargabarang);
        jLabel14.setText("Harga Barang");
        jPanel6.add(jLabel14);

        fhargabarang1.setBackground(new java.awt.Color(181, 255, 217));
        fhargabarang1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fhargabarang1.setForeground(new java.awt.Color(23, 0, 85));
        jPanel6.add(fhargabarang1);

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(181, 255, 217));
        jLabel15.setLabelFor(fnamabeli);
        jLabel15.setText("Nama Pembeli");
        jPanel6.add(jLabel15);

        fnamabeli1.setBackground(new java.awt.Color(181, 255, 217));
        fnamabeli1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fnamabeli1.setForeground(new java.awt.Color(23, 0, 85));
        jPanel6.add(fnamabeli1);

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(181, 255, 217));
        jLabel16.setLabelFor(fjumlahbeli);
        jLabel16.setText("Jumlah Pembelian");
        jPanel6.add(jLabel16);

        fjumlahbeli1.setBackground(new java.awt.Color(181, 255, 217));
        fjumlahbeli1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fjumlahbeli1.setForeground(new java.awt.Color(23, 0, 85));
        jPanel6.add(fjumlahbeli1);

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(181, 255, 217));
        jLabel17.setLabelFor(ftotalharga);
        jLabel17.setText("Total Harga");
        jPanel6.add(jLabel17);

        ftotalharga1.setBackground(new java.awt.Color(181, 255, 217));
        ftotalharga1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ftotalharga1.setForeground(new java.awt.Color(23, 0, 85));
        jPanel6.add(ftotalharga1);

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(181, 255, 217));
        jLabel18.setLabelFor(ftotalbayar);
        jLabel18.setText("Total Pembayaran");
        jPanel6.add(jLabel18);

        ftotalbayar1.setBackground(new java.awt.Color(181, 255, 217));
        ftotalbayar1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ftotalbayar1.setForeground(new java.awt.Color(23, 0, 85));
        jPanel6.add(ftotalbayar1);

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(181, 255, 217));
        jLabel19.setLabelFor(fkembalian);
        jLabel19.setText("Kembalian");
        jPanel6.add(jLabel19);

        fkembalian1.setBackground(new java.awt.Color(181, 255, 217));
        fkembalian1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fkembalian1.setForeground(new java.awt.Color(23, 0, 85));
        jPanel6.add(fkembalian1);

        btndelete.setBackground(new java.awt.Color(181, 255, 217));
        btndelete.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(23, 0, 85));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel6.add(btndelete);

        btnupdate.setBackground(new java.awt.Color(181, 255, 217));
        btnupdate.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(23, 0, 85));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel6.add(btnupdate);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jInternalFrame1)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Penjualan", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        fkodebeli.setText("");
        fkodebarang.setText("");
        fhargabarang.setText("");
        fnamabeli.setText("");
        fjumlahbeli.setText("");
        ftotalharga.setText("");
        ftotalbayar.setText("");
        fkembalian.setText("");
        cbbarang.setSelectedIndex(0);
    }//GEN-LAST:event_btnresetActionPerformed

    private void fillComboBox() {
        try {
            // Buat koneksi ke database
            java.sql.Connection conn = project5.Project5.koneksiDB();
            // Buat query SQL untuk mengambil data
            String query = "SELECT nama_barang FROM data_barang";
            
            // Persiapkan statement SQL
            java.sql.PreparedStatement pst = conn.prepareStatement(query);
            
            // Eksekusi query
            ResultSet rs = pst.executeQuery();
            
            // Isi combobox dengan data dari database
            while (rs.next()) {
                String item = rs.getString(1); // 1 adalah indeks kolom data yang akan diambil
                if (!containsItem(item)) {
                    modelcb.addElement(item);
                }
            }
            
            // Tutup koneksi dan resource
            rs.close();
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
    
    private boolean containsItem(String item) {
        for (int i = 0; i < modelcb.getSize(); i++) {
            if (modelcb.getElementAt(i).equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    private void cbbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbarangActionPerformed
        // TODO add your handling code here:
        String selectedBarang = (String) cbbarang.getSelectedItem();
        try {
            java.sql.Connection conn = project5.Project5.koneksiDB();
            String query = "SELECT kode_barang, harga_barang FROM data_barang WHERE nama_barang = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, selectedBarang);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                fkodebarang.setText(rs.getString("kode_barang"));
                hargaBarang = rs.getInt("harga_barang");
                fhargabarang.setText(String.valueOf(hargaBarang));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbbarangActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        // TODO add your handling code here:
        if (fjumlahbeli.getText().isEmpty() || ftotalbayar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Masukkan Jumlah Pembelian dan Jumlah Pembayaran Dengan Benar", "Tidak Boleh Kosong", JOptionPane.ERROR_MESSAGE);
        }else{
            int jumlahbeli = Integer.parseInt(fjumlahbeli.getText());
            int totalharga = hargaBarang * jumlahbeli;
            int totalbayar = Integer.parseInt(ftotalbayar.getText());
            int kembalian = totalbayar - totalharga;
            ftotalharga.setText(Integer.toString(totalharga));
            fkembalian.setText(Integer.toString(kembalian));
        }
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        if (ftotalharga.getText().isEmpty() && fkembalian.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tekan Tombol Hitung Terlebih Dahulu", "Tidak Boleh Kosong", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                String sql = "insert into data_pembelian values('"+fkodebeli.getText()+"', '"+fkodebarang.getText()+"', '"+cbbarang.getSelectedItem()+"', '"+fhargabarang.getText()+"', '"+fnamabeli.getText()+"', '"+fjumlahbeli.getText()+"', '"+ftotalharga.getText()+"', '"+ftotalbayar.getText()+"', '"+fkembalian.getText()+"')";
                java.sql.Connection conn = (java.sql.Connection)project5.Project5.koneksiDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil disimpan");
                btnresetActionPerformed(evt);
                tampil_data();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Gagal disimpan");
                System.out.println(e.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void jdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdataMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modeldata = (DefaultTableModel) jdata.getModel();
        int selectedRow = jdata.getSelectedRow();
        if (selectedRow != -1) { // Pastikan baris yang dipilih valid
            fkodebeli1.setText(modeldata.getValueAt(selectedRow, 0).toString()); // Kolom 1 (Kode Pembelian)
            fkodebarang1.setText(modeldata.getValueAt(selectedRow, 1).toString()); // Kolom 2 (Kode Barang)
            barang.setText(modeldata.getValueAt(selectedRow, 2).toString());
            fhargabarang1.setText(modeldata.getValueAt(selectedRow, 3).toString());
            // Isi teksfield lainnya sesuai dengan kolom yang sesuai
            fnamabeli1.setText(modeldata.getValueAt(selectedRow, 4).toString()); // Kolom 5 (Nama Pembeli)
            fjumlahbeli1.setText(modeldata.getValueAt(selectedRow, 5).toString()); // Kolom 6 (Jumlah Pembelian)
            ftotalharga1.setText(modeldata.getValueAt(selectedRow, 6).toString()); // Kolom 7 (Total Harga)
            ftotalbayar1.setText(modeldata.getValueAt(selectedRow, 7).toString()); // Kolom 8 (Total Pembayaran)
            fkembalian1.setText(modeldata.getValueAt(selectedRow, 8).toString()); // Kolom 9 (Kembalian)
        }
    }//GEN-LAST:event_jdataMouseClicked

    private void barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_barangActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modeldata = (DefaultTableModel) jdata.getModel();
        int selectedRow = jdata.getSelectedRow();
        if (selectedRow != -1){
            try{
                String sql = "DELETE FROM data_pembelian WHERE kode_pembelian = '"+modeldata.getValueAt(selectedRow, 0)+"' ";
                java.sql.Connection conn = (java.sql.Connection)project5.Project5.koneksiDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
                tampil_data();
                fkodebeli1.setText("");
                fkodebarang1.setText("");
                fhargabarang1.setText("");
                fnamabeli1.setText("");
                fjumlahbeli1.setText("");
                ftotalharga1.setText("");
                ftotalbayar1.setText("");
                fkembalian1.setText("");
                barang.setText("");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Gagal Dihapus");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
                DefaultTableModel modeldata = (DefaultTableModel) jdata.getModel();
        int selectedRow = jdata.getSelectedRow();
        if (selectedRow != -1){
            try{
                String sql = "UPDATE data_pembelian SET kode_pembelian = '"+fkodebeli1.getText()+"', kode_barang = '"+fkodebarang1.getText()+"',"
                        + "nama_barang = '"+barang.getText()+"', harga_barang = '"+fhargabarang1.getText()+"', "
                        + "nama_pembeli = '"+fnamabeli1.getText()+"', jumlah_pembelian = '"+fjumlahbeli1.getText()+"', "
                        + "total_harga = '"+ftotalharga1.getText()+"', total_pembayaran = '"+ftotalbayar1.getText()+"', "
                        + "kembalian = '"+fkembalian1.getText()+"' WHERE kode_pembelian = '"+modeldata.getValueAt(selectedRow, 0)+"'";
                java.sql.Connection conn = (java.sql.Connection)project5.Project5.koneksiDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Diupdate");
                tampil_data();
                fkodebeli1.setText("");
                fkodebarang1.setText("");
                fhargabarang1.setText("");
                fnamabeli1.setText("");
                fjumlahbeli1.setText("");
                ftotalharga1.setText("");
                ftotalbayar1.setText("");
                fkembalian1.setText("");
                barang.setText("");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Gagal Diupdate");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    public void tampil_data(){
        DefaultTableModel tabeldata = new DefaultTableModel();
        tabeldata.addColumn("Kode Pembelian");
        tabeldata.addColumn("Kode Barang");
        tabeldata.addColumn("Nama Barang");
        tabeldata.addColumn("Harga Barang");
        tabeldata.addColumn("Nama Pembeli");
        tabeldata.addColumn("Jumlah Pembelian");
        tabeldata.addColumn("Total Harga");
        tabeldata.addColumn("Total Bayar");
        tabeldata.addColumn("Kembalian");
        
        try{
            java.sql.Connection conn = project5.Project5.koneksiDB();
            String query = "select * from data_pembelian";
            java.sql.PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                Object[] row = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)};
                tabeldata.addRow(row);
            }
            jdata.setModel(tabeldata);
        }catch (Exception e){
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(Jproject5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jproject5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jproject5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jproject5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jproject5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barang;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbbarang;
    private javax.swing.JTextField fhargabarang;
    private javax.swing.JTextField fhargabarang1;
    private javax.swing.JTextField fjumlahbeli;
    private javax.swing.JTextField fjumlahbeli1;
    private javax.swing.JTextField fkembalian;
    private javax.swing.JTextField fkembalian1;
    private javax.swing.JTextField fkodebarang;
    private javax.swing.JTextField fkodebarang1;
    private javax.swing.JTextField fkodebeli;
    private javax.swing.JTextField fkodebeli1;
    private javax.swing.JTextField fnamabeli;
    private javax.swing.JTextField fnamabeli1;
    private javax.swing.JTextField ftotalbayar;
    private javax.swing.JTextField ftotalbayar1;
    private javax.swing.JTextField ftotalharga;
    private javax.swing.JTextField ftotalharga1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jdata;
    // End of variables declaration//GEN-END:variables
}
