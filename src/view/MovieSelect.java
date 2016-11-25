/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Mads
 */
public class MovieSelect extends javax.swing.JFrame {

    /**
     * Creates new form MovieSelect
     */
    public MovieSelect() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        northPanel = new javax.swing.JPanel();
        bioTrioLabel = new javax.swing.JLabel();
        southPanel = new javax.swing.JPanel();
        eastPanel = new javax.swing.JPanel();
        westPanel = new javax.swing.JPanel();
        centerPanel = new javax.swing.JPanel();
        movieLeftPanel = new javax.swing.JPanel();
        movieSelectLabel = new javax.swing.JLabel();
        movieSelectBox = new javax.swing.JComboBox<>();
        spacePanel = new javax.swing.JPanel();
        spacePanel2 = new javax.swing.JPanel();
        datoSelectLabel = new javax.swing.JLabel();
        datoSelectBox = new javax.swing.JComboBox<>();
        buttonPanel = new javax.swing.JPanel();
        chooseButton = new javax.swing.JButton();
        movieRightPanel = new javax.swing.JPanel();
        movieTablePane = new javax.swing.JScrollPane();
        movieTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Select Movie");
        setMaximumSize(new java.awt.Dimension(850, 600));
        setMinimumSize(new java.awt.Dimension(850, 600));
        setName("movieSelectFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(850, 600));

        northPanel.setMaximumSize(new java.awt.Dimension(800, 75));
        northPanel.setMinimumSize(new java.awt.Dimension(800, 100));
        northPanel.setPreferredSize(new java.awt.Dimension(800, 100));

        bioTrioLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bioTrioLabel.setText("Velkommen til Bio Trio booking!");
        northPanel.add(bioTrioLabel);

        getContentPane().add(northPanel, java.awt.BorderLayout.NORTH);

        southPanel.setMaximumSize(new java.awt.Dimension(800, 100));
        southPanel.setMinimumSize(new java.awt.Dimension(800, 100));
        southPanel.setPreferredSize(new java.awt.Dimension(800, 75));
        getContentPane().add(southPanel, java.awt.BorderLayout.SOUTH);

        eastPanel.setMaximumSize(new java.awt.Dimension(100, 400));
        eastPanel.setMinimumSize(new java.awt.Dimension(100, 400));
        eastPanel.setPreferredSize(new java.awt.Dimension(75, 400));
        getContentPane().add(eastPanel, java.awt.BorderLayout.LINE_END);

        westPanel.setMaximumSize(new java.awt.Dimension(100, 400));
        westPanel.setMinimumSize(new java.awt.Dimension(100, 400));
        westPanel.setPreferredSize(new java.awt.Dimension(75, 400));
        getContentPane().add(westPanel, java.awt.BorderLayout.LINE_START);

        centerPanel.setMaximumSize(new java.awt.Dimension(600, 400));
        centerPanel.setMinimumSize(new java.awt.Dimension(600, 400));
        centerPanel.setPreferredSize(new java.awt.Dimension(600, 450));

        movieLeftPanel.setPreferredSize(new java.awt.Dimension(130, 400));
        movieLeftPanel.setRequestFocusEnabled(false);

        movieSelectLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        movieSelectLabel.setText("Vælg film:");
        movieLeftPanel.add(movieSelectLabel);

        movieSelectBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        movieSelectBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        movieSelectBox.setPreferredSize(new java.awt.Dimension(100, 30));
        movieLeftPanel.add(movieSelectBox);

        spacePanel.setPreferredSize(new java.awt.Dimension(130, 250));

        spacePanel2.setPreferredSize(new java.awt.Dimension(130, 10));
        spacePanel.add(spacePanel2);

        datoSelectLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datoSelectLabel.setText("Vælg dato:");
        spacePanel.add(datoSelectLabel);

        datoSelectBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        datoSelectBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        datoSelectBox.setPreferredSize(new java.awt.Dimension(100, 30));
        spacePanel.add(datoSelectBox);

        movieLeftPanel.add(spacePanel);

        buttonPanel.setPreferredSize(new java.awt.Dimension(130, 150));

        chooseButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chooseButton.setText("Vælg");
        buttonPanel.add(chooseButton);

        movieLeftPanel.add(buttonPanel);

        centerPanel.add(movieLeftPanel);

        movieRightPanel.setMinimumSize(new java.awt.Dimension(500, 400));
        movieRightPanel.setPreferredSize(new java.awt.Dimension(520, 400));

        movieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Forestilling", "Sal", "Ledige pladser"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        movieTable.setColumnSelectionAllowed(true);
        movieTable.getTableHeader().setReorderingAllowed(false);
        movieTablePane.setViewportView(movieTable);
        movieTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        movieRightPanel.add(movieTablePane);

        centerPanel.add(movieRightPanel);

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MovieSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bioTrioLabel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JButton chooseButton;
    private javax.swing.JComboBox<String> datoSelectBox;
    private javax.swing.JLabel datoSelectLabel;
    private javax.swing.JPanel eastPanel;
    private javax.swing.JPanel movieLeftPanel;
    private javax.swing.JPanel movieRightPanel;
    private javax.swing.JComboBox<String> movieSelectBox;
    private javax.swing.JLabel movieSelectLabel;
    private javax.swing.JTable movieTable;
    private javax.swing.JScrollPane movieTablePane;
    private javax.swing.JPanel northPanel;
    private javax.swing.JPanel southPanel;
    private javax.swing.JPanel spacePanel;
    private javax.swing.JPanel spacePanel2;
    private javax.swing.JPanel westPanel;
    // End of variables declaration//GEN-END:variables
}
