/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.diego.pe.cpresentacion;

/**
 *
 * @author Soporte
 */
public class Calculadora extends javax.swing.JPanel {

    public Calculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfResultado = new javax.swing.JTextField();
        btnDivision = new javax.swing.JButton();
        btnProcentaje = new javax.swing.JButton();
        btnce = new javax.swing.JButton();
        btncc = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(243, 243, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        jLabel1.setText("Calculadora");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 6, -1, -1));

        tfResultado.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        tfResultado.setForeground(new java.awt.Color(0, 0, 102));
        tfResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(tfResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 48, 370, 119));

        btnDivision.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(102, 102, 102));
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 70, 70));

        btnProcentaje.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnProcentaje.setForeground(new java.awt.Color(102, 102, 102));
        btnProcentaje.setText("%");
        jPanel1.add(btnProcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, 70));

        btnce.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnce.setForeground(new java.awt.Color(102, 102, 102));
        btnce.setText("ce");
        btnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceActionPerformed(evt);
            }
        });
        jPanel1.add(btnce, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 70, 70));

        btncc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btncc.setForeground(new java.awt.Color(102, 102, 102));
        btncc.setText("cc");
        btncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnccActionPerformed(evt);
            }
        });
        jPanel1.add(btncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 70));

        btn7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(102, 102, 102));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 70));

        btn8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(102, 102, 102));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 70, 70));

        btn9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(102, 102, 102));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 70, 70));

        btnMultiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(102, 102, 102));
        btnMultiplicacion.setText("x");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 70, 70));

        btn6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(102, 102, 102));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 70, 70));

        btnResta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(102, 102, 102));
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 70, 70));

        btn5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(102, 102, 102));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 70, 70));

        btn4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(102, 102, 102));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 70, 70));

        btnSuma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(102, 102, 102));
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 70, 70));

        btn3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(102, 102, 102));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 70, 70));

        btn2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(102, 102, 102));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 70, 70));

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(102, 102, 102));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 70, 70));

        btn0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(102, 102, 102));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 70, 70));

        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(102, 102, 102));
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel1.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 70, 70));

        btnPunto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(102, 102, 102));
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 70, 70));

        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(102, 102, 102));
        jButton21.setText("@");
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void operacion(String sentencia){
        if (sentencia.contains("+")) {
            this.numeroOperado(sentencia, "\\+" ,"+");
            
        } else if (sentencia.contains("-")){
            this.numeroOperado(sentencia, "-","-");
            
        }else if (sentencia.contains("/")){
            this.numeroOperado(sentencia, "/" ,"/");
            
        }else if (sentencia.contains("*")){
            this.numeroOperado(sentencia, "\\*","*");
        }
    }
    
    public void numeroOperado(String sentencia, String Simbolo, String valida){
        String[] cortar =  sentencia.split("");
        String[] numero;
        float primerNumero =  0;
        float SegundoNumero = 0;
        if(cortar[0].contains(valida)){
            numero =  sentencia.substring(1,sentencia.length()).split(Simbolo);
            primerNumero = Float.parseFloat(numero[0])-Float.parseFloat(numero[0])*2 ;
            SegundoNumero = 0 ;
        }else{
            numero =  sentencia.split(Simbolo);
            primerNumero = Float.parseFloat(numero[0]) ;
            SegundoNumero = Float.parseFloat(numero[1]) ; 
        }
        float resultado = 0;
        if (Simbolo.equals("\\+")) {
            resultado = primerNumero + SegundoNumero;
        }else if(Simbolo.equals("-")){
            resultado = primerNumero - SegundoNumero;
        }else if(Simbolo.equals("\\*")){
            resultado = primerNumero * SegundoNumero;
        }else if(Simbolo.equals("/")){
            resultado = primerNumero / SegundoNumero;
        }
        this.tfResultado.setText(String.valueOf(resultado));
    }
    
    private void tfResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfResultadoActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + ".");

    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        this.tfResultado.setText( this.tfResultado.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        this.operacion(this.tfResultado.getText());
        this.tfResultado.setText( this.tfResultado.getText() + "/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        this.operacion(this.tfResultado.getText());
        this.tfResultado.setText( this.tfResultado.getText() + "*");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        this.operacion(this.tfResultado.getText());
        this.tfResultado.setText( this.tfResultado.getText() + "-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        this.operacion(this.tfResultado.getText());
        this.tfResultado.setText( this.tfResultado.getText() + "+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        this.operacion(this.tfResultado.getText());
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnccActionPerformed
        this.tfResultado.setText("");
    }//GEN-LAST:event_btnccActionPerformed

    private void btnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceActionPerformed
        int tamanio = this.tfResultado.getText().length();
        this.tfResultado.setText(
                this.tfResultado.getText().substring(0,tamanio-1)
        );
    }//GEN-LAST:event_btnceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnProcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btncc;
    private javax.swing.JButton btnce;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfResultado;
    // End of variables declaration//GEN-END:variables
}
