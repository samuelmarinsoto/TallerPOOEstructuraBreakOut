package bloques;

public abstract class VelocidadBola {
    protected int cantidad;

    public VelocidadBola(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract String serializar();
}

