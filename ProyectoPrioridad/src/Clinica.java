import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Clinica {
    private PriorityQueue<Paciente> listaPacientes;

    public Clinica(){
        listaPacientes=new PriorityQueue<Paciente>();
    }

    public Paciente ateder() throws Exception{
        if (listaPacientes.isEmpty())
            throw new Exception("No existesn pacienets");
        return listaPacientes.remove();
    }

    public void encolar(Paciente p){
        listaPacientes.add(p);
    }

    public List<Paciente> listarPacientes(){
        return listaPacientes.stream().collect(Collectors.toList());
    }


}
