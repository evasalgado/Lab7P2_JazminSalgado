/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_jazminsalgado;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author evaja
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        
        pn_iniciarsesion.setVisible(false);
        pn_menuuser.setVisible(false);
        pn_menuadmin.setVisible(false);
        this.setLocationRelativeTo(null);
        jDialog1.pack();
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setModal(true);
        jDialog1.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        bt_iniciarsesion = new javax.swing.JButton();
        pn_registrarse = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_agregarnombrecomun = new javax.swing.JTextField();
        tf_Agregarpswrd = new javax.swing.JPasswordField();
        tf_agregarusername = new javax.swing.JTextField();
        bt_agregarUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pn_iniciarsesion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pf_pswdsignin = new javax.swing.JPasswordField();
        tf_usersignin = new javax.swing.JTextField();
        bt_iniciarSesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pn_menuuser = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_restaurantes = new javax.swing.JTree();
        bt_comprarProducto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pn_menuadmin = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        bt_agregarrest = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tf_nombrerest = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_ubicacionrest = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_nombreprod = new javax.swing.JTextField();
        bt_agregarprod = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_restE = new javax.swing.JTree();
        bt_eliminarRest = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_user = new javax.swing.JTree();
        jScrollPane4 = new javax.swing.JScrollPane();
        t_rest = new javax.swing.JTree();
        mb_opciones = new javax.swing.JMenuBar();
        m_archivos = new javax.swing.JMenu();
        mi_salir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mi_eliminar = new javax.swing.JMenuItem();

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_iniciarsesion.setText("Sign In");
        bt_iniciarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciarsesionMouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(bt_iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");

        bt_agregarUser.setText("Agregar Usuario");
        bt_agregarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarUserMouseClicked(evt);
            }
        });

        jLabel2.setText("Nombre de Usuario");

        jLabel3.setText("Nombre");

        jLabel4.setText("Contraseña");

        javax.swing.GroupLayout pn_registrarseLayout = new javax.swing.GroupLayout(pn_registrarse);
        pn_registrarse.setLayout(pn_registrarseLayout);
        pn_registrarseLayout.setHorizontalGroup(
            pn_registrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_registrarseLayout.createSequentialGroup()
                .addGroup(pn_registrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_registrarseLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_registrarseLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(bt_agregarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(pn_registrarseLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(pn_registrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_agregarnombrecomun)
                            .addComponent(tf_Agregarpswrd)
                            .addComponent(tf_agregarusername)
                            .addGroup(pn_registrarseLayout.createSequentialGroup()
                                .addGroup(pn_registrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(108, 108, 108))
        );
        pn_registrarseLayout.setVerticalGroup(
            pn_registrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_registrarseLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(tf_agregarnombrecomun, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_agregarusername, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(tf_Agregarpswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_agregarUser)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(pn_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, -1, 440));

        pn_iniciarsesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sign In");
        pn_iniciarsesion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 38, 145, 44));
        pn_iniciarsesion.add(pf_pswdsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 218, 116, 42));
        pn_iniciarsesion.add(tf_usersignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 122, 116, 57));

        bt_iniciarSesion.setText("Iniciar Sesion");
        bt_iniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciarSesionMouseClicked(evt);
            }
        });
        pn_iniciarsesion.add(bt_iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 278, -1, -1));

        jLabel6.setText("Nombre de Usuario");
        pn_iniciarsesion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 100, 116, -1));

        jLabel8.setText("Contraseña");
        pn_iniciarsesion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 197, 116, -1));

        jDialog1.getContentPane().add(pn_iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, -1, 440));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Restaurantes");
        t_restaurantes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(t_restaurantes);

        bt_comprarProducto.setText("Comprar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(bt_comprarProducto)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(bt_comprarProducto)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comprar ", jPanel3);

        jLabel7.setText("Nuevo Nombre ");

        jLabel9.setText("Nuevo Nombre de Usuario");

        jLabel10.setText("Nueva Contraseña");

        jButton2.setText("Guardar Cambios");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel4);

        javax.swing.GroupLayout pn_menuuserLayout = new javax.swing.GroupLayout(pn_menuuser);
        pn_menuuser.setLayout(pn_menuuserLayout);
        pn_menuuserLayout.setHorizontalGroup(
            pn_menuuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_menuuserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        pn_menuuserLayout.setVerticalGroup(
            pn_menuuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_menuuserLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        bt_agregarrest.setText("Crear Restaurante");

        jLabel14.setText("Nombre");

        jLabel15.setText("Ubicación");

        jLabel16.setText("Agregar Producto: ");

        jLabel17.setText("Nombre de Producto:");

        bt_agregarprod.setText("Agregar Producto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_agregarrest)
                .addGap(16, 16, 16))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombrerest, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ubicacionrest, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_nombreprod, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_agregarprod))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombrerest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_ubicacionrest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(bt_agregarrest)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombreprod, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_agregarprod)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Agregar ", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Restaurantes");
        t_restE.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(t_restE);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 520, 200));

        bt_eliminarRest.setText("Eliminar ");
        jPanel6.add(bt_eliminarRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jTabbedPane2.addTab("Eliminar", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Usuarios");
        t_user.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(t_user);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, 250));

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Restaurantes");
        t_rest.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(t_rest);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 250));

        jTabbedPane2.addTab("Ver Datos", jPanel7);

        javax.swing.GroupLayout pn_menuadminLayout = new javax.swing.GroupLayout(pn_menuadmin);
        pn_menuadmin.setLayout(pn_menuadminLayout);
        pn_menuadminLayout.setHorizontalGroup(
            pn_menuadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_menuadminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        pn_menuadminLayout.setVerticalGroup(
            pn_menuadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_menuadminLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        m_archivos.setText("Opciones");

        mi_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        mi_salir.setText("Salir");
        m_archivos.add(mi_salir);
        m_archivos.add(jSeparator1);

        mi_eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mi_eliminar.setText("Eliminar User");
        m_archivos.add(mi_eliminar);

        mb_opciones.add(m_archivos);

        setJMenuBar(mb_opciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_menuuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(pn_menuadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_menuuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(pn_menuadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_iniciarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciarsesionMouseClicked
        bt_iniciarsesion.setVisible(false);
        pn_iniciarsesion.setVisible(true);
        pn_registrarse.setVisible(false);
    }//GEN-LAST:event_bt_iniciarsesionMouseClicked

    private void bt_iniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciarSesionMouseClicked

        if (tf_usersignin.getText().equals("admin123")&&pf_pswdsignin.getText().equals("123a")) {
            iniciarAdmin();
        }else{
           iniciarUser();
        }
        
    }//GEN-LAST:event_bt_iniciarSesionMouseClicked

    private void bt_agregarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarUserMouseClicked
        File f = new File("./users.urs");
        JFileChooser jfc = new JFileChooser("./");
        jfc.setFileFilter(fUser);
        String fname = jfc.getName(f);
       
        AdministrarUsuario au = new AdministrarUsuario(fname);
        String name = tf_agregarnombrecomun.getText(), username = tf_agregarusername.getText(), pswrd=tf_Agregarpswrd.getText();
        usuario u = new usuario(name, username, pswrd, 0);
        au.cargar();
        au.getListarUsers().add(u);
        try {
            au.escribir();
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Usuario creado exitosamente");
        tf_agregarnombrecomun.setText("");  
        tf_agregarusername.setText(""); 
        tf_Agregarpswrd.setText("");
    }//GEN-LAST:event_bt_agregarUserMouseClicked
    public void iniciarAdmin(){
        jDialog1.setVisible(false);
        pn_menuadmin.setVisible(true);
        pn_menuuser.setVisible(false);
        mi_eliminar.setEnabled(false);
        
    }
    public void iniciarUser(){
        jDialog1.setVisible(false);
        pn_menuadmin.setVisible(false);
        pn_menuuser.setVisible(true);
        mi_eliminar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
 FileNameExtensionFilter fRest= new FileNameExtensionFilter("Restaurante", "rst");
 FileNameExtensionFilter fUser= new FileNameExtensionFilter("Usuario", "usr");
 FileNameExtensionFilter fSale= new FileNameExtensionFilter("Venta", "vnt");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregarUser;
    private javax.swing.JButton bt_agregarprod;
    private javax.swing.JButton bt_agregarrest;
    private javax.swing.JButton bt_comprarProducto;
    private javax.swing.JButton bt_eliminarRest;
    private javax.swing.JButton bt_iniciarSesion;
    private javax.swing.JButton bt_iniciarsesion;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JMenu m_archivos;
    private javax.swing.JMenuBar mb_opciones;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JMenuItem mi_salir;
    private javax.swing.JPasswordField pf_pswdsignin;
    private javax.swing.JPanel pn_iniciarsesion;
    private javax.swing.JPanel pn_menuadmin;
    private javax.swing.JPanel pn_menuuser;
    private javax.swing.JPanel pn_registrarse;
    private javax.swing.JTree t_rest;
    private javax.swing.JTree t_restE;
    private javax.swing.JTree t_restaurantes;
    private javax.swing.JTree t_user;
    private javax.swing.JPasswordField tf_Agregarpswrd;
    private javax.swing.JTextField tf_agregarnombrecomun;
    private javax.swing.JTextField tf_agregarusername;
    private javax.swing.JTextField tf_nombreprod;
    private javax.swing.JTextField tf_nombrerest;
    private javax.swing.JTextField tf_ubicacionrest;
    private javax.swing.JTextField tf_usersignin;
    // End of variables declaration//GEN-END:variables
}
