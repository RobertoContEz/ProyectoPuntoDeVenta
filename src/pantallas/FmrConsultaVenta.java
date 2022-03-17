
package pantallas;

import dao.Conversiones;
import dao.interfaces.IPersistenciaEntidad;
import dao.interfaces.IPersistenciaVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import pantallas.util.JButtonCellEditor;
import pantallas.util.JButtonRenderer;
import pojo.Cliente;
import pojo.Producto;
import pojo.RelacionProductoVenta;
import pojo.Venta;

public class FmrConsultaVenta extends Formulario {

    private final IPersistenciaVenta persistenciaVenta;
    private final IPersistenciaEntidad<Cliente> persistenciaCliente;
    private final IPersistenciaEntidad<Producto> persistenciaProducto;
    
    private Venta venta;
    
    public FmrConsultaVenta(IPersistenciaVenta persistenciaVenta, IPersistenciaEntidad<Cliente> persistenciaCliente, IPersistenciaEntidad<Producto> persistenciaProducto) {
        super(null);
        initComponents();
        
        this.persistenciaVenta = persistenciaVenta;
        this.persistenciaCliente = persistenciaCliente;
        this.persistenciaProducto = persistenciaProducto;
        
        getCamposDeTexto().add(txtCliente);
        getCamposDeTexto().add(txtDescuento);
        getCamposDeTexto().add(txtSubtotal);
        getCamposDeTexto().add(txtTotal);
        
        dtpFecha.setDateToToday();
        cargarClientes();
        initTablas();
        buscar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ckbCliente = new javax.swing.JCheckBox();
        cmbCliente = new javax.swing.JComboBox<>();
        ckbFecha = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        dtpFecha = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnCliente = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Ventas");
        setIconImage(getIconImage());

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel1.setText("Cliente:");

        ckbCliente.setSelected(true);
        ckbCliente.setText("Filtrar por Cliente");
        ckbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbClienteActionPerformed(evt);
            }
        });

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        ckbFecha.setSelected(true);
        ckbFecha.setText("Filtrar por Fecha");

        jLabel9.setText("Fecha:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Fecha", "Subtotal", "Descuento", "Total", "Consultar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(363, 363, 363))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbCliente)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(28, 28, 28)
                                .addComponent(dtpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ckbFecha))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ckbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(ckbFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dtpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de la Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        tablaLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio c/u", "Cantidad", "Importe", "Consultar"
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jLabel5.setText("Cliente:");

        txtCliente.setEditable(false);

        jLabel6.setText("Subtotal:");

        txtSubtotal.setEditable(false);

        jLabel7.setText("Descuento:");

        txtDescuento.setEditable(false);

        jLabel8.setText("Total:");
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setToolTipText("");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnCliente.setText("Consultar Cliente");
        btnCliente.setEnabled(false);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtCliente)
                            .addComponent(txtTotal))
                        .addGap(18, 18, 18)
                        .addComponent(btnCliente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        consultarCliente();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        volver();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void ckbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbClienteActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox ckbCliente;
    private javax.swing.JCheckBox ckbFecha;
    private javax.swing.JComboBox<String> cmbCliente;
    private com.github.lgooddatepicker.components.DatePicker dtpFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaLista;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    
    private void initTablas(){
        ActionListener onVerClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablaOpcionConsultarVenta();
            }
        };        
        int indiceColumna = 6;
        TableColumnModel modeloColumnas = tabla.getColumnModel();
        modeloColumnas.getColumn(indiceColumna)
                .setCellRenderer(new JButtonRenderer("Consultar"));
        modeloColumnas.getColumn(indiceColumna)
                .setCellEditor(new JButtonCellEditor(new JTextField(), onVerClickListener));   
        
        
        onVerClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablaOpcionConsultarProducto();
            }
        };        
        indiceColumna = 5;
        modeloColumnas = tablaLista.getColumnModel();
        modeloColumnas.getColumn(indiceColumna)
                .setCellRenderer(new JButtonRenderer("Consultar"));
        modeloColumnas.getColumn(indiceColumna)
                .setCellEditor(new JButtonCellEditor(new JTextField(), onVerClickListener));
    }
    
    public void tablaOpcionConsultarVenta() {
        Venta v = persistenciaVenta.consultar(idDeLaTablaVentas());
        
        if(v == null) {
            JOptionPane.showMessageDialog(this, "Error consultando la Venta.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        venta = v;
        bajarCampos();
    }
    
    public void tablaOpcionConsultarProducto() {
        String mensaje = "¿Quiere abrir el formulario de Productos para "
                       + "\n consultar la información de este producto?";
        int i = JOptionPane.showConfirmDialog(this, mensaje, "Confirmación", JOptionPane.YES_NO_OPTION);
        if(i == JOptionPane.NO_OPTION) return;
        
        Producto producto = null;
        for (RelacionProductoVenta detallesProducto : venta.getDetallesProductos()) {
            Producto p = detallesProducto.getProducto();
            if (p.getId() == idDeLaTablaLista()) producto = p;
        }
        
        new FmrProductos(persistenciaProducto, producto).setVisible(true);
        dispose();
    }
    
    public void consultarCliente() {
        String mensaje = "¿Quiere abrir el formulario de Clientes para "
                       + "\n consultar la información de este cliente?";
        int i = JOptionPane.showConfirmDialog(this, mensaje, "Confirmación", JOptionPane.YES_NO_OPTION);
        if(i == JOptionPane.NO_OPTION) return;
        
        new FmrClientes(persistenciaCliente, venta.getCliente()).setVisible(true);
        dispose();
    } 
    
    private int idDeLaTablaVentas() {
        return lista.get(tabla.getSelectedRow()).getId();
    }
    
    private int idDeLaTablaLista() {
        return venta.getDetallesProductos().get(tablaLista.getSelectedRow()).getProducto().getId();
    }
    
    private List<Venta> lista;
    
    public void buscar() {
        if(buscarVentas())bajarListaVentas();
        else JOptionPane.showMessageDialog(this, "No se han podido consultar las Ventas.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public boolean buscarVentas() {
        Cliente cliente = null;
        Calendar fechaMin = null, fechaMax = null;
        int i = cmbCliente.getSelectedIndex()-1;
        if(ckbCliente.isSelected()&&i!=-1) {
            cliente = listaClientes.get(i);
            cliente = persistenciaCliente.consultar(cliente.getId());
        }
        if(ckbFecha.isSelected()) {
            fechaMin = Conversiones.localDateTimeACalendar(dtpFecha.getDate().atTime(0, 0));
            fechaMax = Conversiones.localDateTimeACalendar(dtpFecha.getDate().atTime(23, 59));
        }
        
        List<Venta> lista =
                persistenciaVenta.consultarPorClienteYFecha(cliente, fechaMin, fechaMax);
        
        if(lista == null) {
            return false;
        } else {
            this.lista = lista;
            return true;
        }
    }
    
    public void bajarListaVentas() {
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        
        for (Venta venta : lista) {
            Object[] a = new Object[7];
            a[0] = venta.getId();
            a[1] = venta.getCliente().getNombre();
            a[2] = Conversiones.fechaCalendarASql(venta.getFecha());
            a[3] = String.format("$%.2f", venta.getSubTotal());
            a[4] = (venta.getDescuento()*100)+"%";
            a[5] = String.format("$%.2f", venta.getMontoTotal());
            a[6] = "Consultar";
            modelo.addRow(a);
        }
        
        tabla.setModel(modelo);
    }
    
    public void bajarListaProductos() {
        DefaultTableModel modelo = (DefaultTableModel)tablaLista.getModel();
        modelo.setRowCount(0);
        
        for (RelacionProductoVenta detallesProducto : venta.getDetallesProductos()) {
            Producto producto = detallesProducto.getProducto();
            Object[] a = new Object[6];
            a[0] = detallesProducto.getProducto().getId();
            a[1] = producto.getNombre();
            a[2] = String.format("$%.2f", detallesProducto.getPrecio());
            a[3] = detallesProducto.getCantidad();
            a[4] = String.format("$%.2f", detallesProducto.getImporte());
            a[5] = "Consultar";
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
        return "chart";
    }

    @Override
    public void bajarCampos() {
        String titulo = "Detalles de la Venta #"+venta.getId();
        TitledBorder borde = BorderFactory.createTitledBorder(null, titulo, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14));
        panel.setBorder(borde);
        
        txtCliente.setText(venta.getCliente().getNombre());
        txtSubtotal.setText(String.format("$%.2f", venta.getSubTotal()));
        txtDescuento.setText((venta.getDescuento()*100)+"%");
        txtTotal.setText(String.format("$%.2f", venta.getMontoTotal()));
        
        bajarListaProductos();
        
        btnCliente.setEnabled(true);
    }

    @Override
    public void subirCampos() {}

    @Override
    public boolean validar() {
        return false;
    }

    @Override
    public void agregar() {}

    @Override
    public void editar() {}
}
