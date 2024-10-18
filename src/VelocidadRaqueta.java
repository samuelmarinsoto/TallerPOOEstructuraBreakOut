package bloques;

public abstract class VelocidadRaqueta {
    protected int cantidad;

    public VelocidadRaqueta(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract String serializar();
}

