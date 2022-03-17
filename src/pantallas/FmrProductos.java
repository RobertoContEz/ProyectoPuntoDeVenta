
package pantallas;

import dao.CriterioBusqueda;
import dao.interfaces.IPersistenciaEntidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import pantallas.util.JButtonCellEditor;
import pantallas.util.JButtonRenderer;
import pojo.Producto;

public class FmrProductos extends Formulario<Producto> {

    private Producto producto;
    
    public FmrProductos(IPersistenciaEntidad<Producto> persistencia) {
        super(persistencia);
        inicializar();
        cambiarOperacion(OperacionFormulario.AGREGAR, new Producto());
    }
    
    public FmrProductos(IPersistenciaEntidad<Producto> persistencia, Producto producto) {
        super(persistencia);
        inicializar();
        cambiarOperacion(OperacionFormulario.CONSULTAR, producto);
    }
    
    private void inicializar() {
        initComponents();
        setBtnAceptar(btnAceptar);
        setBtnRestaurar(btnRestaurar);
        
        getCamposDeTexto().add(txtNombre);
        getCamposDeTexto().add(txtPrecio);
        getCamposDeTexto().add(txtStock);
        
        getEtiquetasDeError().add(errorNombre);
        getEtiquetasDeError().add(errorPrecio);
        getEtiquetasDeError().add(errorStock);
        
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
        errorPrecio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        errorStock = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        txtStock = new javax.swing.JTextField();
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
        setTitle("Productos");
        setIconImage(getIconImage());

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel2.setText("Nombre:");

        errorNombre.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorNombre.setForeground(new java.awt.Color(255, 0, 0));

        errorPrecio.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorPrecio.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Precio:");

        errorStock.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorStock.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setText("Stock actual:");
        jLabel4.setToolTipText("");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnRestaurar.setText("Cancelar");
        btnRestaurar.setActionCommand("Restaurar");
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
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorNombre)
                            .addComponent(errorPrecio)
                            .addComponent(errorStock)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorPrecio)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorStock)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnRestaurar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel1.setText("Buscar por:");

        cmbBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nombre", "Precio Máximo", "Precio Minimo", "Stock Máximo", "Stock Minimo" }));

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
                "ID", "Nombre", "Precio", "Stock", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Regstrar Producto Nuevo");
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
        cambiarOperacion(OperacionFormulario.AGREGAR, new Producto());
        restaurar();
    }//GEN-LAST:event_btnRegistrarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbBusqueda;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JLabel errorPrecio;
    private javax.swing.JLabel errorStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    private void initTabla(){
        ActionListener onVerClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablaOpcionVer();
            }
        };        
        int indiceColumna = 4;
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
        indiceColumna = 5;
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
        indiceColumna = 6;
        modeloColumnas = this.tabla.getColumnModel();
        modeloColumnas.getColumn(indiceColumna)
                .setCellRenderer(new JButtonRenderer("Eliminar"));
        modeloColumnas.getColumn(indiceColumna)
                .setCellEditor(new JButtonCellEditor(new JTextField(), onEliminarClickListener));    
    }
    
    public void tablaOpcionVer() {
        Producto p = getPersistencia().consultar(idDeLaTabla());
        
        if(p == null) {
            JOptionPane.showMessageDialog(this, "Error consultando el Producto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        cambiarOperacion(OperacionFormulario.CONSULTAR, p);
    }
    
    public void tablaOpcionEditar() {
        Producto p = getPersistencia().consultar(idDeLaTabla());
        
        if(p == null) {
            JOptionPane.showMessageDialog(this, "Error consultando el Producto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        cambiarOperacion(OperacionFormulario.EDITAR, p);
    }
    
    public void tablaOpcionEliminar() {
        int id = idDeLaTabla();
        int i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que desea eliminar este Producto? (ID: "+id+")", "Confirmación", JOptionPane.YES_NO_OPTION);
        
        if(i == JOptionPane.YES_OPTION) {
            if(getPersistencia().eliminar(id)) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado al Producto.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el Producto.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private int idDeLaTabla() {
        return lista.get(tabla.getSelectedRow()).getId();
    }

    public void cambiarOperacion(OperacionFormulario o, Producto p) {
        String titulo = "";
        switch(o) {
            case CONSULTAR: titulo = "Consultando Producto #"+p.getId(); break;
            case EDITAR: titulo = "Editar Producto #"+p.getId(); break;
            case AGREGAR: titulo = "Registrar Producto"; break;
        }
        TitledBorder borde = BorderFactory.createTitledBorder(null, titulo, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14));
        panel.setBorder(borde);
        
        this.producto = p;
        
        super.cambiarOperacion(o);
    }
    
    public void buscar() {
        if(buscarProductos())bajarLista();
        else JOptionPane.showMessageDialog(this, "No se han podido consultar los Productos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private List<Producto> lista;
    
    public boolean buscarProductos() {
        CriterioBusqueda c = null;
        switch(cmbBusqueda.getSelectedIndex()) {
            case 1: c = CriterioBusqueda.NOMBRE; break;
            case 2: c = CriterioBusqueda.PRECIO_MAXIMO; break;
            case 3: c = CriterioBusqueda.PRECIO_MINIMO; break;
            case 4: c = CriterioBusqueda.STOCK_MAXIMO; break;
            case 5: c = CriterioBusqueda.STOCK_MINIMO; break;
        }
        
        List<Producto> lista = null;
        
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
        
        for (Producto producto : lista) {
            Object[] a = new Object[7];
            a[0] = producto.getId();
            a[1] = producto.getNombre();
            a[2] = producto.getPrecio();
            a[3] = producto.getStock();
            a[4] = "Ver";
            a[5] = "Editar";
            a[6] = "Eliminar";
            modelo.addRow(a);
        }
        
        this.tabla.setModel(modelo);
    }
    
    @Override
    public String getNombreIcono() {
        return "note";
    }

    @Override
    public void bajarCampos() {
        txtNombre.setText(producto.getNombre());
        txtPrecio.setText(Float.toString(producto.getPrecio()));
        txtStock.setText(Integer.toString(producto.getStock()));
    }

    @Override
    public void subirCampos() {
        producto.setNombre(txtNombre.getText());
        producto.setPrecio(Float.parseFloat(txtPrecio.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));
    }

    @Override
    public boolean validar() {
        String nom = txtNombre.getText(), errNom = "";
        String pre = txtPrecio.getText(), errPre = "";
        String stk = txtStock.getText(), errStk = "";
        boolean valido = true;
        
        if(nom.equals("")) {
            errNom += "Este campo es obligatorio. ";
            valido = false;
        }
        if(nom.length()>100) {
            errNom += "El límite de caracteres en este campo es 100. ";
            valido = false;
        }
        if(pre.equals("")) {
            errPre += "Este campo es obligatorio. ";
            valido = false;
        }
        try {
            Float.parseFloat(pre);
        } catch (Exception e) {
            errPre += "Introduzca un número decimal válido.";
            valido = false;
        }
        if(stk.equals("")) {
            errStk += "Este campo es obligatorio. ";
            valido = false;
        }
        try {
            Integer.parseInt(stk);
        } catch (Exception e) {
            errStk += "Introduzca un número entero válido.";
            valido = false;
        }
        
        errorNombre.setText(errNom);
        errorPrecio.setText(errPre);
        errorStock.setText(errStk);
        
        return valido;
    }

    @Override
    public void agregar() {
        producto = new Producto();
        subirCampos();
        if(getPersistencia().agregar(producto)) {
            JOptionPane.showMessageDialog(this, "Se ha agregado el Producto.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se ha podido agregar el Producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiar();
        buscar();
    }

    @Override
    public void editar() {
        subirCampos();
        if(getPersistencia().actualizar(producto)) {
            JOptionPane.showMessageDialog(this, "Se ha actualizado el Producto.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se ha podido actualizar el Producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        buscar();
    }
}
