package posnet;

/**
 *
 * @author 1dam
 */
public class TarjetaDeCredito {

    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }
    
    /** 
     *  Simplemente compara el parametro dado con el sado actual del usuario
     *  @param monto el parametro monto double es el dinero que vas a pedir para usarlo en las distintas funciones
     *  @return  una booleana y lo compara el monto con el saldo devolviendo true si hay tanto saldo como monto
     *  y false si no lo tiene
     */

    public boolean tieneSaldoDisponible(double monto) {
        return saldo >= monto;
    }
    
    /**
     * Resta el saldo del usuario por el parametro dado
     * @param monto el parametro double monto es el dinero que vas a pedir para usarlo en las distintas funciones
     */

    public void descontar(double monto) {
        saldo = saldo - monto;
        // saldo -= monto;
    }
    
    /**
     * Metodo usado para comprobar quien es el titular de la tarjeta
     * Metodo que accede al metodo nombreCompleto() de la clase persona para devolver el nombre del titular de la tarjeta
     * @return evolver el nombre del titular de la tarjeta en un String
     */

    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }
    
     /**
     * Metodo para generar una cadena de frases donde muestra los datos de la tarjeta
     * @return cadena String con la entidad bancaria, el numero de la tarjeta, el sado, entidad financiera y el titular
     */

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

}
