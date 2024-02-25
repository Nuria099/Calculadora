/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.calculadora;

/**
 * Interfaz gráfica de usuario, la calculadora que ve el usuario
 * @author nuria, Mario, Paola y Nicolas
 */
public class GUICalculadora extends javax.swing.JFrame{
    /**
     * Creates new form GUICalculadora
     */
    public GUICalculadora() {
        initComponents();
    }
    /**
     * Calcula la operación, juntando todos los métodos que utilizamos
     * @param cadena
     * @return el resultado de la operación
     */
    public String resultado(String cadena){
       String res="";
       res = Calculadora.Calcular(cadena);
       return res;
      
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tFMain = new java.awt.TextField();
        jBN7 = new javax.swing.JButton();
        jBN8 = new javax.swing.JButton();
        jBN9 = new javax.swing.JButton();
        jBDelete = new javax.swing.JButton();
        jBClear = new javax.swing.JButton();
        jBN4 = new javax.swing.JButton();
        jBN5 = new javax.swing.JButton();
        jBN6 = new javax.swing.JButton();
        jBParentesisIzq = new javax.swing.JButton();
        jBParentesisDer = new javax.swing.JButton();
        jBMenos = new javax.swing.JButton();
        jBMas = new javax.swing.JButton();
        jBN3 = new javax.swing.JButton();
        jBN2 = new javax.swing.JButton();
        jBN1 = new javax.swing.JButton();
        jBN0 = new javax.swing.JButton();
        jBMultiplicacion = new javax.swing.JButton();
        jBDivision = new javax.swing.JButton();
        jBPunto = new javax.swing.JButton();
        jBCambioS = new javax.swing.JButton();
        jBExponente = new javax.swing.JButton();
        jBIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tFMain.setFont(new java.awt.Font("Helvetica Neue", 1, 25));
        tFMain.setText("");
        tFMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFMainActionPerformed(evt);
            }
        });
        tFMain.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                tFMainTextValueChanged(evt);
            }
        });

        jBN7.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN7.setText("7");
        jBN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN7ActionPerformed(evt);
            }
        });

        jBN8.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN8.setText("8");
        jBN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN8ActionPerformed(evt);
            }
        });

        jBN9.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN9.setText("9");
        jBN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN9ActionPerformed(evt);
            }
        });

        jBDelete.setFont(new java.awt.Font("Helvetica Neue", 3, 17)); // NOI18N
        jBDelete.setText("DEL");
        jBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteActionPerformed(evt);
            }
        });

        jBClear.setFont(new java.awt.Font("Helvetica Neue", 3, 17)); // NOI18N
        jBClear.setText("AC");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });

        jBN4.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN4.setText("4");
        jBN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN4ActionPerformed(evt);
            }
        });

        jBN5.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN5.setText("5");
        jBN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN5ActionPerformed(evt);
            }
        });

        jBN6.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN6.setText("6");
        jBN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN6ActionPerformed(evt);
            }
        });

        jBParentesisIzq.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBParentesisIzq.setText("(");
        jBParentesisIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBParentesisIzqActionPerformed(evt);
            }
        });

        jBParentesisDer.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBParentesisDer.setText(")");
        jBParentesisDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBParentesisDerActionPerformed(evt);
            }
        });

        jBMenos.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBMenos.setText("-");
        jBMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenosActionPerformed(evt);
            }
        });

        jBMas.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBMas.setText("+");
        jBMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMasActionPerformed(evt);
            }
        });

        jBN3.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN3.setText("3");
        jBN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN3ActionPerformed(evt);
            }
        });

        jBN2.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN2.setText("2");
        jBN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN2ActionPerformed(evt);
            }
        });

        jBN1.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN1.setText("1");
        jBN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN1ActionPerformed(evt);
            }
        });

        jBN0.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBN0.setText("0");
        jBN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBN0ActionPerformed(evt);
            }
        });

        jBMultiplicacion.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBMultiplicacion.setText("*");
        jBMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicacionActionPerformed(evt);
            }
        });

        jBDivision.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBDivision.setText("÷");
        jBDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDivisionActionPerformed(evt);
            }
        });

        jBPunto.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBPunto.setText(".");
        jBPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPuntoActionPerformed(evt);
            }
        });

        jBCambioS.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBCambioS.setText("(-)");
        jBCambioS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCambioSActionPerformed(evt);
            }
        });

        jBExponente.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBExponente.setText("^");
        jBExponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExponenteActionPerformed(evt);
            }
        });

        jBIgual.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jBIgual.setText("=");
        jBIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tFMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBN4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBN5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBN1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBN2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBN7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBN8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBN0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBCambioS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBN6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBN3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBN9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBParentesisIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jBMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jBMas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBParentesisDer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBExponente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tFMain, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBParentesisIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBParentesisDer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBMas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBN7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBN8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBN9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBN4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBN5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBN6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBN3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBN2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBN1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBN0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCambioS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBExponente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    /**
     * Texto en donde poner la operación
     * @param evt 
     */
    private void tFMainActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      

    /**
     * Botón del número 7, que hace que en el texto salga el numero 7
     * @param evt 
     */
    private void jBN7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "7");
    }                                    

    /**
     * Botón que hace que todo lo de la operación se elimine
     * @param evt 
     */
    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {                                        
        tFMain.setText("");
    }                                       

    /**
     * Botón del número 4, que hace que en el texto salga el numero 4
     * @param evt 
     */
    private void jBN4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "4");
    }                                    

    /**
     * Botón del número 5, que hace que en el texto salga el numero 5
     * @param evt 
     */
    private void jBN5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "5");
    }                                    

    /**
     * Botón del número 6, que hace que en el texto salga el numero 6
     * @param evt 
     */
    private void jBN6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "6");
    }                                    

    /**
     * Botón del signo (, que hace que en el texto salga el signo (
     * @param evt 
     */
    private void jBParentesisIzqActionPerformed(java.awt.event.ActionEvent evt) {                                                
        tFMain.setText(tFMain.getText() + "(");
    }                                               

    /**
     * Botón del signo ), que hace que en el texto salga el signo )
     * @param evt 
     */
    private void jBParentesisDerActionPerformed(java.awt.event.ActionEvent evt) {                                                
        tFMain.setText(tFMain.getText() + ")");
    }       
    
    /**
     * Botón del operador - (de la resta), que hace que en el texto salga el operador de resta
     * @param evt 
     */
    private void jBMenosActionPerformed(java.awt.event.ActionEvent evt) {                                        
        tFMain.setText(tFMain.getText() + "-");
    }                                       

    /**
     * Botón del operador + (de la suma), que hace que en el texto salga el operador de suma
     * @param evt 
     */
    private void jBMasActionPerformed(java.awt.event.ActionEvent evt) {                                      
        tFMain.setText(tFMain.getText() + "+");
    }                                     

    /**
     * Botón del número 3, que hace que en el texto salga el numero 3
     * @param evt 
     */
    private void jBN3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "3");
    }                                    

    /**
     * Botón del número 2, que hace que en el texto salga el numero 2
     * @param evt 
     */
    private void jBN2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "2");
    }                                    

    /**
     * Botón del número 1, que hace que en el texto salga el numero 1
     * @param evt 
     */
    private void jBN1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "1");
    }                                    

    /**
     * Botón del número 0, que hace que en el texto salga el numero 0
     * @param evt 
     */
    private void jBN0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "0");
    }                                    

    /**
     * Botón del operador * (de la multiplicación), que hace que en el texto salga el operador de multiplicación
     * @param evt 
     */
    private void jBMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        tFMain.setText(tFMain.getText() + "*");
    }                                                

    /**
     * Botón del operador / (de la división), que hace que en el texto salga el operador de división
     * @param evt 
     */
    private void jBDivisionActionPerformed(java.awt.event.ActionEvent evt) {                                           
        tFMain.setText(tFMain.getText() + "/");
    }                                          

    /**
     * Botón del punto ( . ), que hace que en el texto salga el punto
     * @param evt 
     */
    private void jBPuntoActionPerformed(java.awt.event.ActionEvent evt) {                                        
         tFMain.setText(tFMain.getText() + ".");
    }                                       

    /**
     * Botón del negativo, que hace que en el texto salga el negativo
     * @param evt 
     */
    private void jBCambioSActionPerformed(java.awt.event.ActionEvent evt) {                                          
        tFMain.setText(tFMain.getText()+ "~");
    }                                         

    /**
     * Botón del operador  (de la potencia), que hace que en el texto salga el operador de potencia
     * @param evt 
     */
    private void jBExponenteActionPerformed(java.awt.event.ActionEvent evt) {                                            
        tFMain.setText(tFMain.getText() + "^");
    }                                           

    /**
     * Botón que hace que se haga la operación, y pone el resultado en la casilla de texto
     * @param evt 
     */
    private void jBIgualActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String cadena = tFMain.getText();
        
        tFMain.setText(resultado(cadena));
    }                                       

    /**
     * Botón del número 9, que hace que en el texto salga el numero 9
     * @param evt 
     */
    private void jBN9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "9");
    }                                    

    /**
     * Bloque de texto
     * @param evt 
     */
    private void tFMainTextValueChanged(java.awt.event.TextEvent evt) {
        //tfMain.setText("");
        //TODO add your handling code here:
    }                                       

    /**
     * Botón para borrar algo de la caja de texto de la calculadora
     * @param evt 
     */
    private void jBDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        int length = tFMain.getText().length();
        int num = tFMain.getText().length() - 1;
        String aux;
        
        if(length > 0){
            StringBuilder sB = new StringBuilder(tFMain.getText());
            sB.deleteCharAt(num);
            aux = sB.toString();
            tFMain.setText(aux);
        }
        
    }                                        

    /**
     * Botón del número 8, que hace que en el texto salga el numero 8
     * @param evt 
     */
    private void jBN8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        tFMain.setText(tFMain.getText() + "8");
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
            java.util.logging.Logger.getLogger(GUICalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBCambioS;
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBDelete;
    private javax.swing.JButton jBDivision;
    private javax.swing.JButton jBExponente;
    private javax.swing.JButton jBIgual;
    private javax.swing.JButton jBMas;
    private javax.swing.JButton jBMenos;
    private javax.swing.JButton jBMultiplicacion;
    private javax.swing.JButton jBN0;
    private javax.swing.JButton jBN1;
    private javax.swing.JButton jBN2;
    private javax.swing.JButton jBN3;
    private javax.swing.JButton jBN4;
    private javax.swing.JButton jBN5;
    private javax.swing.JButton jBN6;
    private javax.swing.JButton jBN7;
    private javax.swing.JButton jBN8;
    private javax.swing.JButton jBN9;
    private javax.swing.JButton jBParentesisDer;
    private javax.swing.JButton jBParentesisIzq;
    private javax.swing.JButton jBPunto;
    private java.awt.TextField tFMain;
    // End of variables declaration                   
}
