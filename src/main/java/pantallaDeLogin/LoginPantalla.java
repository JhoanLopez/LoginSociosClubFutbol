package pantallaDeLogin;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import metodosSql.Metodos;
import metodosSql.MetodosSql;

/**
 *
 * @author Jhoan López
 */
public class LoginPantalla extends javax.swing.JFrame {

    int cont1 = 0;
    int cont2 = 0;
    
    
    public LoginPantalla() {
        initComponents();
        asigImg.asignarImagenes("RealMadridEscudo.png", jl_escudo);
        asigImg.asignarImagenes("BienvenidosFinal.png", jl_bienvenidos);
        asigImg.asignarImagenes("MadridistasFinal.png", jl_madridistas);
        asigImg.asignarImagenes("DegradadoNuevo.png", jl_gradient);
        asigImg.asignarImagenes("LineaHorizontal.png", jl_linea);
        asigImg.asignarImagenes("Usuario.png", jl_usuarioLogo);
        asigImg.asignarImagenes("Candado.png", jl_candadoLogo);
        asigImg.asignarImagenes("Check.png", jl_check);
        asigImg.asignarImagenes("Cross.png", jl_cross);
        asigImg.asignarImagenes("Check.png", jl_check2);
        asigImg.asignarImagenes("Cross.png", jl_cross);
        jl_check.setVisible(false);
        jl_cross.setVisible(false);
        jl_cross2.setVisible(false);
        jl_check2.setVisible(false);
        correoTxt.setEditable(false);
    }
    
    PantallaPerfil perfil = new PantallaPerfil();
    MetodosSql metodos = new MetodosSql();
    Metodos asigImg = new Metodos();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_linea = new javax.swing.JLabel();
        jl_gradient = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jl_escudo = new javax.swing.JLabel();
        jl_bienvenidos = new javax.swing.JLabel();
        jl_madridistas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        correoTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contrasenaTxt = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jl_candadoLogo = new javax.swing.JLabel();
        jl_usuarioLogo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jl_check = new javax.swing.JLabel();
        jl_cross = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jl_check2 = new javax.swing.JLabel();
        jl_cross2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jl_linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 200, 360));

        jl_gradient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_gradient.setIcon(new javax.swing.ImageIcon("C:\\Users\\jleon\\OneDrive\\Documentos\\NetBeansProjects\\PantallaDeLogin\\src\\main\\java\\imagenes\\DegradadoNuevo.PNG")); // NOI18N
        getContentPane().add(jl_gradient, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 140, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jl_escudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_escudo.setPreferredSize(new java.awt.Dimension(150, 250));

        jl_bienvenidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_madridistas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jl_escudo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jl_bienvenidos, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jl_madridistas, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jl_bienvenidos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_escudo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_madridistas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 400));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 400));

        correoTxt.setBackground(new java.awt.Color(0, 153, 255));
        correoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correoTxt.setForeground(new java.awt.Color(255, 255, 255));
        correoTxt.setText("Número de Socio");
        correoTxt.setBorder(null);
        correoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoTxtFocusGained(evt);
            }
        });
        correoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoTxtMouseClicked(evt);
            }
        });
        correoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoTxtActionPerformed(evt);
            }
        });
        correoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoTxtKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");

        contrasenaTxt.setBackground(new java.awt.Color(0, 153, 255));
        contrasenaTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contrasenaTxt.setForeground(new java.awt.Color(255, 255, 255));
        contrasenaTxt.setText("***************");
        contrasenaTxt.setBorder(null);
        contrasenaTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contrasenaTxtFocusGained(evt);
            }
        });
        contrasenaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaTxtActionPerformed(evt);
            }
        });
        contrasenaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contrasenaTxtKeyTyped(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Registrarme");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(25, 25));
        jPanel6.setPreferredSize(new java.awt.Dimension(25, 20));

        jl_check.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_check.setIcon(new javax.swing.ImageIcon("C:\\Users\\jleon\\OneDrive\\Documentos\\NetBeansProjects\\PantallaDeLogin\\src\\main\\java\\imagenes\\Check.png")); // NOI18N
        jl_check.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jl_cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_cross.setIcon(new javax.swing.ImageIcon("C:\\Users\\jleon\\OneDrive\\Documentos\\NetBeansProjects\\PantallaDeLogin\\src\\main\\java\\imagenes\\Cross.png")); // NOI18N
        jl_cross.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_cross, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_check, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_check, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_cross, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(25, 25));
        jPanel5.setName(""); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(25, 20));

        jl_check2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_check2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jleon\\OneDrive\\Documentos\\NetBeansProjects\\PantallaDeLogin\\src\\main\\java\\imagenes\\Check.png")); // NOI18N
        jl_check2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jl_cross2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_cross2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jleon\\OneDrive\\Documentos\\NetBeansProjects\\PantallaDeLogin\\src\\main\\java\\imagenes\\Cross.png")); // NOI18N
        jl_cross2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_cross2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_check2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_check2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jl_cross2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("X");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel11.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel11.setPreferredSize(new java.awt.Dimension(20, 20));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-");
        jLabel12.setAlignmentY(0.0F);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel12.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel12.setPreferredSize(new java.awt.Dimension(20, 20));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jl_candadoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(contrasenaTxt))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64)
                                    .addComponent(jButton2))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jl_usuarioLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(correoTxt))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_usuarioLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(contrasenaTxt)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl_candadoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(65, 65, 65))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 410, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void correoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoTxtActionPerformed

    private void contrasenaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaTxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registro nuevoRegistro = new Registro();
        nuevoRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void contrasenaTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contrasenaTxtFocusGained
        
        if (cont1 == 0) {
            contrasenaTxt.setText("");
            cont1++;
        } 
    }//GEN-LAST:event_contrasenaTxtFocusGained

    private void correoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_correoTxtFocusGained

    private void correoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoTxtMouseClicked

        if (cont2 == 0) {
            correoTxt.setText("");
            cont2++;
        }        
    }//GEN-LAST:event_correoTxtMouseClicked

    private void correoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoTxtKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57 || key == 8 || key == 127;
        correoTxt.setEditable(true);
        
        if (!numeros) {
            evt.consume();
            jLabel6.setText("El número de socio solo contiene números");
            jl_cross.setVisible(true);
            jl_check.setVisible(false);
            if (correoTxt.getText().length() == 5) {
                jl_cross.setVisible(false);
                jl_check.setVisible(true);  
            }
        } else if (correoTxt.getText().length() >= 5) {
            evt.consume();   
            jLabel6.setText("El número de socio tiene máximo 5 números");
        } else {
            jLabel6.setText("");
            jl_cross.setVisible(false);  
            jl_check.setVisible(true);
        } 
    }//GEN-LAST:event_correoTxtKeyTyped

    private void contrasenaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contrasenaTxtKeyTyped
        if (contrasenaTxt.getText().length() >= 13) {
            evt.consume();
            jLabel5.setText("La contraseña debe tener máximo 13 caracteres");
            
        } else if (contrasenaTxt.getText().length() < 8) {
            jLabel5.setText("La contraseña debe tener mínimo 8 caracteres");
            jl_cross2.setVisible(true);
            jl_check2.setVisible(false);
        } else {
            jLabel5.setText("");
            jl_cross2.setVisible(false);
            jl_check2.setVisible(true);
        }
    }//GEN-LAST:event_contrasenaTxtKeyTyped

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.setExtendedState(ICONIFIED);
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String busquedaUsuario =
        MetodosSql.buscarUsuarioRegistrado(correoTxt.getText(), contrasenaTxt.getText().toString());
        //metodos.buscarUsuarioRegistrado(correoTxt.getText(), contrasenaTxt.getText());
        
        if (busquedaUsuario.equalsIgnoreCase("Usuario encontrado")) {
            //Ya estoy dentro
            perfil.setVisible(true);
            perfil.nombre.setText(MetodosSql.buscarNombre(correoTxt.getText()).toString().toUpperCase());
            perfil.numeroLbl.setText(correoTxt.getText().toString());
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no registrado, prueba a registrarte");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(LoginPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasenaTxt;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jl_bienvenidos;
    private javax.swing.JLabel jl_candadoLogo;
    private javax.swing.JLabel jl_check;
    private javax.swing.JLabel jl_check2;
    private javax.swing.JLabel jl_cross;
    private javax.swing.JLabel jl_cross2;
    private javax.swing.JLabel jl_escudo;
    private javax.swing.JLabel jl_gradient;
    private javax.swing.JLabel jl_linea;
    private javax.swing.JLabel jl_madridistas;
    private javax.swing.JLabel jl_usuarioLogo;
    // End of variables declaration//GEN-END:variables
}
