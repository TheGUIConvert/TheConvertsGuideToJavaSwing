/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swingguide.panels.jcombobox;

import java.awt.Color;
import swingguide.helpers.ComponentPanel;
import swingguide.helpers.ComponentTemplate;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Light
 */
public class JComboBoxPanel_05_Other extends ComponentPanel {

    private JComboBox jComboBox1;
    private JComboBoxPanel jComboBoxPanel;
    
    /**
     * Creates new form NewJPanel
     */
    public JComboBoxPanel_05_Other() {
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

        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();

        jCheckBox5.setText("Set Action");

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Set LightWeight Popup Enabled");

        jButton2.setText("Show Popup");

        jCheckBox2.setText("Change Max Displayed Popup Elements");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Enable");

        jCheckBox4.setText("Set Model");

        jCheckBox6.setText("Set Action Command");

        jCheckBox7.setText("Set ComboBox Width by Rendered String");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox1)
                    .addComponent(jButton2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox2))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox7)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getTitle() {
        return "Other";
    }
    
    @Override
    public void setup(Component primaryComponent, ComponentTemplate componentTemplate) {
        
        jComboBox1 = (JComboBox)primaryComponent;
        jComboBoxPanel = (JComboBoxPanel)componentTemplate;
        
        //Set Maximum Popup Displayed Items
        jCheckBox2.setAction(new AbstractAction(jCheckBox2.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox2.isSelected()) {
                    jComboBox1.setMaximumRowCount(3);
                } else {
                    jComboBox1.setMaximumRowCount(8);//default
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Maximum Popup Displayed Items  */\n\n"
                        + "jComboBox1.setMaximumRowCount(3);\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jComboBox1.setMaximumRowCount(8);\n"
                        + "*/\n"
                );
            }
        });

        //Show Popup
        jButton2.setAction(new AbstractAction(jButton2.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                jComboBox1.showPopup();
                componentTemplate.setCodeTextArea(
                        "/*  Show Popup  */\n\n"
                        + "jComboBox1.showPopup();\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jComboBox1.hidePopup();\n"
                        + "*/\n"
                );
            }
        });

        //Enable LightWeight Popup
        jCheckBox3.setAction(new AbstractAction(jCheckBox3.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox3.isSelected()) {
                    jComboBox1.setLightWeightPopupEnabled(true);
                } else {
                    jComboBox1.setLightWeightPopupEnabled(false);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Enable LightWeight Popup  */\n\n"
                        + "jComboBox1.setLightWeightPopupEnabled(true); //default\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jComboBox1.setLightWeightPopupEnabled(true); //default\n"
                        + "*/\n"
                );
            }
        });

        //Set Width by Rendered String
        jCheckBox7.setAction(new AbstractAction(jCheckBox7.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox7.isSelected()) {
                    jComboBox1.setPrototypeDisplayValue("Use this string to determine the width of the JComboBox");
                } else {
                    jComboBox1.setPrototypeDisplayValue(null);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Width by Rendered String  */\n\n"
                        + "jComboBox1.setPrototypeDisplayValue(\"Use this string to determine the width of the JComboBox\");\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "   jComboBox1.setPrototypeDisplayValue(null);\n"
                        + "*/\n"
                );
            }
        });

        //Set Action
        jCheckBox5.setAction(new AbstractAction(jCheckBox5.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox5.isSelected()) {
                    jComboBox1.setAction(new AbstractAction("New Action") {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            jComboBoxPanel.addTextToTextArea("The new action has fired\n\n");
                        }
                    });
                } else {
                    jComboBox1.setAction(null);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Action  */\n\n"
                        + "jComboBox1.setAction(new AbstractAction(\"New Action\") {\n"
                        + "    @Override\n"
                        + "    public void actionPerformed(ActionEvent e) {\n"
                        + "        System.out.println(\"The new action has fired\");\n"
                        + "    }\n"
                        + "});\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jComboBox1.setAction(null);\n"
                        + "*/\n"
                );
            }
        });

        //Set Action Command Text
        jCheckBox6.setAction(new AbstractAction(jCheckBox6.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox6.isSelected()) {
                    jComboBox1.setActionCommand("The New Action Command");
                } else {
                    jComboBox1.setActionCommand("comboBoxChanged");
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Action Command Text  */\n\n"
                        + "jComboBox1.setActionCommand(\"The New Action Command\");\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jComboBox1.setActionCommand(\"comboBoxChanged\");\n"
                        + "*/\n"
                );
            }
        });

        //Set Enabled
        jCheckBox1.setAction(new AbstractAction(jCheckBox1.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox1.isSelected()) {
                    jComboBox1.setEnabled(true);
                } else {
                    jComboBox1.setEnabled(false);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Enabled  */\n\n"
                        + "jComboBox1.setEnabled(true); //default\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jComboBox1.setEnabled(true); //default\n"
                        + "*/\n"
                );
            }
        });

        //Set New Item Type
        jCheckBox4.setAction(new AbstractAction(jCheckBox4.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox4.isSelected()) {
                    jComboBox1.setModel(new DefaultComboBoxModel<Color>(new Color[]{Color.WHITE, Color.BLUE, Color.MAGENTA}));
                } else {
                    jComboBox1.setModel(new DefaultComboBoxModel());
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set New Item Type  */\n\n"
                        + "jComboBox1.setModel(new DefaultComboBoxModel<Color>(new Color[]{Color.WHITE,Color.BLUE,Color.MAGENTA}));\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jComboBox1.setModel(new DefaultComboBoxModel());\n"
                        + "*/\n"
                );
            }
        });
    }
}
