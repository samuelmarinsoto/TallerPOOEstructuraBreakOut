package bloques;

public class IncrementarTamañoRaqueta extends TamañoRaqueta {

    public IncrementarTamañoRaqueta(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"IncrementarTamañoRaqueta\", \"cantidad\": " + cantidad + "}";
    }
}
