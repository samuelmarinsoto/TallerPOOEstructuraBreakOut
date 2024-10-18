package bloques;

public class QuitarVidas extends Vidas {

    public QuitarVidas(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"QuitarVidas\", \"cantidad\": " + cantidad + "}";
    }
}
