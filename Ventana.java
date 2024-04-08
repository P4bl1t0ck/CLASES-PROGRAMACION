import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel panelPrincipal;
    private JTabbedPane tabbedPane;
    private JSpinner spinner;
    private JTextArea txtOrden;
    private JButton btnIngresar;
    private JButton btnActualizar;
    private ColaAutoServicio listaAutos= ColaAutoServicio();

    public Ventana() {
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer codigo=Integer.parseInt(spCodigo.getValue().toString());
                String descripcion=txtOrden.getText()
            }
        });
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    //Seguir mas tarde en casa el priograma junto con el error visto por el profe de programacion 3
}
