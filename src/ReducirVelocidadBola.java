package bloques;

public class ReducirVelocidadBola extends VelocidadBola {

    public ReducirVelocidadBola(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"ReducirVelocidadBola\", \"cantidad\": " + cantidad + "}";
    }
}
