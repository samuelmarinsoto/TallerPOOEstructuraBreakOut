package bloques;

public class DarVidas extends Vidas {

    public DarVidas(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"DarVidas\", \"cantidad\": " + cantidad + "}";
    }
}
