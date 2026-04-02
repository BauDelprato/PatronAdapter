

package com.mycompany.patronadapter;
import Interfaz.Pago;
import Plataformas.*;
import Adapters.*;


public class PatronAdapter {

    public static void main(String[] args) {
        
        // Servicios externos
        MercadoPago mp = new MercadoPago();
        Paypal pp = new Paypal();

        // Adaptadores
        Pago pago1 = new MercadoPagoAdapter(mp);
        Pago pago2 = new PayPalAdapter(pp);

        // Se carga el monto
        pago1.pagar(1500);
        pago2.pagar(2300);
        
    }
}
