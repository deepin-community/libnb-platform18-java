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

package org.netbeans.modules.java.editor.options;

import java.util.ArrayList;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.java.editor.base.options.MarkOccurencesSettingsNames;
import org.openide.util.Exceptions;

/**
 *
 * @author  Petr Hrebejk
 */
public class MarkOccurencesPanel extends javax.swing.JPanel {
   
    private static final boolean DEFAULT_VALUE = true; // May need to be splited if the defaunts ar not all on
    
    private List<JCheckBox> boxes;
    private MarkOccurencesOptionsPanelController controller;
    private boolean changed = false;
    
    /** Creates new form MarkOccurencesPanel */
    public MarkOccurencesPanel( MarkOccurencesOptionsPanelController controller ) {
        initComponents();
//        if( "Windows".equals(UIManager.getLookAndFeel().getID()) ) //NOI18N
//            setOpaque( false );
        fillBoxes();
        addListeners();
        load( controller );
    }
    
    public void load( MarkOccurencesOptionsPanelController controller ) {
        this.controller = controller;
        
        Preferences node = MarkOccurencesSettings.getCurrentNode();
        
        for (JCheckBox box : boxes) {
            box.setSelected(node.getBoolean(box.getActionCommand(), DEFAULT_VALUE));
        }
        
        componentsSetEnabled();
        changed = false;
    }
    
    public void store( ) {
        Preferences node = MarkOccurencesSettings.getCurrentNode();

        for (javax.swing.JCheckBox box : boxes) {
            boolean value = box.isSelected();
            boolean original = node.getBoolean(box.getActionCommand(),
                                               DEFAULT_VALUE);

            if (value != original) {
                node.putBoolean(box.getActionCommand(), value);
            }
        }
        try {
            node.flush();
        }
        catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
        }
        changed = false;
}
    
    public boolean changed() {
        return changed;
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        onOffCheckBox = new javax.swing.JCheckBox();
        typesCheckBox = new javax.swing.JCheckBox();
        methodsCheckBox = new javax.swing.JCheckBox();
        constantsCheckBox = new javax.swing.JCheckBox();
        fieldsCheckBox = new javax.swing.JCheckBox();
        localVariablesCheckBox = new javax.swing.JCheckBox();
        exceptionsCheckBox = new javax.swing.JCheckBox();
        exitCheckBox = new javax.swing.JCheckBox();
        implementsCheckBox = new javax.swing.JCheckBox();
        overridesCheckBox = new javax.swing.JCheckBox();
        breakContinueCheckBox = new javax.swing.JCheckBox();
        keepMarks = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(onOffCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_OnOff_CheckBox")); // NOI18N
        onOffCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        onOffCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        onOffCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 12, 0);
        add(onOffCheckBox, gridBagConstraints);
        onOffCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_OnOff_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(typesCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_Types_CheckBox")); // NOI18N
        typesCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        typesCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        typesCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(typesCheckBox, gridBagConstraints);
        typesCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_Types_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(methodsCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_Methods_CheckBox")); // NOI18N
        methodsCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        methodsCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        methodsCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(methodsCheckBox, gridBagConstraints);
        methodsCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_Methods_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(constantsCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_Constants_CheckBox")); // NOI18N
        constantsCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        constantsCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        constantsCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(constantsCheckBox, gridBagConstraints);
        constantsCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_Constants_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(fieldsCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_Fields_CheckBox")); // NOI18N
        fieldsCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        fieldsCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        fieldsCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(fieldsCheckBox, gridBagConstraints);
        fieldsCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_Fields_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(localVariablesCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_LocalVariables_CheckBox")); // NOI18N
        localVariablesCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        localVariablesCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        localVariablesCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(localVariablesCheckBox, gridBagConstraints);
        localVariablesCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_Variables_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(exceptionsCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_Exceptions_CheckBox")); // NOI18N
        exceptionsCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        exceptionsCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        exceptionsCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(exceptionsCheckBox, gridBagConstraints);
        exceptionsCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_Exceptions_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(exitCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_Exit_CheckBox")); // NOI18N
        exitCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        exitCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        exitCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(exitCheckBox, gridBagConstraints);
        exitCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_exitpoints_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(implementsCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_Implements_CheckBox")); // NOI18N
        implementsCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        implementsCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        implementsCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(implementsCheckBox, gridBagConstraints);
        implementsCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_implementing_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(overridesCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_Overrides_CheckBox")); // NOI18N
        overridesCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        overridesCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        overridesCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(overridesCheckBox, gridBagConstraints);
        overridesCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_overriding_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(breakContinueCheckBox, org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "CTL_BreakContinue_CheckBox")); // NOI18N
        breakContinueCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        breakContinueCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        breakContinueCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 0);
        add(breakContinueCheckBox, gridBagConstraints);
        breakContinueCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_Targets_CB")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(keepMarks, org.openide.util.NbBundle.getBundle(MarkOccurencesPanel.class).getString("CTL_KeepMarks_CheckBox")); // NOI18N
        keepMarks.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        keepMarks.setMargin(new java.awt.Insets(0, 0, 0, 0));
        keepMarks.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 8, 0);
        add(keepMarks, gridBagConstraints);
        keepMarks.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(MarkOccurencesPanel.class, "ACSD_Marks_CB")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox breakContinueCheckBox;
    private javax.swing.JCheckBox constantsCheckBox;
    private javax.swing.JCheckBox exceptionsCheckBox;
    private javax.swing.JCheckBox exitCheckBox;
    private javax.swing.JCheckBox fieldsCheckBox;
    private javax.swing.JCheckBox implementsCheckBox;
    private javax.swing.JCheckBox keepMarks;
    private javax.swing.JCheckBox localVariablesCheckBox;
    private javax.swing.JCheckBox methodsCheckBox;
    private javax.swing.JCheckBox onOffCheckBox;
    private javax.swing.JCheckBox overridesCheckBox;
    private javax.swing.JCheckBox typesCheckBox;
    // End of variables declaration//GEN-END:variables
    // End of variables declaration

    
    private void fillBoxes() {
        boxes = new ArrayList<JCheckBox>();
        boxes.add( onOffCheckBox );
        boxes.add( typesCheckBox );
        boxes.add( methodsCheckBox );
        boxes.add( constantsCheckBox );
        boxes.add( fieldsCheckBox );
        boxes.add( localVariablesCheckBox );
        boxes.add( exceptionsCheckBox );
        boxes.add( exitCheckBox );
        boxes.add( implementsCheckBox );
        boxes.add( overridesCheckBox );
        boxes.add( breakContinueCheckBox );
        boxes.add( keepMarks );
        
        onOffCheckBox.setActionCommand(MarkOccurencesSettingsNames.ON_OFF);
        typesCheckBox.setActionCommand(MarkOccurencesSettingsNames.TYPES);
        methodsCheckBox.setActionCommand(MarkOccurencesSettingsNames.METHODS);
        constantsCheckBox.setActionCommand(MarkOccurencesSettingsNames.CONSTANTS);
        fieldsCheckBox.setActionCommand(MarkOccurencesSettingsNames.FIELDS);
        localVariablesCheckBox.setActionCommand(MarkOccurencesSettingsNames.LOCAL_VARIABLES);
        exceptionsCheckBox.setActionCommand(MarkOccurencesSettingsNames.EXCEPTIONS);
        exitCheckBox.setActionCommand(MarkOccurencesSettingsNames.EXIT);
        implementsCheckBox.setActionCommand(MarkOccurencesSettingsNames.IMPLEMENTS);
        overridesCheckBox.setActionCommand(MarkOccurencesSettingsNames.OVERRIDES);
        breakContinueCheckBox.setActionCommand(MarkOccurencesSettingsNames.BREAK_CONTINUE);
        keepMarks.setActionCommand(MarkOccurencesSettingsNames.KEEP_MARKS);
    }
    
    
    private void addListeners() {
        ChangeListener cl = new CheckChangeListener();
        
        for( JCheckBox box : boxes ) {
            box.addChangeListener(cl);
        }
        
    }
    
    private void componentsSetEnabled() {
        for( int i = 1; i < boxes.size(); i++ ) {
            boxes.get(i).setEnabled(onOffCheckBox.isSelected()); // Switch off the other boxes
        }
    }
    
    private void fireChanged() {
        Preferences node = MarkOccurencesSettings.getCurrentNode();
        for (JCheckBox box : boxes) {
            if (node.getBoolean(box.getActionCommand(), DEFAULT_VALUE) != box.isSelected()) {
                changed = true;
                return;
            }
        }
        changed = false;
    }
    
    private class CheckChangeListener implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent evt) {
            if (evt.getSource().equals(onOffCheckBox)) {
                componentsSetEnabled();
            }
            fireChanged();
        }
    }
    
}
