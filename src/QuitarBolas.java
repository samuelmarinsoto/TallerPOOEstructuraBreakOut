package bloques;

public class QuitarBolas extends Bolas {

    public QuitarBolas(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"QuitarBolas\", \"cantidad\": " + cantidad + "}";
    }
}
