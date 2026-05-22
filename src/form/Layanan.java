/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import component.ThemeColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rhmnsae
 */
public class Layanan extends javax.swing.JPanel {

    /**
     * Creates new form Layanan
     */
    public Layanan() {
        initComponents();
        
        tableLayanan.setModel(
            new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nama Item", "Tipe", "Harga", "Stok/Durasi", "Status", "Aksi"
                }
            ) {
                @Override
                public boolean isCellEditable(
                        int row,
                        int column
                ) {
                    return column == 5;
                }
            }
        );

        // search
        txtSearch.setHint("Cari item...");

        // header
        tableLayanan.getTableHeader().setOpaque(false);

        tableLayanan.getTableHeader().setBackground(
                ThemeColor.SURFACE_2
        );

        tableLayanan.getTableHeader().setForeground(
                ThemeColor.TEXT_MUTED
        );

        tableLayanan.getTableHeader().setFont(
                new java.awt.Font(
                        "SansSerif", java.awt.Font.BOLD, 50
                )
        );

        tableLayanan.getTableHeader().setBorder(null);

        tableLayanan.getTableHeader().setPreferredSize(
                new java.awt.Dimension(0, 40)
        );

        // table
        tableLayanan.setBackground(
                ThemeColor.SURFACE
        );

        tableLayanan.setForeground(
                ThemeColor.TEXT
        );

        tableLayanan.setRowHeight(56);

        tableLayanan.setFont(
                new java.awt.Font("SansSerif", java.awt.Font.PLAIN,  14)
        );

        tableLayanan.setSelectionBackground(
                ThemeColor.SURFACE
        );

        tableLayanan.setSelectionForeground(
                ThemeColor.TEXT
        );

        tableLayanan.setIntercellSpacing(
                new java.awt.Dimension(0, 0)
        );

        tableLayanan.setShowGrid(false);

        // scroll
        scrollTable.getVerticalScrollBar().setUI(
                new component.ModernScrollBarUI()
        );

        scrollTable.getVerticalScrollBar()
                .setPreferredSize(
                        new java.awt.Dimension(10, 0)
                );

       // container
        tableContainer.setBackground(
                ThemeColor.SURFACE
        );

        tableContainer.setRadius(20);

        tableContainer.setBorder(
                javax.swing.BorderFactory
                        .createEmptyBorder(15,  15, 15, 15)
        );

        // dropdown
        cbTier.setFocusable(false);

        cbTier.setBorder(null);

        cbTier.setBackground(
                ThemeColor.BACKGROUND
        );

        cbTier.setForeground(
                ThemeColor.TEXT
        );

        // scrollpane
        scrollTable.getViewport().setBackground(
                ThemeColor.SURFACE
        );

        scrollTable.setBackground(
                ThemeColor.SURFACE
        );

        scrollTable.setBorder(null);

        // fix table
        tableLayanan.getTableHeader()
                .setReorderingAllowed(false);

        tableLayanan.getTableHeader()
                .setResizingAllowed(false);

        tableLayanan.setAutoResizeMode(
                JTable.AUTO_RESIZE_OFF
        );

        int[] widths = {420, 160, 180, 220, 160, 248};

        for (int i = 0; i < widths.length; i++) {

            tableLayanan.getColumnModel()
                    .getColumn(i)
                    .setPreferredWidth(widths[i]);

            tableLayanan.getColumnModel()
                    .getColumn(i)
                    .setMinWidth(widths[i]);

            tableLayanan.getColumnModel()
                    .getColumn(i)
                    .setMaxWidth(widths[i]);
        }

       // renderer

        // tipe
        tableLayanan.getColumnModel()
                .getColumn(1)
                .setCellRenderer(
                        new table.TypeTableCellRenderer()
                );

        // stok
        tableLayanan.getColumnModel()
                .getColumn(3)
                .setCellRenderer(
                        new table.StockTableCellRenderer()
                );

        // status
        tableLayanan.getColumnModel()
                .getColumn(4)
                .setCellRenderer(
                        new table.StatusTableCellRenderer()
                );

        // aksi
        tableLayanan.getColumnModel()
                .getColumn(5)
                .setCellRenderer(
                        new table.ActionCellRenderer()
                );

        tableLayanan.getColumnModel()
                .getColumn(5)
                .setCellEditor(
                        new table.ActionCellEditor()
                );

        // =========================
        // DATA DUMMY
        // =========================
        DefaultTableModel model =
                (DefaultTableModel)
                        tableLayanan.getModel();

        model.addRow(new Object[]{
            "Gentleman Haircut",
            "Layanan",
            "Rp 45.000",
            "30 menit",
            "Aktif",
            ""
        });

        model.addRow(new Object[]{
            "Pomade Suavecito",
            "Produk",
            "Rp 85.000",
            "24 pcs",
            "Aktif",
            ""
        });

        model.addRow(new Object[]{
            "Shampoo Makarizo",
            "Produk",
            "Rp 55.000",
            "Stok 3",
            "Nonaktif",
            ""
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new component.ModernTextField();
        cbTier = new javax.swing.JComboBox<>();
        btnTambah = new component.ModernButton();
        tableContainer = new component.RoundedPanel();
        scrollTable = new javax.swing.JScrollPane();
        tableLayanan = new component.ModernTable();

        setBackground(new java.awt.Color(10, 10, 11));

        txtSearch.setPreferredSize(new java.awt.Dimension(250, 40));
        txtSearch.addActionListener(this::txtSearchActionPerformed);

        cbTier.setForeground(new java.awt.Color(255, 255, 255));
        cbTier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Item", "Layanan (Jasa)", "Produk (Barang)" }));
        cbTier.setPreferredSize(new java.awt.Dimension(140, 40));
        cbTier.addActionListener(this::cbTierActionPerformed);

        btnTambah.setText("+ Tambah Item");
        btnTambah.addActionListener(this::btnTambahActionPerformed);

        tableLayanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Item", "Tipe", "Harga", "Stok/Durasi", "Status", "Aksi"
            }
        ));
        scrollTable.setViewportView(tableLayanan);

        javax.swing.GroupLayout tableContainerLayout = new javax.swing.GroupLayout(tableContainer);
        tableContainer.setLayout(tableContainerLayout);
        tableContainerLayout.setHorizontalGroup(
            tableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 1388, Short.MAX_VALUE)
        );
        tableContainerLayout.setVerticalGroup(
            tableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbTier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tableContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void cbTierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTierActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.ModernButton btnTambah;
    private javax.swing.JComboBox<String> cbTier;
    private javax.swing.JScrollPane scrollTable;
    private component.RoundedPanel tableContainer;
    private component.ModernTable tableLayanan;
    private component.ModernTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
