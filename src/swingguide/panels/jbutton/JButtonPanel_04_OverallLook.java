/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swingguide.panels.jbutton;

import swingguide.helpers.ComponentPanel;
import swingguide.helpers.ComponentTemplate;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.synth.Region;
import javax.swing.plaf.synth.SynthButtonUI;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.swing.plaf.synth.SynthStyle;

/**
 *
 * @author Light
 */
public class JButtonPanel_04_OverallLook extends ComponentPanel {

    JButton jButton1;
    JButtonPanel jButtonPanel;
    
    /**
     * Creates new form NewJPanel3
     */
    public JButtonPanel_04_OverallLook() {
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

        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();

        jCheckBox20.setText("Hide the Focus Border");

        jCheckBox18.setText("Hide Border");

        jCheckBox17.setText("Set Border");

        jCheckBox16.setText("Set Background Color");

        jCheckBox15.setText("Set Foreground Color");

        jCheckBox14.setText("Change Size");

        jCheckBox25.setText("Make Opaque");

        jCheckBox24.setText("Set Gap between Icon and Text");

        jCheckBox23.setText("Change Font");

        jCheckBox22.setText("Change Margin");

        jCheckBox21.setText("Make Invisible");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox21)
                            .addComponent(jCheckBox24)
                            .addComponent(jCheckBox23)
                            .addComponent(jCheckBox20)
                            .addComponent(jCheckBox18)
                            .addComponent(jCheckBox17)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox15)
                            .addComponent(jCheckBox22)
                            .addComponent(jCheckBox25))
                        .addGap(0, 215, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox14)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox16)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox22)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox21)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox23)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox24)
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public String getTitle() {
        return "Overall Look";
    }

    @Override
    public void setup(Component primaryComponent, ComponentTemplate componentTemplate) {

        jButton1 = (JButton)primaryComponent;
        jButtonPanel = (JButtonPanel)componentTemplate;

        //Set Size
        jCheckBox14.setAction(new AbstractAction(jCheckBox14.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox14.isSelected()) {
                    Dimension dim = new Dimension(400, 200);
                    jButton1.setMinimumSize(dim);
                    jButton1.setPreferredSize(dim);
                    jButton1.getParent().revalidate();
                } else {
                    jButton1.setMinimumSize(null);
                    jButton1.setPreferredSize(null);
                    jButton1.getParent().revalidate();
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Size  */\n\n"
                        + "Dimension dim = new Dimension(400, 200);\n"
                        + "jButton1.setMinimumSize(dim);\n"
                        + "jButton1.setPreferredSize(dim);\n"
                        + "jButton1.getParent().revalidate();\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jButton1.setMinimumSize(null);\n"
                        + "    jButton1.setPreferredSize(null);\n"
                        + "    jButton1.getParent().revalidate();\n"
                        + "*/\n"
                );
            }
        });

        //Set Foreground Color
        jCheckBox15.setAction(new AbstractAction(jCheckBox15.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox15.isSelected()) {
                    jButton1.setForeground(Color.RED);
                } else {
                    jButton1.setForeground(null);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Foreground Color  */\n\n"
                        + "jButton1.setForeground(Color.RED);\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jButton1.setForeground(null);\n"
                        + "*/\n"
                );
            }
        });

        //Set Background Color
        jCheckBox16.setAction(new AbstractAction(jCheckBox16.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox16.isSelected()) {
                    jButton1.setBackground(Color.GREEN);
                } else {
                    SynthStyle style = SynthLookAndFeel.getStyle(jButton1, Region.BUTTON);
                    SynthContext context = ((SynthButtonUI) jButton1.getUI()).getContext(jButton1);
                    jButton1.setBackground((Color) style.get(context, "background"));
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Background Color  */\n\n"
                        + "jButton1.setBackground(Color.GREEN);\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    SynthStyle style = SynthLookAndFeel.getStyle(jButton1, Region.BUTTON);\n"
                        + "    SynthContext context = ((SynthButtonUI)jButton1.getUI()).getContext(jButton1);\n"
                        + "    jButton1.setBackground((Color)style.get(context, \"background\"));\n"
                        + "*/\n"
                );
            }
        });

        //Set Border
        jCheckBox17.setAction(new AbstractAction(jCheckBox17.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox17.isSelected()) {
                    jButton1.setBorder(new LineBorder(Color.BLUE, 4));
                } else {
                    jButton1.setBorder(null);
                    jButton1.updateUI();
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Border  */\n\n"
                        + "jButton1.setBorder(new LineBorder(Color.BLUE, 4));\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jButton1.setBorder(null);\n"
                        + "    jButton1.updateUI();\n"
                        + "*/\n"
                );
            }
        });

        //Hide Border
        jCheckBox18.setAction(new AbstractAction(jCheckBox18.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox18.isSelected()) {
                    jButton1.setBorderPainted(false);
                } else {
                    jButton1.setBorderPainted(true);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Hide Border  */\n\n"
                        + "jButton1.setBorderPainted(false);\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jButton1.setBorderPainted(true);\n"
                        + "*/\n"
                );
            }
        });

        //Hide the Focus Border
        jCheckBox20.setAction(new AbstractAction(jCheckBox20.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox20.isSelected()) {
                    jButton1.setFocusPainted(false);
                } else {
                    jButton1.setFocusPainted(true);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Hide the Focus Border  */\n\n"
                        + "jButton1.setFocusPainted(false);\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jButton1.setFocusPainted(true);\n"
                        + "*/\n"
                );
            }
        });

        //Change Margin
        jCheckBox22.setAction(new AbstractAction(jCheckBox22.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox22.isSelected()) {
                    jButton1.setMargin(new Insets(20, 20, 20, 20));
                } else {
                    jButton1.setMargin(null);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Change Margin  */\n\n"
                        + "jButton1.setMargin(new Insets(20,20,20,20));\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Description:\n"
                        + "    Ensures the size of the button is large enough to have this margin around the button text/icon \n"
                        + "\n"
                        + "Reset:\n"
                        + "    jButton1.setMargin(null);\n"
                        + "\n"
                        + "Note:\n"
                        + "    Depends on the button border if the margin will resize\n"
                        + "*/\n"
                );
            }
        });

        //Make Opaque
        jCheckBox25.setAction(new AbstractAction(jCheckBox25.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox25.isSelected()) {
                    jButton1.setOpaque(true);
                    jButton1.repaint();
                } else {
                    jButton1.setOpaque(false);
                    jButton1.repaint();
                }
                componentTemplate.setCodeTextArea(
                        "/*  Make Opaque  */\n\n"
                        + "jButton1.setOpaque(true);\n"
                        + "jButton1.repaint();\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jButton1.setOpaque(false);\n"
                        + "    jButton1.repaint();\n"
                        + "*/\n"
                );
            }
        });

        //Make Invisible
        jCheckBox21.setAction(new AbstractAction(jCheckBox21.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox21.isSelected()) {
                    jButton1.setContentAreaFilled(false);
                } else {
                    jButton1.setContentAreaFilled(true);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Make Invisible  */\n\n"
                        + "jButton1.setContentAreaFilled(false);\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jButton1.setContentAreaFilled(true);\n"
                        + "\n"
                        + "Note:\n"
                        + "    Will set Opacity to true if setContentAreaFilled is set to true\n"
                        + "*/\n"
                );
            }
        });

        //Change Font
        jCheckBox23.setAction(new AbstractAction(jCheckBox23.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox23.isSelected()) {
                    jButton1.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 23));
                } else {
                    jButton1.setFont(null);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Change Font  */\n\n"
                        + "jButton1.setFont(new Font(\"Courier New\", Font.BOLD | Font.ITALIC, 23));\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jButton1.setFont(null);\n"
                        + "*/\n"
                );
            }
        });

        //Set Gap between Icon and Text
        jCheckBox24.setAction(new AbstractAction(jCheckBox24.getText()) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox24.isSelected()) {
                    jButton1.setIconTextGap(40);
                } else {
                    jButton1.setIconTextGap(4);
                }
                componentTemplate.setCodeTextArea(
                        "/*  Set Gap between Icon and Text  */\n\n"
                        + "jButton1.setIconTextGap(40);\n"
                        + "\n"
                        + "\n"
                        + "/*\n"
                        + "Reset:\n"
                        + "    jButton1.setIconTextGap(4); //default value\n"
                        + "*/\n"
                );
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    // End of variables declaration//GEN-END:variables
}
