/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.componentes.CheckBoxContainer;
import GUI.swing.ScrollBarCustom;
import dao.Aluno_AtividadeDao;
import dao.TurmaDao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Turma;

/**
 *
 * @author Fatec
 */
public class DetalheTurma extends javax.swing.JInternalFrame {

    private int id;
    private JDesktopPane jDesktopPane;
    private Turma turma = new Turma();
    
    public DetalheTurma() {
        initComponents();
        
    }
    
    public DetalheTurma(int id, JDesktopPane jDesktopPane) {
        
        
        //Atribui os valores internos da classe os valores que estão recebendo do construtor
        this.jDesktopPane = jDesktopPane;
        this.id = id;

        
        // Inicia os componentes
        initComponents();


        // Remove a borda do JInternalFrame
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui =(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        
        //Método para colocar as scrollbars personalizadas
        arrumarScrollBar();

        // Puxa as informações da turma do banco e coloca nas label
        TurmaDao turmaDao = new TurmaDao();
        turma = turmaDao.buscarPorId(id);
        turma.buscarAtividades();
        jLabel1.setText(jLabel1.getText()+ turma.getNome());
        jLabel2.setText(jLabel2.getText() + turma.getNome_escola());
        
        preencherIcones();
       


        
        
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorda1 = new GUI.swing.PanelBorda();
        myButton1 = new GUI.swing.MyButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelBordaArredondadaComLinha1 = new GUI.swing.PanelBordaArredondadaComLinha();
        jScrollPane1 = new javax.swing.JScrollPane();
        atividadesPedentes1 = new GUI.componentes.AtividadesPedentes(id, jDesktopPane);
        panelBorda2 = new GUI.swing.PanelBorda();
        atividadesEntreguesComAtraso1 = new GUI.componentes.AtividadesEntreguesComAtraso(jDesktopPane , id);
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        myButton2 = new GUI.swing.MyButton();

        setPreferredSize(new java.awt.Dimension(1018, 639));

        panelBorda1.setRound(30);

        myButton1.setBackground(new java.awt.Color(242, 242, 242));
        myButton1.setBorder(null);
        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vector.png"))); // NOI18N
        myButton1.setBorderColor(new java.awt.Color(242, 242, 242));
        myButton1.setBorderPainted(false);
        myButton1.setColor(new java.awt.Color(242, 242, 242));
        myButton1.setColorClicked(new java.awt.Color(102, 102, 102));
        myButton1.setColorOver(new java.awt.Color(204, 204, 204));
        myButton1.setPreferredSize(new java.awt.Dimension(30, 30));
        myButton1.setRadius(30);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schoolred.png"))); // NOI18N
        jLabel2.setText("Escola:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 131, 84));
        jLabel1.setText("Turma: ");

        panelBordaArredondadaComLinha1.setPreferredSize(new java.awt.Dimension(937, 532));

        jScrollPane1.setViewportView(atividadesPedentes1);

        panelBorda2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelBorda2Layout = new javax.swing.GroupLayout(panelBorda2);
        panelBorda2.setLayout(panelBorda2Layout);
        panelBorda2Layout.setHorizontalGroup(
            panelBorda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorda2Layout.createSequentialGroup()
                .addComponent(atividadesEntreguesComAtraso1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panelBorda2Layout.setVerticalGroup(
            panelBorda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorda2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atividadesEntreguesComAtraso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBordaArredondadaComLinha1Layout = new javax.swing.GroupLayout(panelBordaArredondadaComLinha1);
        panelBordaArredondadaComLinha1.setLayout(panelBordaArredondadaComLinha1Layout);
        panelBordaArredondadaComLinha1Layout.setHorizontalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(panelBorda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        panelBordaArredondadaComLinha1Layout.setVerticalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBorda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        myButton2.setBackground(new java.awt.Color(239, 131, 84));
        myButton2.setBorder(null);
        myButton2.setForeground(new java.awt.Color(2, 30, 54));
        myButton2.setText("Salvar");
        myButton2.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton2.setColor(new java.awt.Color(239, 131, 84));
        myButton2.setColorClicked(new java.awt.Color(239, 131, 83));
        myButton2.setColorOver(new java.awt.Color(255, 139, 89));
        myButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        myButton2.setRadius(20);
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorda1Layout = new javax.swing.GroupLayout(panelBorda1);
        panelBorda1.setLayout(panelBorda1Layout);
        panelBorda1Layout.setHorizontalGroup(
            panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorda1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(panelBorda1Layout.createSequentialGroup()
                .addGroup(panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorda1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorda1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(panelBordaArredondadaComLinha1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(panelBorda1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(366, 366, 366))
        );
        panelBorda1Layout.setVerticalGroup(
            panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorda1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBordaArredondadaComLinha1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    public void preencherIcones() {

        Aluno_AtividadeDao aluno_AtividadeDao = new Aluno_AtividadeDao();
        
        // Redimensiona o tamanho do icone que aparece no botão
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/Vector.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance( 20, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        myButton1.setIcon(scaledIcon);
         
        
        // Cria um JLabel com o icone da ellipse redimensionada e adiciona no layered pane com nível baíxo
        icon = new ImageIcon(getClass().getResource("/img/Ellipse 5.png"));
        img = icon.getImage();
        imgScale = img.getScaledInstance(161, 126, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel iconLabel = new JLabel(scaledIcon);
        iconLabel.setBounds(0, 0, iconLabel.getIcon().getIconWidth(), iconLabel.getIcon().getIconHeight());
        jLayeredPane2.add(iconLabel, JLayeredPane.DEFAULT_LAYER);
        iconLabel.setLocation(0, 0);
        
        String porcetagem = aluno_AtividadeDao.pegarPorcentagemDeNaoEntreguesDaTurma(id);
        // Cria um JLabel com o Texto que vai ficar dentro da ellipse e insere no layered pane com um nível mais alto
        JLabel textLabel = new JLabel();

        if(porcetagem == null){
             textLabel.setText("0% Não fez");
        }else{
             textLabel.setText(porcetagem+" Não fez");
        }
        textLabel.setFont(new Font("Arial", 1 ,14));
        textLabel.setBounds(0, 0, iconLabel.getIcon().getIconWidth(), iconLabel.getIcon().getIconHeight());
        textLabel.setForeground(Color.RED);
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        jLayeredPane2.add(textLabel, JLayeredPane.PALETTE_LAYER);
        textLabel.setLocation(0, 0);
        
        
        // Cria um JLabel com o icone da ellipse redimensionada e adiciona no layered pane com nível baíxo
        icon = new ImageIcon(getClass().getResource("/img/Ellipse6.png"));
        img = icon.getImage();
        imgScale = img.getScaledInstance(161, 126, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        JLabel iconLabel1 = new JLabel(scaledIcon);
        iconLabel1.setBounds(0, 0, iconLabel1.getIcon().getIconWidth(), iconLabel1.getIcon().getIconHeight());
        jLayeredPane1.add(iconLabel1, JLayeredPane.DEFAULT_LAYER);
        iconLabel1.setLocation(0, 0);

        porcetagem = aluno_AtividadeDao.pegarPorcentagemDeEntreguesDaTurma(id);
        // Cria um JLabel com o Texto que vai ficar dentro da ellipse e insere no layered pane com um nível mais alto
        JLabel textLabel1 = new JLabel();
        if(porcetagem == null){
             textLabel1.setText("0% Atrasou");
        }else{
             textLabel1.setText(porcetagem+" Atrasou");
        }
        
        textLabel1.setFont(new Font("Arial", 1 ,14));
        textLabel1.setBounds(0, 0, iconLabel.getIcon().getIconWidth(), iconLabel.getIcon().getIconHeight());
        textLabel1.setForeground(new Color(79, 93, 117));
        textLabel1.setSize(new Dimension(161, 126));
        textLabel1.setVerticalAlignment(JLabel.CENTER);
        textLabel1.setHorizontalAlignment(JLabel.CENTER);
        jLayeredPane1.add(textLabel1, JLayeredPane.PALETTE_LAYER);
        textLabel1.setLocation(0, 0);
        
    }


    public void arrumarScrollBar() {


        //Cria a scrollbar customizada vertical
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setUnitIncrement(20);
        sp.setForeground(new Color(4, 210, 130));
        jScrollPane1.setVerticalScrollBar(sp);
        

        //Cria a scrollbar customizada horizontal
        ScrollBarCustom spHorizontal = new ScrollBarCustom();
        spHorizontal.setOrientation(JScrollBar.HORIZONTAL);
        spHorizontal.setUnitIncrement(20);
        spHorizontal.setForeground(new Color(4, 210, 130));
        jScrollPane1.setHorizontalScrollBar(spHorizontal);

    }

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
        Buscar buscar = new Buscar(jDesktopPane);
        jDesktopPane.removeAll();
        jDesktopPane.add(buscar).setVisible(true);
    }//GEN-LAST:event_myButton1ActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        
        JLayeredPane panelAtividadesPendentes = (JLayeredPane) atividadesPedentes1.getComponent(1);
        for (int i = 0; i < panelAtividadesPendentes.getComponentCount(); i++) {
            CheckBoxContainer checkBoxContainer = (CheckBoxContainer) panelAtividadesPendentes.getComponent(i);
            checkBoxContainer.alterarSelecionados();
        }
        jDesktopPane.removeAll();
        jDesktopPane.add(new DetalheTurma(id , jDesktopPane)).setVisible(true);
        
    }//GEN-LAST:event_myButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.componentes.AtividadesEntreguesComAtraso atividadesEntreguesComAtraso1;
    private GUI.componentes.AtividadesPedentes atividadesPedentes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.swing.MyButton myButton1;
    private GUI.swing.MyButton myButton2;
    private GUI.swing.PanelBorda panelBorda1;
    private GUI.swing.PanelBorda panelBorda2;
    private GUI.swing.PanelBordaArredondadaComLinha panelBordaArredondadaComLinha1;
    // End of variables declaration//GEN-END:variables
}
