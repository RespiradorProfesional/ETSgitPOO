package posnet;

/**
 *
 * @author 1dam
 */
public class Posnet {

    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;
    
    /**
     * Es un creador de ticket donde comprueba que todos los parametros sean correctos y finalmente poder crear el ticket
     * Es un creador de ticket donde comprueba que todos los parametros sean correctos y finalmente poder crear el ticket
     * donde comprueba los datos sean validos usando otros metodos privados como datosValidos(), donde si devuelve true
     * se crea el monto final y pasa otro control de seguridad de un metodo de la clase tarjeta donde comprueba su saldo
     * con el monto final, al realizar esto crea todo lo necesario para el ticket y descuenta el monto al saldo a traves de
     * descontar otro metodod de tarjeta
     * @param tarjeta pide por parametro el objeto tarjeta
     * @param montoAAbonar poner el monto a abonar o cantidad en double
     * @param cantCuotas pide una cantidad de cuotas permisible entre MIN_CANT_CUOTAS y MAX_CANT_CUOTAS 
     * @return devuelve un objeto en este caso el Ticket con los parametros necesarios
     */

    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas) {
        Ticket elTicket = null;

        if (datosValidos(tarjeta, montoAAbonar, cantCuotas)) {
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantCuotas);
            if (tarjeta.tieneSaldoDisponible(montoFinal)) {
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nombreCompletoDeTitular();
                double montoPorCuota = montoFinal / cantCuotas;
                elTicket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }

        return elTicket;
    }
    
    /**
     * Comprueba que la tarjeta sea valida
     * Comprueba que la tarjeta sea valida pasando por diferentes parametros verificando
     * que el parametro tarjeta no es null, el monto es mayor a 0 y la cantidad de cuotas
     * esta entre las permitidas 
     * @param tarjeta pide por parametro el objeto tarjeta
     * @param monto poner el monto a abonar o cantidad en double
     * @param cant pide una cantidad de cuotas permisible entre MIN_CANT_CUOTAS y MAX_CANT_CUOTAS 
     * @return devuelve true si se cumplen todos los parametros y false si no se cumple alguno
     */

    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant) {
        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;

        return esTarjetaValida && esMontoValido && cantCuotasValidas;
    }

    /**
     * Realiza la operacion necesaria para recargar segun las cuotas
     * @param cantCuotas pide una cantidad de cuotas permisible entre MIN_CANT_CUOTAS y MAX_CANT_CUOTAS 
     * @return devuelve el recargo segun las cuotas en un double
     */
    private double recargoSegunCuotas(int cantCuotas) {
        return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }

}
