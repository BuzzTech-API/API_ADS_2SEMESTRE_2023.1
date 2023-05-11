/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.popup.PopupConfirmCadastrar;
import dao.Dia_SemanaDao;
import dao.TurmaDao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import modelo.Dia_Semana;
import dao.Dia_SemanaDao;
import modelo.Turma;


/**
 *
 * @author joice
 */
public class EditarTurma extends javax.swing.JInternalFrame {

    /**
     * Creates new form AtividadesCadastradas
     */
   
    private Turma turma;
    private ArrayList<Dia_Semana> lista;
//    private ArrayList<Turma> turmaAtualizada;
    
    public EditarTurma(Turma turma) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
        //Nome da escola e turma
        nomeDaEscola.setText(turma.getNome_escola());
        nomeTurma.setText(turma.getNome());
        
        //Lista com os dias da semana
        Dia_SemanaDao diasSemana = new Dia_SemanaDao();
        lista = diasSemana.buscarDiasTurma(turma.getId_turma());
        
        for(Dia_Semana dia : lista){
            
            if (dia.getDia().compareTo("Segunda") == 0){
                segundaCheck.setSelected(true);
                segIni.setText(dia.getHora_inicio());
                segFim.setText(dia.getHora_fim());
            }
            if (dia.getDia().compareTo("Terça") == 0){
                tercaCheck.setSelected(true);
                terIni.setText(dia.getHora_inicio());
                terFim.setText(dia.getHora_fim());
            }
            if (dia.getDia().compareTo("Quarta") == 0){
                quartaCheck.setSelected(true);
                quaIni.setText(dia.getHora_inicio());
                quaFim.setText(dia.getHora_fim());
            }
            if (dia.getDia().compareTo("Quinta") == 0){
                quintaCheck.setSelected(true);
                quiIni.setText(dia.getHora_inicio());
                quiFim.setText(dia.getHora_fim());
            }
            if (dia.getDia().compareTo("Sexta") == 0){
                sextaCheck.setSelected(true);
                sexIni.setText(dia.getHora_inicio());
                sexFim.setText(dia.getHora_fim());
            }
        }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeDaEscola = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeTurma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        segundaCheck = new javax.swing.JCheckBox();
        tercaCheck = new javax.swing.JCheckBox();
        quartaCheck = new javax.swing.JCheckBox();
        quintaCheck = new javax.swing.JCheckBox();
        sextaCheck = new javax.swing.JCheckBox();
        segundaHoraIni = new javax.swing.JLabel();
        segIni = new javax.swing.JFormattedTextField();
        tercaHoraIni = new javax.swing.JLabel();
        quartaHoraIni = new javax.swing.JLabel();
        quintaHoraIni = new javax.swing.JLabel();
        sextaHoraIni = new javax.swing.JLabel();
        terIni = new javax.swing.JFormattedTextField();
        quaIni = new javax.swing.JFormattedTextField();
        quiIni = new javax.swing.JFormattedTextField();
        sexIni = new javax.swing.JFormattedTextField();
        segundaHoraFim = new javax.swing.JLabel();
        tercaHoraFim = new javax.swing.JLabel();
        quartaHoraFim = new javax.swing.JLabel();
        quintaHoraFim = new javax.swing.JLabel();
        sextaHoraFim = new javax.swing.JLabel();
        segFim = new javax.swing.JFormattedTextField();
        terFim = new javax.swing.JFormattedTextField();
        quaFim = new javax.swing.JFormattedTextField();
        quiFim = new javax.swing.JFormattedTextField();
        sexFim = new javax.swing.JFormattedTextField();
        botaoSalvar = new javax.swing.JButton();

        setBackground(new java.awt.Color(217, 217, 217));
        setPreferredSize(new java.awt.Dimension(1018, 638));

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setMinimumSize(new java.awt.Dimension(587, 348));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 730));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(114, 133, 165), 1, true));
        jPanel2.setMinimumSize(new java.awt.Dimension(587, 348));
        jPanel2.setPreferredSize(new java.awt.Dimension(510, 486));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 210, 130));
        jLabel1.setText("Atualizar Turma:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Nome da Escola:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Turma:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Dias da Semana:");

        segundaCheck.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        segundaCheck.setText("Segunda Feira");
        segundaCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segundaCheckStateChanged(evt);
            }
        });
        segundaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundaCheckActionPerformed(evt);
            }
        });

        tercaCheck.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tercaCheck.setText("Terça Feira");
        tercaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tercaCheckActionPerformed(evt);
            }
        });

        quartaCheck.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        quartaCheck.setText("Quarta Feira");
        quartaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartaCheckActionPerformed(evt);
            }
        });

        quintaCheck.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        quintaCheck.setText("Quinta Feira");
        quintaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quintaCheckActionPerformed(evt);
            }
        });

        sextaCheck.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sextaCheck.setText("Sexta Feira");
        sextaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sextaCheckActionPerformed(evt);
            }
        });

        segundaHoraIni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        segundaHoraIni.setText("Horário de Início:");

        try {
            segIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        segIni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tercaHoraIni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tercaHoraIni.setText("Horário de Início:");

        quartaHoraIni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        quartaHoraIni.setText("Horário de Início:");

        quintaHoraIni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        quintaHoraIni.setText("Horário de Início:");

        sextaHoraIni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sextaHoraIni.setText("Horário de Início:");

        try {
            terIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        terIni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            quaIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        quaIni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            quiIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        quiIni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            sexIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        sexIni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        segundaHoraFim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        segundaHoraFim.setText("Horário de Fim:");

        tercaHoraFim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tercaHoraFim.setText("Horário de Fim:");

        quartaHoraFim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        quartaHoraFim.setText("Horário de Fim:");

        quintaHoraFim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        quintaHoraFim.setText("Horário de Fim:");

        sextaHoraFim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sextaHoraFim.setText("Horário de Fim:");

        try {
            segFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        segFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            terFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        terFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            quaFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        quaFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            quiFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        quiFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            sexFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        sexFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botaoSalvar.setBackground(new java.awt.Color(239, 131, 84));
        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(2, 30, 54));
        botaoSalvar.setText("Salvar");
        botaoSalvar.setMaximumSize(new java.awt.Dimension(98, 30));
        botaoSalvar.setMinimumSize(new java.awt.Dimension(98, 30));
        botaoSalvar.setPreferredSize(new java.awt.Dimension(98, 30));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(592, 592, 592))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sextaCheck)
                                .addComponent(quintaCheck)
                                .addComponent(quartaCheck)
                                .addComponent(tercaCheck)
                                .addComponent(segundaCheck))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(segundaHoraIni)
                                .addComponent(tercaHoraIni)
                                .addComponent(quartaHoraIni)
                                .addComponent(quintaHoraIni)
                                .addComponent(sextaHoraIni))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(terIni, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(segIni, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quiIni, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sexIni, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(segundaHoraFim)
                                .addComponent(tercaHoraFim)
                                .addComponent(quartaHoraFim)
                                .addComponent(quintaHoraFim)
                                .addComponent(sextaHoraFim))
                            .addGap(43, 43, 43)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(sexFim, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quiFim, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quaFim, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(terFim, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(segFim, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(29, 29, 29)
                                    .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(29, 29, 29)
                                    .addComponent(nomeDaEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4))
                            .addGap(343, 343, 343)))
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {quaFim, quaIni, quiFim, quiIni, segFim, segIni, sexFim, sexIni, terFim, terIni});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {quartaHoraIni, quintaHoraIni, segundaHoraIni, sextaHoraIni, tercaHoraIni});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {quartaHoraFim, quintaHoraFim, segundaHoraFim, sextaHoraFim, tercaHoraFim});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeDaEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(segundaCheck)
                                            .addComponent(segundaHoraIni)
                                            .addComponent(segIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tercaCheck))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(segFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(segundaHoraFim))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tercaHoraIni)
                                            .addComponent(terFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(terIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tercaHoraFim))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(quartaCheck)
                                        .addComponent(quartaHoraIni)
                                        .addComponent(quaFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(quartaHoraFim))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quiFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quintaCheck)
                                    .addComponent(quintaHoraFim)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quintaHoraIni)
                                .addComponent(quiIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sextaCheck)
                            .addComponent(sextaHoraIni)
                            .addComponent(sexIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sextaHoraFim))
                .addGap(36, 36, 36)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {quaFim, quaIni, quiFim, quiIni, segFim, segIni, sexFim, sexIni, terFim, terIni});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {quartaHoraIni, quintaHoraIni, segundaHoraIni, sextaHoraIni, tercaHoraIni});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {quartaHoraFim, quintaHoraFim, segundaHoraFim, sextaHoraFim, tercaHoraFim});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jPanel2, 470, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void segundaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundaCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segundaCheckActionPerformed

    private void tercaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tercaCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tercaCheckActionPerformed

    private void quartaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartaCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quartaCheckActionPerformed

    private void quintaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quintaCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quintaCheckActionPerformed

    private void sextaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sextaCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sextaCheckActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void segundaCheckStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segundaCheckStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_segundaCheckStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeDaEscola;
    private javax.swing.JTextField nomeTurma;
    private javax.swing.JFormattedTextField quaFim;
    private javax.swing.JFormattedTextField quaIni;
    private javax.swing.JCheckBox quartaCheck;
    private javax.swing.JLabel quartaHoraFim;
    private javax.swing.JLabel quartaHoraIni;
    private javax.swing.JFormattedTextField quiFim;
    private javax.swing.JFormattedTextField quiIni;
    private javax.swing.JCheckBox quintaCheck;
    private javax.swing.JLabel quintaHoraFim;
    private javax.swing.JLabel quintaHoraIni;
    private javax.swing.JFormattedTextField segFim;
    private javax.swing.JFormattedTextField segIni;
    private javax.swing.JCheckBox segundaCheck;
    private javax.swing.JLabel segundaHoraFim;
    private javax.swing.JLabel segundaHoraIni;
    private javax.swing.JFormattedTextField sexFim;
    private javax.swing.JFormattedTextField sexIni;
    private javax.swing.JCheckBox sextaCheck;
    private javax.swing.JLabel sextaHoraFim;
    private javax.swing.JLabel sextaHoraIni;
    private javax.swing.JFormattedTextField terFim;
    private javax.swing.JFormattedTextField terIni;
    private javax.swing.JCheckBox tercaCheck;
    private javax.swing.JLabel tercaHoraFim;
    private javax.swing.JLabel tercaHoraIni;
    // End of variables declaration//GEN-END:variables

    

}
