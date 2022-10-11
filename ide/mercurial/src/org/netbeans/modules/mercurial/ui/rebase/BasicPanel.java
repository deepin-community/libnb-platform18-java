/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.mercurial.ui.rebase;

/**
 *
 * @author Ondrej Vrabec
 */
public class BasicPanel extends javax.swing.JPanel {

    /**
     * Creates new form RebaseSimple
     */
    public BasicPanel () {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/rebase-default.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(BasicPanel.class, "BasicPanel.jLabel1.text")); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setText(org.openide.util.NbBundle.getMessage(BasicPanel.class, "BasicPanel.jTextField1.text")); // NOI18N

        jTextField2.setEditable(false);
        jTextField2.setText(org.openide.util.NbBundle.getMessage(BasicPanel.class, "BasicPanel.jTextField2.text")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/base.png"))); // NOI18N
        jLabel2.setLabelFor(jTextField1);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(BasicPanel.class, "BasicPanel.lblBase.text")); // NOI18N
        jLabel2.setToolTipText(org.openide.util.NbBundle.getMessage(BasicPanel.class, "BasicPanel.lblBase.toolTipText")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/destinations.png"))); // NOI18N
        jLabel3.setLabelFor(jTextField2);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(BasicPanel.class, "BasicPanel.lblDest.text")); // NOI18N
        jLabel3.setToolTipText(org.openide.util.NbBundle.getMessage(BasicPanel.class, "BasicPanel.lblDest.TTtext")); // NOI18N

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()-1f));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(BasicPanel.class, "PreviewPanel.wcParentHelp.text")); // NOI18N
        jLabel4.setEnabled(false);

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getSize()-1f));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(BasicPanel.class, "BasicPanel.jLabel5.text")); // NOI18N
        jLabel5.setEnabled(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/base.png"))); // NOI18N
        jLabel7.setLabelFor(jTextField1);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(BasicPanel.class, "PreviewPanel.legend.lblBaseRevision.text")); // NOI18N
        jLabel7.setToolTipText(org.openide.util.NbBundle.getMessage(BasicPanel.class, "PreviewPanel.legend.lblBaseRevision.TTtext")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/destinations.png"))); // NOI18N
        jLabel8.setLabelFor(jTextField2);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(BasicPanel.class, "PreviewPanel.legend.lblDestRevision.text")); // NOI18N
        jLabel8.setToolTipText(org.openide.util.NbBundle.getMessage(BasicPanel.class, "PreviewPanel.legend.lblDestRevision.TTtext")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(BasicPanel.class, "RebasePanel.lblPreview.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    final javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
    final javax.swing.JTextField jTextField2 = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
