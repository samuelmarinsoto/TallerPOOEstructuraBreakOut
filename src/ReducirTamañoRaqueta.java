package bloques;

public class ReducirTamañoRaqueta extends TamañoRaqueta {

    public ReducirTamañoRaqueta(int cantidad) {
        super(cantidad);
    }

    @Override
    public String serializar() {
        return "{\"efecto\": \"ReducirTamañoRaqueta\", \"cantidad\": " + cantidad + "}";
    }
}
