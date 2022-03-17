
package pantallas;

import dao.CriterioBusqueda;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Cliente;
import dao.interfaces.IPersistenciaEntidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableColumnModel;
import pantallas.util.JButtonCellEditor;
import pantallas.util.JButtonRenderer;

public class FmrClientes extends Formulario<Cliente> {
    
    private Cliente cliente;

    public FmrClientes(IPersistenciaEntidad<Cliente> persistencia) {
        super(persistencia);
        inicializar();
        cambiarOperacion(OperacionFormulario.AGREGAR, new Cliente());
    }
    
    public FmrClientes(IPersistenciaEntidad<Cliente> persistencia, Cliente cliente) {
        super(persistencia);
        inicializar();
        cambiarOperacion(OperacionFormulario.CONSULTAR, cliente);
    }
    
    private void inicializar() {
        initComponents();
        setBtnAceptar(btnAceptar);
        setBtnRestaurar(btnRestaurar);
        
        getCamposDeTexto().add(txtDireccion);
        getCamposDeTexto().add(txtNombre);
        getCamposDeTexto().add(txtRfc);
        getCamposDeTexto().add(txtTelefono);
        
        getEtiquetasDeError().add(errorDireccion);
        getEtiquetasDeError().add(errorNombre);
        getEtiquetasDeError().add(errorRfc);
        getEtiquetasDeError().add(errorTelefono);
        
        initTabla();
        buscar();
        restaurar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        errorNombre = new javax.swing.JLabel();
        errorDireccion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        errorRfc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        errorTelefono = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbBusqueda = new javax.swing.JComboBox<>();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");
        setIconImage(getIconImage());

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel2.setText("Nombre:");

        errorNombre.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorNombre.setForeground(new java.awt.Color(255, 0, 0));

        errorDireccion.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorDireccion.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Dirección:");

        errorRfc.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorRfc.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setText("RFC:");

        errorTelefono.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorTelefono.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setText("Teléfono:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRestaurar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(txtNombre))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorNombre)
                            .addComponent(errorDireccion)
                            .addComponent(errorRfc)
                            .addComponent(errorTelefono)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorNombre)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorDireccion)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorRfc)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorTelefono)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnRestaurar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel1.setText("Buscar por:");

        cmbBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nombre", "Direccion", "RFC", "Teléfono" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dirección", "RFC", "Teléfono", "Ver", "Editar", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusqueda)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Regstrar Cliente Nuevo");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
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
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnRegistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        volver();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        aceptar();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        restaurar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        cambiarOperacion(OperacionFormulario.AGREGAR, new Cliente());
        restaurar();
    }//GEN-LAST:event_btnRegistrarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbBusqueda;
    private javax.swing.JLabel errorDireccion;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JLabel errorRfc;
    private javax.swing.JLabel errorTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void initTabla(){
        ActionListener onVerClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablaOpcionVer();
            }
        };        
        int indiceColumna = 5;
        TableColumnModel modeloColumnas = this.tabla.getColumnModel();
        modeloColumnas.getColumn(indiceColumna)
                .setCellRenderer(new JButtonRenderer("Ver"));
        modeloColumnas.getColumn(indiceColumna)
                .setCellEditor(new JButtonCellEditor(new JTextField(), onVerClickListener));        
        
        ActionListener onEditarClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablaOpcionEditar();
            }
        };        
        indiceColumna = 6;
        modeloColumnas = this.tabla.getColumnModel();
        modeloColumnas.getColumn(indiceColumna)
                .setCellRenderer(new JButtonRenderer("Editar"));
        modeloColumnas.getColumn(indiceColumna)
                .setCellEditor(new JButtonCellEditor(new JTextField(), onEditarClickListener));    
        
        ActionListener onEliminarClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablaOpcionEliminar();
            }
        };        
        indiceColumna = 7;
        modeloColumnas = this.tabla.getColumnModel();
        modeloColumnas.getColumn(indiceColumna)
                .setCellRenderer(new JButtonRenderer("Eliminar"));
        modeloColumnas.getColumn(indiceColumna)
                .setCellEditor(new JButtonCellEditor(new JTextField(), onEliminarClickListener));    
    }
    
    public void tablaOpcionVer() {
        Cliente c = getPersistencia().consultar(idDeLaTabla());
        
        if(c == null) {
            JOptionPane.showMessageDialog(this, "Error consultando el Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        cambiarOperacion(OperacionFormulario.CONSULTAR, c);
    }
    
    public void tablaOpcionEditar() {
        Cliente c = getPersistencia().consultar(idDeLaTabla());
        
        if(c == null) {
            JOptionPane.showMessageDialog(this, "Error consultando el Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        cambiarOperacion(OperacionFormulario.EDITAR, c);
    }
    
    public void tablaOpcionEliminar() {
        int id = idDeLaTabla();
        int i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que desea eliminar este Cliente? (ID: "+id+")", "Confirmación", JOptionPane.YES_NO_OPTION);
        
        if(i == JOptionPane.YES_OPTION) {
            if(getPersistencia().eliminar(id)) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado al Cliente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private int idDeLaTabla() {
        return lista.get(tabla.getSelectedRow()).getId();
    }

    public void cambiarOperacion(OperacionFormulario o, Cliente c) {
        String titulo = "";
        switch(o) {
            case CONSULTAR: titulo = "Consultando Cliente #"+c.getId(); break;
            case EDITAR: titulo = "Editar Cliente #"+c.getId(); break;
            case AGREGAR: titulo = "Registrar Cliente"; break;
        }
        TitledBorder borde = BorderFactory.createTitledBorder(null, titulo, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14));
        panel.setBorder(borde);
        
        this.cliente = c;
        
        super.cambiarOperacion(o);
    }
    public void buscar() {
        if(buscarClientes())bajarLista();
        else JOptionPane.showMessageDialog(this, "No se han podido consultar los Clientes.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private List<Cliente> lista;
    
    public boolean buscarClientes() {
        CriterioBusqueda c = null;
        switch(cmbBusqueda.getSelectedIndex()) {
            case 1: c = CriterioBusqueda.NOMBRE; break;
            case 2: c = CriterioBusqueda.DIRECCION; break;
            case 3: c = CriterioBusqueda.RFC; break;
            case 4: c = CriterioBusqueda.TELEFONO; break;
        }
        
        List<Cliente> lista = null;
        
        if(c==null) {
            lista = getPersistencia().consultarTodos();
        } else {
            lista = getPersistencia().consultarPorCriterio(txtBusqueda.getText(), c);
        }
        
        if(lista == null) {
            return false;
        } else {
            this.lista = lista;
            return true;
        }
    }
    
    public void bajarLista() {
        DefaultTableModel modelo = (DefaultTableModel)this.tabla.getModel();
        modelo.setRowCount(0);
        
        for (Cliente cliente : lista) {
            Object[] a = new Object[8];
            a[0] = cliente.getId();
            a[1] = cliente.getNombre();
            a[2] = cliente.getDireccion();
            a[3] = cliente.getRfc();
            a[4] = cliente.getTelefono();
            a[5] = "Ver";
            a[6] = "Editar";
            a[7] = "Eliminar";
            modelo.addRow(a);
        }
        
        this.tabla.setModel(modelo);
    }
    
    @Override
    public String getNombreIcono() {
        return "users";
    }

    @Override
    public void bajarCampos() {
        txtNombre.setText(cliente.getNombre());
        txtDireccion.setText(cliente.getDireccion());
        txtRfc.setText(cliente.getRfc());
        String tel = cliente.getTelefono();
        txtTelefono.setText(tel==null?"":tel);
    }

    @Override
    public void subirCampos() {
        cliente.setNombre(txtNombre.getText());
        cliente.setDireccion(txtDireccion.getText());
        cliente.setRfc(txtRfc.getText());
        String tel = txtTelefono.getText();
        cliente.setTelefono(tel.equals("")?null:tel);
    }

    @Override
    public boolean validar() {
        String nom = txtNombre.getText(), errNom = "";
        String dir = txtDireccion.getText(), errDir = "";
        String rfc = txtRfc.getText(), errRfc = "";
        String tel = txtTelefono.getText(), errTel = "";
        boolean valido = true;
        
        if(nom.equals("")) {
            errNom += "Este campo es obligatorio. ";
            valido = false;
        }
        if(nom.length()>45) {
            errNom += "El límite de caracteres en este campo es 45. ";
            valido = false;
        }
        if(dir.equals("")) {
            errDir += "Este campo es obligatorio. ";
            valido = false;
        }
        if(dir.length()>100) {
            errDir += "El límite de caracteres en este campo es 100. ";
            valido = false;
        }
        if(rfc.equals("")) {
            errRfc += "Este campo es obligatorio. ";
            valido = false;
        }
        if(rfc.length()>15) {
            errRfc += "El límite de caracteres en este campo es 15. ";
            valido = false;
        }
        if(tel.length()>15) {
            errTel += "El límite de caracteres en este campo es 15. ";
            valido = false;
        }
        
        errorDireccion.setText(errDir);
        errorNombre.setText(errNom);
        errorTelefono.setText(errTel);
        errorRfc.setText(errRfc);
        
        return valido;
    }

    @Override
    public void agregar() {
        cliente = new Cliente();
        subirCampos();
        if(getPersistencia().agregar(cliente)) {
            JOptionPane.showMessageDialog(this, "Se ha agregado el Cliente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se ha podido agregar el Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        buscar();
    }

    @Override
    public void editar() {
        subirCampos();
        if(getPersistencia().actualizar(cliente)) {
            JOptionPane.showMessageDialog(this, "Se ha actualizado el Cliente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se ha podido actualizar el Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        buscar();
    }
}
