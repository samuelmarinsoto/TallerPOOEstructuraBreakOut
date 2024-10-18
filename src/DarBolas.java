package bloques;

public class DarBolas extends Bolas {

    public DarBolas(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"DarBolas\", \"cantidad\": " + cantidad + "}";
    }
}
