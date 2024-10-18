package bloques;

public class ReducirVelocidadRaqueta extends VelocidadRaqueta {

    public ReducirVelocidadRaqueta(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"ReducirVelocidadRaqueta\", \"cantidad\": " + cantidad + "}";
    }
}
