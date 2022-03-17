
package pantallas;

import dao.CriterioBusqueda;
import dao.interfaces.IPersistenciaEntidad;
import dao.interfaces.IPersistenciaVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import pantallas.util.JButtonCellEditor;
import pantallas.util.JButtonRenderer;
import pojo.Cliente;
import pojo.Producto;
import pojo.RelacionProductoVenta;
import pojo.Venta;

public class FmrRegistroVenta extends Formulario<Venta> {

    private List<RelacionProductoVenta> listaProductos;
    
    @Override
    public void limpiar() {
        cmbCliente.setSelectedIndex(0);
        DefaultTableModel modelo = (DefaultTableModel)tablaLista.getModel();
        modelo.setRowCount(0);
        tablaLista.setModel(modelo);
        listaProductos = new ArrayList();
        venta = new Venta();
        super.limpiar();
        txtDescuento.setText("0");
    }
    
    private Venta venta;
    
    private final IPersistenciaVenta persistenciaVenta;
    private final IPersistenciaEntidad<Producto> persistenciaProducto;
    private final IPersistenciaEntidad<Cliente> persistenciaCliente;
    
    public FmrRegistroVenta(IPersistenciaVenta persistenciaVenta, IPersistenciaEntidad<Producto> persistenciaProducto, IPersistenciaEntidad<Cliente> persistenciaCliente) {
        super(null);
        initComponents();
        setBtnAceptar(btnAceptar);
        setBtnRestaurar(btnRestaurar);
        cambiarOperacion(OperacionFormulario.AGREGAR);
        
        this.persistenciaVenta = persistenciaVenta;
        this.persistenciaProducto = persistenciaProducto;
        this.persistenciaCliente = persistenciaCliente;
        
        getCamposDeTexto().add(txtDescuento);
        getCamposDeTexto().add(txtSubtotal);
        getCamposDeTexto().add(txtTotal);
        
        getEtiquetasDeError().add(errorCliente);
        getEtiquetasDeError().add(errorDescuento);
        
        initTablas();
        buscar();
        restaurar();
        cargarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        errorCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        errorDescuento = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        cmbCliente = new javax.swing.JComboBox<>();
        txtDescuento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBusqueda = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");
        setIconImage(getIconImage());

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de la Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel2.setText("Cliente:");

        errorCliente.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorCliente.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Subtotal:");

        txtSubtotal.setEditable(false);

        errorDescuento.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorDescuento.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setText("Descuento (%):");
        jLabel4.setToolTipText("");

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

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        txtDescuento.setText("0");
        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Total:");
        jLabel5.setToolTipText("");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(btnRestaurar))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorCliente)
                            .addComponent(errorDescuento))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubtotal)
                            .addComponent(txtDescuento))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorCliente)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorDescuento)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnRestaurar))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel1.setText("Buscar por nombre:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock", "Añadir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaBusqueda);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
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
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        tablaLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio Unitario", "Cantidad", "Monto Total", "Retirar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaLista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        aceptar();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        restaurar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        volver();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        actualizar();
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
        actualizar();
    }//GEN-LAST:event_txtDescuentoKeyTyped
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JLabel errorCliente;
    private javax.swing.JLabel errorDescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaBusqueda;
    private javax.swing.JTable tablaLista;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    
    private void initTablas(){
        ActionListener onVerClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablaOpcionAñadir();
            }
        };        
        int indiceColumna = 4;
        TableColumnModel modeloColumnas = tablaBusqueda.getColumnModel();
        modeloColumnas.getColumn(indiceColumna)
                .setCellRenderer(new JButtonRenderer("Añadir"));
        modeloColumnas.getColumn(indiceColumna)
                .setCellEditor(new JButtonCellEditor(new JTextField(), onVerClickListener));        
        
        ActionListener onEditarClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablaOpcionRetirar();
            }
        };        
        indiceColumna = 5;
        modeloColumnas = tablaLista.getColumnModel();
        modeloColumnas.getColumn(indiceColumna)
                .setCellRenderer(new JButtonRenderer("Retirar"));
        modeloColumnas.getColumn(indiceColumna)
                .setCellEditor(new JButtonCellEditor(new JTextField(), onEditarClickListener));    
        
    }
    
    public void tablaOpcionAñadir() {
        Producto p = persistenciaProducto.consultar(idDeLaTablaBusqueda());
        
        if(p == null) {
            JOptionPane.showMessageDialog(this, "Error consultando el Producto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        boolean esta = false;
        RelacionProductoVenta rel = null;
        for (RelacionProductoVenta relPro : listaProductos) {
            if(relPro.getProducto().getId()==p.getId()) {
                esta = true;
                rel = relPro;
            }
        }
        
        if(esta) {
            Producto producto = rel.getProducto();
            if(producto.getStock()-rel.getCantidad()==0) {
                JOptionPane.showMessageDialog(this, "No hay suficiente de este producto en stock.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                rel.setCantidad(rel.getCantidad()+1);
            }
        } else {
            if(p.getStock()==0) {
                JOptionPane.showMessageDialog(this, "No hay suficiente de este producto en stock.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                listaProductos.add(new RelacionProductoVenta(1, p, venta));
            }
        }
        actualizar();
    }
    
    public void tablaOpcionRetirar() {
        RelacionProductoVenta r = listaProductos.get(tablaLista.getSelectedRow());
        r.setCantidad(r.getCantidad()-1);
        if(r.getCantidad()==0)
            listaProductos.remove(r);
        
        actualizar();
        
    }
    
    private int idDeLaTablaBusqueda() {
        return lista.get(tablaBusqueda.getSelectedRow()).getId();
    }

    
    public void buscar() {
        if(buscarProductos())bajarLista();
        else JOptionPane.showMessageDialog(this, "No se han podido consultar los Productos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private List<Producto> lista;
    
    public boolean buscarProductos() {
        List<Producto> lista = 
                persistenciaProducto.consultarPorCriterio(txtBusqueda.getText(), CriterioBusqueda.NOMBRE);
        
        if(lista == null) {
            return false;
        } else {
            this.lista = lista;
            return true;
        }
    }
    
    public void bajarLista() {
        DefaultTableModel modelo = (DefaultTableModel)tablaBusqueda.getModel();
        modelo.setRowCount(0);
        
        for (Producto producto : lista) {
            Object[] a = new Object[5];
            a[0] = producto.getId();
            a[1] = producto.getNombre();
            a[2] = producto.getPrecio();
            a[3] = producto.getStock();
            a[4] = "Añadir";
            modelo.addRow(a);
        }
        
        tablaBusqueda.setModel(modelo);
    }
    
    public void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel)tablaLista.getModel();
        modelo.setRowCount(0);
        
        for (RelacionProductoVenta rel : listaProductos) {
            Producto pro = rel.getProducto();
            rel.calcularImporte();
            Object[] a = new Object[6];
            a[0] = pro.getId();
            a[1] = pro.getNombre();
            a[2] = pro.getPrecio();
            a[3] = rel.getCantidad();
            a[4] = rel.getImporte();
            a[5] = "Retirar";
            modelo.addRow(a);
        }
        
        tablaLista.setModel(modelo);
    }
    
    private List<Cliente> listaClientes; 
    
    public void cargarClientes() {
        List<Cliente> lista = persistenciaCliente.consultarTodos();
        if(lista == null) {
            JOptionPane.showMessageDialog(this, "No se han podido consultar los Clientes.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        listaClientes = lista;
        List<String> nombres = new ArrayList();
        nombres.add("Seleccione...");
        for (Cliente c : lista) {
            nombres.add(c.getNombre());
        }
        cmbCliente.setModel(new DefaultComboBoxModel(nombres.toArray()));
    }
    
    @Override
    public String getNombreIcono() {
        return "shopping_cart";
    }

    @Override
    public void bajarCampos() {
        txtSubtotal.setText(String.format("$%.2f", venta.getSubTotal()));
        txtTotal.setText(String.format("$%.2f", venta.getMontoTotal()));
    }

    @Override
    public void subirCampos() {
        Cliente cliente = listaClientes.get(cmbCliente.getSelectedIndex()-1);
        float descuento = (Float.parseFloat(txtDescuento.getText()))/100;
        venta = new Venta(new GregorianCalendar(), descuento, cliente);
        venta.setDetallesProductos(listaProductos);
        venta.calcularMontoTotal();
    }

    public void actualizar() {
        actualizarTabla();
        if(validar()) {
            subirCampos();
            bajarCampos();
        }
    }
    
    @Override
    public boolean validar() {
        String errCli = "";
        String des = txtDescuento.getText(), errDes = "";
        boolean valido = true;
        
        try {
            float d = Float.parseFloat(des);
            if(d < 0 || d > 100) {
                errDes += "Introduzca un número del 0 al 100. ";
                valido = false;
            }
        } catch (Exception e) {
            errDes += "Introduzca un número decimal válido. ";
            valido = false;
        }
        
        if(cmbCliente.getSelectedIndex()==0) {
            errCli += "Seleccione un cliente.";
            valido = false;
        }
            
        errorCliente.setText(errCli);
        errorDescuento.setText(errDes);
        
        return valido;
    }

    @Override
    public void agregar() {
        actualizar();
        
        String mensaje = String.format("¿Está seguro de que desea registrar esta venta? (Total a pagar: $%.2f)", venta.getMontoTotal());
        int i = JOptionPane.showConfirmDialog(this, mensaje, "Confirmación", JOptionPane.YES_NO_OPTION);
        if(i == JOptionPane.NO_OPTION) return;
        
        if(persistenciaVenta.agregar(venta)) {
            JOptionPane.showMessageDialog(this, "Se ha registrado la venta con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            restaurar();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha podido agregar la venta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizar();
        buscar();
    }

    @Override
    public void editar() {}

    @Override
    public void aceptar() {
        if(listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione al menos un producto antes de continuar.", "Error", JOptionPane.ERROR_MESSAGE);
            validar();
            return;
        }
        super.aceptar();
    }

    @Override
    public void cambiarEditabilidad(boolean b) {
        super.cambiarEditabilidad(b);
        txtSubtotal.setEditable(false);
        txtTotal.setEditable(false);
    }
    
}
