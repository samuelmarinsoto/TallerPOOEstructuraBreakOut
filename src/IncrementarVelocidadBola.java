package bloques;

public class IncrementarVelocidadBola extends VelocidadBola {

    public IncrementarVelocidadBola(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"IncrementarVelocidadBola\", \"cantidad\": " + cantidad + "}";
    }
}
