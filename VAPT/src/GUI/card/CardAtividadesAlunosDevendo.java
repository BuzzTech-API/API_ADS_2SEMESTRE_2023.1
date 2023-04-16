
package GUI.card;

import GUI.swing.ScrollBarCustom;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Atividades;

public class CardAtividadesAlunosDevendo extends javax.swing.JPanel {

    private Border border = BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK);
    
    public CardAtividadesAlunosDevendo() {
        initComponents();
        setOpaque(false);
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setForeground(new Color(4, 210, 130));
        jScrollPane1.setVerticalScrollBar(sp);
        
    }
    
    public CardAtividadesAlunosDevendo(Atividades atividade, int id) {
        initComponents();
        setOpaque(false);
        lbAtividade.setText("Atividade "+id);
        //Classe para formatar a data para o padrão brasileiro
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        lbData.setText(lbData.getText()+sdf.format(atividade.getData_fim()));

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        nomesArea = new javax.swing.JTextArea();
        lbAtividade = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(252, 252, 252));
        setMaximumSize(new java.awt.Dimension(99, 268));

        jScrollPane1.setBorder(null);

        nomesArea.setEditable(false);
        nomesArea.setBackground(new java.awt.Color(252, 252, 252));
        nomesArea.setColumns(20);
        nomesArea.setLineWrap(true);
        nomesArea.setRows(5);
        nomesArea.setText("Joice Araujo\nClaudia Ribeiro\nJana Silva\nTomas Souza\nCarlinho prey\nIsaque lindo\npao de batata\nsakdopapskod\naskpdoopkas\ndaskpookp\ndaskpoopk\nasdkpopok\n");
        nomesArea.setWrapStyleWord(true);
        nomesArea.setBorder(null);
        nomesArea.setDisabledTextColor(new java.awt.Color(252, 252, 252));
        jScrollPane1.setViewportView(nomesArea);
        jScrollPane1.setBorder(border);

        lbAtividade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbAtividade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAtividade.setText("Atividade ");

        lbData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N
        lbData.setText("Data: ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("10% pendente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAtividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbAtividade)
                .addGap(23, 23, 23)
                .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAtividade;
    private javax.swing.JLabel lbData;
    private javax.swing.JTextArea nomesArea;
    // End of variables declaration//GEN-END:variables
}
