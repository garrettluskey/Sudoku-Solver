/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.puzzle.solver.ui.prototype.pkg1;

import java.awt.Color;

import java.io.File;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author luskeyg
 */
public class Prototype extends javax.swing.JFrame {
    //size of lenth or width of board. 9x9 = 9, 10x10 = 10, ect...
    public final static int size = 9;
    private char[] chInput = new char[size*size];
    public String input = "000000090920040070030067024040320759007604200253098010480010030070030062060000000";
    
    //Board used for the UI
    private Board board;
    //TODO use first input to allow table revert
    private String first;
    //ytho???
    /*
    try{
        board = new Board(input);
    } catch(Exception e){
        jTextField1.setText(e.getMessage());
    }
    
    
    /**
     * Creates new form Prototype
     */
    
    public Prototype() {
        initComponents();
        
        jTable1.setShowGrid(true);
        jTable2.setShowGrid(true);
        jTable3.setShowGrid(true);
        jTable4.setShowGrid(true);
        jTable5.setShowGrid(true);
        jTable6.setShowGrid(true);
        jTable7.setShowGrid(true);
        jTable8.setShowGrid(true);
        jTable9.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable2.setGridColor(Color.BLACK);
        jTable3.setGridColor(Color.BLACK);
        jTable4.setGridColor(Color.BLACK);
        jTable5.setGridColor(Color.BLACK);
        jTable6.setGridColor(Color.BLACK);
        jTable7.setGridColor(Color.BLACK);
        jTable8.setGridColor(Color.BLACK);
        jTable9.setGridColor(Color.BLACK);
        jTable1.getTableHeader().setVisible(false);
        jTable2.getTableHeader().setVisible(false);
        jTable3.getTableHeader().setVisible(false);
        jTable4.getTableHeader().setVisible(false);
        jTable5.getTableHeader().setVisible(false);
        jTable6.getTableHeader().setVisible(false);
        jTable7.getTableHeader().setVisible(false);
        jTable8.getTableHeader().setVisible(false);
        jTable9.getTableHeader().setVisible(false);
        jTable1.setBackground(Color.WHITE);
        jTable2.setBackground(Color.WHITE);
        jTable3.setBackground(Color.WHITE);
        jTable4.setBackground(Color.WHITE);
        jTable5.setBackground(Color.WHITE);
        jTable6.setBackground(Color.WHITE);
        jTable7.setBackground(Color.WHITE);
        jTable8.setBackground(Color.WHITE);
        jTable9.setBackground(Color.WHITE);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable3.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable3.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable3.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable4.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable4.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable4.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable5.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable5.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable5.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable6.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable6.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable6.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable7.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable7.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable7.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable8.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable8.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable8.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable9.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable9.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable9.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        addFile = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Solve Step");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Solve Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset Table");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Revert Table");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Error Output:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("SUDOKU PUZZLE SOLVER");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setMaximumSize(new java.awt.Dimension(100, 100));
        jTable1.setRowHeight(32);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        if(jTable1.getCellEditor() != null){
            System.out.println("Test2");
        }
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }
        jTable1.getAccessibleContext().setAccessibleDescription("");

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jTable2.setMaximumSize(new java.awt.Dimension(100, 100));
        jTable2.setRowHeight(32);
        jTable2.setRowSelectionAllowed(false);
        jTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setFocusable(false);
        jTable3.setMaximumSize(new java.awt.Dimension(100, 100));
        jTable3.setRowHeight(32);
        jTable3.setRowSelectionAllowed(false);
        jTable3.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
        }

        jTable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setFocusable(false);
        jTable4.setMaximumSize(new java.awt.Dimension(100, 100));
        jTable4.setRowHeight(32);
        jTable4.setRowSelectionAllowed(false);
        jTable4.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
        }

        jTable7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable7.setFocusable(false);
        jTable7.setMaximumSize(new java.awt.Dimension(100, 100));
        jTable7.setRowHeight(32);
        jTable7.setRowSelectionAllowed(false);
        jTable7.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setResizable(false);
        }

        jTable5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.setFocusable(false);
        jTable5.setMaximumSize(new java.awt.Dimension(100, 100));
        jTable5.setRowHeight(32);
        jTable5.setRowSelectionAllowed(false);
        jTable2.getTableHeader().setVisible(false);
        jTable5.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
        }

        jTable6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable6.setFocusable(false);
        jTable6.setMaximumSize(new java.awt.Dimension(100, 100));
        jTable6.setRowHeight(32);
        jTable6.setRowSelectionAllowed(false);
        jTable6.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
        }

        jTable8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable8.setFocusable(false);
        jTable8.setMaximumSize(new java.awt.Dimension(100, 100));
        jTable8.setRowHeight(32);
        jTable8.setRowSelectionAllowed(false);
        jTable8.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setResizable(false);
            jTable8.getColumnModel().getColumn(1).setResizable(false);
            jTable8.getColumnModel().getColumn(2).setResizable(false);
        }

        jTable9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable9.setFocusable(false);
        jTable9.setMaximumSize(new java.awt.Dimension(100, 100));
        jTable9.setRowHeight(32);
        jTable9.setRowSelectionAllowed(false);
        jTable9.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setResizable(false);
            jTable9.getColumnModel().getColumn(1).setResizable(false);
            jTable9.getColumnModel().getColumn(2).setResizable(false);
        }

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        addFile.setText("Choose File");
        addFile.setToolTipText("");
        addFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileActionPerformed(evt);
            }
        });

        btnSave.setText("Save Puzzle");
        btnSave.setToolTipText("");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addFile)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(btnSave))
                    .addComponent(addFile))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //TODO debug
        //reverts table
        input = first;
        MakeBoard();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //solves table
        first = input;
        MakeBoard();
        //sets ui tables to solved board
        //board.start solves the current board
        setTables(board.Start());
        
    }//GEN-LAST:event_jButton2ActionPerformed
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //clears table
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                jTable1.getModel().setValueAt(null, i, j);
                jTable2.getModel().setValueAt(null, i, j);
                jTable3.getModel().setValueAt(null, i, j);
                jTable4.getModel().setValueAt(null, i, j);
                jTable5.getModel().setValueAt(null, i, j);
                jTable6.getModel().setValueAt(null, i, j);
                jTable7.getModel().setValueAt(null, i, j);
                jTable8.getModel().setValueAt(null, i, j);
                jTable9.getModel().setValueAt(null, i, j);
                
            }
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //opens save interface and allows saving
        InterfaceToInput();
        int returnVal = jFileChooser1.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            try { 
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(input);
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Prototype.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void addFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileActionPerformed
        //displays open interface and allows puzzles to be opened
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            
            try{
            FileReader fileReader = new FileReader(file);
            //Scanner scanner = new Scanner(file);
            //input = scanner.useDelimiter(" ").next();
            for(int i = 0; i < size*size; i++){
                chInput[i] = (char)fileReader.read();
                //System.out.print(chInput[i]);
            }
            input = new String(chInput);
            }
            catch (IOException e){
        
        }
        }
        board = new Board(input);
        setTables(board.GetBoxs());
    }//GEN-LAST:event_addFileActionPerformed
    //creates a board
    public void MakeBoard(){
        //if this is first run or input is empty
        //TODO either remove input after board is solved or have different logic to identify new puzzle
        if(input == null){
            InterfaceToInput();
        }
        //creates a board object with input string as puzzle
        board = new Board(input);
    }
    //Converts the interface into an input string. String uses row format and is converted from box format
    public void InterfaceToInput(){
        int inc = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(jTable1.getValueAt(i, j) == null){
                    chInput[inc++] = '0';
                } else {
                    chInput[inc++] = Character.forDigit((Integer)jTable1.getValueAt(i, j), 10);
                }
            }
            for(int j = 0; j < 3; j++){
                if(jTable2.getValueAt(i, j) == null){
                    chInput[inc++] = '0';
                } else {
                    chInput[inc++] = Character.forDigit((Integer)jTable2.getValueAt(i, j), 10);
                }
            }
            for(int j = 0; j < 3; j++){
                if(jTable3.getValueAt(i, j) == null){
                    chInput[inc++] = '0';
                } else {
                    chInput[inc++] = Character.forDigit((Integer)jTable3.getValueAt(i, j), 10);
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(jTable4.getValueAt(i, j) == null){
                    chInput[inc++] = '0';
                } else {
                    chInput[inc++] = Character.forDigit((Integer)jTable4.getValueAt(i, j), 10);
                }
            }
            for(int j = 0; j < 3; j++){
                if(jTable5.getValueAt(i, j) == null){
                    chInput[inc++] = '0';
                } else {
                    chInput[inc++] = Character.forDigit((Integer)jTable5.getValueAt(i, j), 10);
                }
            }
            for(int j = 0; j < 3; j++){
                if(jTable6.getValueAt(i, j) == null){
                    chInput[inc++] = '0';
                } else {
                    chInput[inc++] = Character.forDigit((Integer)jTable6.getValueAt(i, j), 10);
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(jTable7.getValueAt(i, j) == null){
                    chInput[inc++] = '0';
                } else {
                    chInput[inc++] = Character.forDigit((Integer)jTable7.getValueAt(i, j), 10);
                }
            }
            for(int j = 0; j < 3; j++){
                if(jTable8.getValueAt(i, j) == null){
                    chInput[inc++] = '0';
                } else {
                    chInput[inc++] = Character.forDigit((Integer)jTable8.getValueAt(i, j), 10);
                }
            }
            for(int j = 0; j < 3; j++){
                if(jTable9.getValueAt(i, j) == null){
                    chInput[inc++] = '0';
                } else {
                    chInput[inc++] = Character.forDigit((Integer)jTable9.getValueAt(i, j), 10);
                }
            }
        }
        input = new String(chInput);
        System.out.println(input);
        
    }
    //changes ui tables to display the array input
    public void setTables(Cell[][] Boxs){
        int inc = 0;
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                if(Boxs[0][inc].SolvedNumber() == 0){
                    jTable1.getModel().setValueAt(null, i, j);
                } else {
                    jTable1.getModel().setValueAt(Boxs[0][inc].SolvedNumber(), i, j);
                }
                
                if(Boxs[1][inc].SolvedNumber() == 0){
                    jTable2.getModel().setValueAt(null, i, j);
                } else {
                    jTable2.getModel().setValueAt(Boxs[1][inc].SolvedNumber(), i, j);
                }if(Boxs[2][inc].SolvedNumber() == 0){
                    jTable3.getModel().setValueAt(null, i, j);
                } else {
                    jTable3.getModel().setValueAt(Boxs[2][inc].SolvedNumber(), i, j);
                }if(Boxs[3][inc].SolvedNumber() == 0){
                    jTable4.getModel().setValueAt(null, i, j);
                } else {
                    jTable4.getModel().setValueAt(Boxs[3][inc].SolvedNumber(), i, j);
                }if(Boxs[4][inc].SolvedNumber() == 0){
                    jTable5.getModel().setValueAt(null, i, j);
                } else {
                    jTable5.getModel().setValueAt(Boxs[4][inc].SolvedNumber(), i, j);
                }if(Boxs[5][inc].SolvedNumber() == 0){
                    jTable6.getModel().setValueAt(null, i, j);
                } else {
                    jTable6.getModel().setValueAt(Boxs[5][inc].SolvedNumber(), i, j);
                }if(Boxs[6][inc].SolvedNumber() == 0){
                    jTable7.getModel().setValueAt(null, i, j);
                } else {
                    jTable7.getModel().setValueAt(Boxs[6][inc].SolvedNumber(), i, j);
                }if(Boxs[7][inc].SolvedNumber() == 0){
                    jTable8.getModel().setValueAt(null, i, j);
                } else {
                    jTable8.getModel().setValueAt(Boxs[7][inc].SolvedNumber(), i, j);
                }if(Boxs[8][inc].SolvedNumber() == 0){
                    jTable9.getModel().setValueAt(null, i, j);
                } else {
                    jTable9.getModel().setValueAt(Boxs[8][inc].SolvedNumber(), i, j);
                }
                inc++;
            }
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
            java.util.logging.Logger.getLogger(Prototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prototype().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFile;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
