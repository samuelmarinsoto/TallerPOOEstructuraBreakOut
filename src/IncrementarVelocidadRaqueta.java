package bloques;

public class IncrementarVelocidadRaqueta extends VelocidadRaqueta {

    public IncrementarVelocidadRaqueta(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"IncrementarVelocidadRaqueta\", \"cantidad\": " + cantidad + "}";
    }
}
