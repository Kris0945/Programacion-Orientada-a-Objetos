public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(
                "Juanito",
                "Alvarado",
                12345678,
                'M',
                "San José"
        );

        Cliente cliente2 = new Cliente(
                "Ana",
                "Mora",
                23456789,
                "San José"
        );

        Suscripcion premium = new Suscripcion(
                "Premium",
                15000.0,
                30
        );

        // Invocación normal
        cliente1.suscribirse(premium);

    }
}