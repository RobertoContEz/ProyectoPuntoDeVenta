
package pantallas;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import dao.interfaces.IPersistenciaEntidad;

public abstract class Formulario<E> extends javax.swing.JFrame {
    private OperacionFormulario operacion;

    private final List<JTextField> camposDeTexto = new ArrayList();
    private final List<JLabel> etiquetasDeError = new ArrayList();
    
    private final IPersistenciaEntidad<E> persistencia;
    
    private JButton btnAceptar;
    private JButton btnRestaurar;

    public Formulario(IPersistenciaEntidad<E> persistencia) {
        this.persistencia = persistencia;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public void setBtnRestaurar(JButton btnRestaurar) {
        this.btnRestaurar = btnRestaurar;
    }
    
    public void volver() {
        new FmrPrincipal().setVisible(true);
        dispose();
    }
    
    public void cambiarOperacion(OperacionFormulario o) {
        this.operacion = o;
        switch(o) {
            case AGREGAR:
                btnAceptar.setText("Aceptar");
                btnRestaurar.setVisible(true);
                limpiar();
                cambiarEditabilidad(true);
                break;
            case EDITAR:
                btnAceptar.setText("Actualizar");
                btnRestaurar.setVisible(true);
                bajarCampos();
                cambiarEditabilidad(true);
                break;
            case CONSULTAR:
                btnAceptar.setText("Editar");
                btnRestaurar.setVisible(false);
                bajarCampos();
                cambiarEditabilidad(false);
                break;
        }
    }
    
    public void aceptar() {
        switch(operacion) {
            case AGREGAR:
                if(validar())agregar();
                break;
            case EDITAR:
                if(validar())editar();
                break;
            case CONSULTAR:
                cambiarOperacion(OperacionFormulario.EDITAR);
                break;
        }
    }
    
    public void restaurar() {
        if(operacion == OperacionFormulario.AGREGAR) {
            limpiar();
        } else if(operacion == OperacionFormulario.EDITAR) {
            bajarCampos();
        }
    }
    
    public void limpiar() {
        camposDeTexto.forEach((campo) -> {
            campo.setText("");
        });
        
        etiquetasDeError.forEach((etiqueta) -> {
            etiqueta.setText("");
        });
    }
    
    public void cambiarEditabilidad(boolean b) {
        camposDeTexto.forEach((campo) -> {
            campo.setEditable(b);
        });
    }
    
    public abstract void bajarCampos();
    
    public abstract void subirCampos();
    
    public abstract boolean validar();
    
    public abstract void agregar();
    
    public abstract void editar();
    
    @Override
    public Image getIconImage() {
       Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("iconos/64x64/"+getNombreIcono()+".png"));

       return retValue;
    }
    
    public abstract String getNombreIcono();
    
    public OperacionFormulario getOperacion() {
        return operacion;
    }

    public List<JTextField> getCamposDeTexto() {
        return camposDeTexto;
    }

    public List<JLabel> getEtiquetasDeError() {
        return etiquetasDeError;
    }

    public IPersistenciaEntidad<E> getPersistencia() {
        return persistencia;
    }
    
}
