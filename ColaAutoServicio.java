import java.util.LinkedList;
import java.util.Queue;

public class ColaAutoServicio {
    //i ES UNA INTERFAZ Y C ES CODIGO
    private Queue<Servicio> lista; //COllecion de elementos
    public ColaAutoServicio(){
        lista = new LinkedList<Servicio>();///Solo guardara objetos tipo servicio
    }
    public void encolar(Servicio orden){
        lista.add(orden);
    }

    public void actualizarOrden()throws Exception{
        if (!lista.isEmpty())//si no esta vacio el elemetnto retornar el valor
            lista.peek().setEstado(true);
        throw new Exception("Nose pudeo actualizar!");
    }
    public Servicio atender() throws Exception{
        if (lista.isEmpty())
            throw new Exception("Fila sin elementos ");
        return lista.poll();
    }

    public String listaFila(){//
        String texto="";
        for(Object aux: lista){
            texto+=aux.toString();
        }
        return texto;
    }
}
