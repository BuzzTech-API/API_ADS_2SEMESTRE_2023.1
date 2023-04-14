
package GUI.card;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Atividades;

public class CardAtividadesAlunosDevendo extends javax.swing.JPanel {

    private Border border = BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK);
    
    public CardAtividadesAlunosDevendo() {
        initComponents();
        setOpaque(false);
    }
    
    public CardAtividadesAlunosDevendo(Atividades atividade) {
        initComponents();
        setOpaque(false);
        lbAtividade.setText("Atividade "+atividade.getId_atividade());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        nomesArea = new javax.swing.JTextArea();
        lbAtividade = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 217, 217));
        setMaximumSize(new java.awt.Dimension(99, 268));

        nomesArea.setEditable(false);
        nomesArea.setBackground(new java.awt.Color(217, 217, 217));
        nomesArea.setColumns(20);
        nomesArea.setLineWrap(true);
        nomesArea.setRows(5);
        nomesArea.setText("Joice Araujo\nClaudia Ribeiro\nJana Silva\nTomas Souza\nCarlinho prey\nIsaque lindo\npao de batata\nsakdopapskod\naskpdoopkas\ndaskpookp\ndaskpoopk\nasdkpopok\n");
        nomesArea.setWrapStyleWord(true);
        nomesArea.setBorder(null);
        nomesArea.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        jScrollPane1.setViewportView(nomesArea);

        lbAtividade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbAtividade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAtividade.setText("Atividade 01");

        lbData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbData.setText("Data: 12/03");
        lbData.setIconTextGap(-5);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("10% pendente");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendário (2).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(lbAtividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbData)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbAtividade)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbData)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.BLACK);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15 , 15);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth()-4, getHeight()-4, 15 , 15);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAtividade;
    private javax.swing.JLabel lbData;
    private javax.swing.JTextArea nomesArea;
    // End of variables declaration//GEN-END:variables
}
