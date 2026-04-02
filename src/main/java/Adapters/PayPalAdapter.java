
package Adapters;
import Interfaz.Pago;
import Plataformas.Paypal;

public class PayPalAdapter implements Pago {
    
    private Paypal payPal;

    public PayPalAdapter(Paypal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pagar(double monto) {
        payPal.PagarConPayPal(monto);
    }
}
