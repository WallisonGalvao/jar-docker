/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sptech.testeprojeto.tela.cliques;

/**
 *
 * @author LEONARDO
 */
import org.springframework.jdbc.core.JdbcTemplate;

import oshi.SystemInfo;

import com.sptech.testeprojeto.Connection;
import com.sptech.testeprojeto.tela.login.Maquina;
import com.sptech.testeprojeto.tela.login.MaquinaMapper;

public class TelaAtendimento extends javax.swing.JFrame {

    Integer cliques = 0;
    Connection config = new Connection();
    JdbcTemplate template = new JdbcTemplate(config.getDataSource());

    /**
     * Creates new form TelaAtendimento
     */
    public TelaAtendimento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Protocolo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Data = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Hora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PlanoCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TipoAberto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TipoSolucionado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NomeCriador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Destino = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Prioridade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Nível = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Status = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Motivo = new javax.swing.JTextArea();
        btnProsseguir = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        teste = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(0, 0));

        jLabel1.setText("No. Protocolo");

        Protocolo.setForeground(new java.awt.Color(102, 102, 102));
        Protocolo.setText("12345");
        Protocolo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProtocoloMouseClicked(evt);
            }
        });
        Protocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProtocoloActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        Data.setForeground(new java.awt.Color(102, 102, 102));
        Data.setText("00/00/0000");
        Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataMouseClicked(evt);
            }
        });
        Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataActionPerformed(evt);
            }
        });

        jLabel3.setText("Hora");

        Hora.setForeground(new java.awt.Color(102, 102, 102));
        Hora.setText("00:00");
        Hora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoraMouseClicked(evt);
            }
        });
        Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome Cliente");

        NomeCliente.setText("Amazon");
        NomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomeClienteMouseClicked(evt);
            }
        });
        NomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Plano Cliente");

        PlanoCliente.setForeground(new java.awt.Color(102, 102, 102));
        PlanoCliente.setText("Monitoramento Plus - Funcionários");
        PlanoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlanoClienteMouseClicked(evt);
            }
        });
        PlanoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanoClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo (Aberto)");

        TipoAberto.setForeground(new java.awt.Color(102, 102, 102));
        TipoAberto.setText("Novo Cliente");
        TipoAberto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TipoAbertoMouseClicked(evt);
            }
        });
        TipoAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoAbertoActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo (Solucionado)");

        TipoSolucionado.setForeground(new java.awt.Color(255, 0, 0));
        TipoSolucionado.setText("Atendimento não fechado.");

        jLabel9.setText("Criado por");

        NomeCriador.setForeground(new java.awt.Color(102, 102, 102));
        NomeCriador.setText("Leonardo");
        NomeCriador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomeCriadorMouseClicked(evt);
            }
        });
        NomeCriador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCriadorActionPerformed(evt);
            }
        });

        jLabel10.setText("Destino");

        Destino.setText("Fulano de Tal");
        Destino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DestinoMouseClicked(evt);
            }
        });
        Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinoActionPerformed(evt);
            }
        });

        jLabel11.setText("Prioridade");

        Prioridade.setForeground(new java.awt.Color(102, 102, 102));
        Prioridade.setText("Média");
        Prioridade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrioridadeMouseClicked(evt);
            }
        });
        Prioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrioridadeActionPerformed(evt);
            }
        });

        jLabel12.setText("Nível");

        Nível.setForeground(new java.awt.Color(102, 102, 102));
        Nível.setText("0");
        Nível.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NívelMouseClicked(evt);
            }
        });
        Nível.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NívelActionPerformed(evt);
            }
        });

        jLabel13.setText("Status");

        Status.setForeground(new java.awt.Color(102, 102, 102));
        Status.setText("Pendente");
        Status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatusMouseClicked(evt);
            }
        });
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Não Lido");

        jLabel15.setText("Motivo/Descrição");

        Motivo.setColumns(20);
        Motivo.setRows(5);
        Motivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MotivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Motivo);

        btnProsseguir.setText("Prosseguir");
        btnProsseguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProsseguirMouseClicked(evt);
            }
        });
        btnProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsseguirActionPerformed(evt);
            }
        });

        label.setText("Cliques:");

        teste.setText("0");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smart_sac-removebg-preview_Easy-Resize.com-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProsseguir)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(teste)))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PlanoCliente)
                                    .addComponent(TipoAberto, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(5, 5, 5)
                                        .addComponent(TipoSolucionado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Prioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Nível, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(NomeCriador, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(14, 14, 14)
                                                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14))))
                                    .addComponent(jLabel11))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(Protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(PlanoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TipoAberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TipoSolucionado))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(NomeCriador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Prioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(Nível, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label)
                            .addComponent(teste)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnProsseguir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HoraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_HoraActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_HoraActionPerformed

    private void DestinoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DestinoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_DestinoActionPerformed

    private void PrioridadeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PrioridadeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_PrioridadeActionPerformed

    private void NívelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NívelActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_NívelActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_StatusActionPerformed

    private void NomeClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NomeClienteActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_NomeClienteActionPerformed

    private void btnProsseguirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnProsseguirActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnProsseguirActionPerformed

    private void ProtocoloActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ProtocoloActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_ProtocoloActionPerformed

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DataActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_DataActionPerformed

    private void PlanoClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PlanoClienteActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_PlanoClienteActionPerformed

    private void TipoAbertoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TipoAbertoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TipoAbertoActionPerformed

    private void NomeCriadorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NomeCriadorActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_NomeCriadorActionPerformed

    private void ProtocoloMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ProtocoloMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_ProtocoloMouseClicked

    private void DataMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_DataMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_DataMouseClicked

    private void HoraMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_HoraMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_HoraMouseClicked

    private void NomeClienteMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_NomeClienteMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_NomeClienteMouseClicked

    private void PlanoClienteMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_PlanoClienteMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_PlanoClienteMouseClicked

    private void TipoAbertoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TipoAbertoMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_TipoAbertoMouseClicked

    private void NomeCriadorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_NomeCriadorMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_NomeCriadorMouseClicked

    private void DestinoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_DestinoMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_DestinoMouseClicked

    private void PrioridadeMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_PrioridadeMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_PrioridadeMouseClicked

    private void NívelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_NívelMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_NívelMouseClicked

    private void StatusMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_StatusMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_StatusMouseClicked

    private void MotivoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MotivoMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_MotivoMouseClicked

    private void btnProsseguirMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnProsseguirMouseClicked
        cliques++;
        enviar();
        teste.setText(String.format("%d", cliques));// TODO add your handling code here:
    }// GEN-LAST:event_btnProsseguirMouseClicked

    void enviar() {
        SystemInfo info = new SystemInfo();
        String queryIdentificarMaquina = String.format("SELECT * FROM maquinas WHERE hostname = '%s'",
                info.getHardware().getComputerSystem().getHardwareUUID());

        long millis = System.currentTimeMillis();

        // creating a new object of the class Date
        java.sql.Date date = new java.sql.Date(millis);

        Maquina identificarMaquina = template.queryForObject(queryIdentificarMaquina, new MaquinaMapper());
        template.update(
                "INSERT INTO log_cliques(cliques, data_clique, fk_maquina) values ('clicou', '" + date + "' , "
                        + identificarMaquina.getId()
                        + ");");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtendimento().setVisible(true);
                new TelaAtendimento().setUndecorated(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Data;
    private javax.swing.JTextField Destino;
    private javax.swing.JTextField Hora;
    private javax.swing.JTextArea Motivo;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField NomeCriador;
    private javax.swing.JTextField Nível;
    private javax.swing.JTextField PlanoCliente;
    private javax.swing.JTextField Prioridade;
    private javax.swing.JTextField Protocolo;
    private javax.swing.JTextField Status;
    private javax.swing.JTextField TipoAberto;
    private javax.swing.JLabel TipoSolucionado;
    private javax.swing.JButton btnProsseguir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel teste;
    // End of variables declaration//GEN-END:variables
}
