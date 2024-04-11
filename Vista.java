import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vista {
    private JComboBox cboPrioridad;
    private JTextField textField1;
    private JTextArea zTextArea;
    private JTextArea txtSintomas;
    private JButton btnInsertar;
    private JList lstPacientes;
    private JLabel txtnombre;
    private JLabel txtsintomas;
    private Clinica clinica = new Clinica();
    public Vista(){


        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int prioridad=Integer.parseInt(cboPrioridad.getSelectedItem().toString());
                String nombre = txtnombre.getText();
                String sintomas= txtSintomas.getText();
                clinica.encolar(new Paciente(prioridad,nombre,sintomas));

                llenarJList();
            }
        });
    }

    public void llenarJList(){
        DefaultListModel dlm = new DefaultListModel();
        Stream<Paciente> ordenado=clinica.listarPacientes().stream().sorted();

        for (Paciente p: ordenado.collect(Collectors.toList())){
            dlm.addElement(p);
        }
        lstPacientes.setModel(dlm);
    }

    //Arreglar el main

}
