## Patron Adapter
Este proyecto implementa el patrón de diseño Adapter con el objetivo de unificar distintas interfaces de servicios de pago (MercadoPago y PayPal)
bajo una interfaz común (Pago).
# Estructura
```
src/
├── Adapters/
│   ├── MercadoPagoAdapter.java
│   └── PayPalAdapter.java
│
├── Interfaz/
│   └── Pago.java
│
├── Plataformas/
│   ├── MercadoPago.java
│   └── Paypal.java
│
└── mycompany/
    └── PatronAdapter.java
```
