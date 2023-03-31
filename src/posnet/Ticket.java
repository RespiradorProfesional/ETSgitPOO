package posnet;

/**
 *
 * @author 1dam
 */
public class Ticket {

    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;

    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }
    
    /**
     * Metodo para generar cadena con Nombre y Apellido, el monto total y el monto por cuota
     * @return cadena con el nombre y apellidos , el monto total y el monto por cuota
     */
    
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoTotal=" + montoTotal + ", montoPorCuota=" + montoPorCuota + '}';
    }

}
