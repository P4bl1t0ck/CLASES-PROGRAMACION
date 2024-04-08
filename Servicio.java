public class Servicio {//Creaos unos atributos
    private int codigoPedido;
    private String desrcrpcion;
    private Boolean estado;

    //Crearemos los contructires y los fetres y setres


    public Servicio(int codigoPedido,String desrcrpcion) {
        this.codigoPedido = codigoPedido;
        this.desrcrpcion=desrcrpcion;
        this.estado = false;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getDesrcrpcion() {
        return desrcrpcion;
    }

    public void setDesrcrpcion(String desrcrpcion) {
        this.desrcrpcion = desrcrpcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String resultado=
                "\ncodigoPedido=" + codigoPedido +
                "\ndesrcrpcion='" + desrcrpcion;
        return estado? resultado+ "Orden Finalizada" : resultado+" Procesado orden ";
    }
}
