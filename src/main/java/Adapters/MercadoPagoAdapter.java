
package Adapters;
import Interfaz.Pago;
import Plataformas.MercadoPago;

public class MercadoPagoAdapter implements Pago {
    
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public void pagar(double monto) {
        mercadoPago.PagarConMP(monto);
    }
    
}
