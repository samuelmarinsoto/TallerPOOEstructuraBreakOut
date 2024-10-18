package bloques;

public abstract class Vidas {
    protected int cantidad;

    public Vidas(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract String serializar();
}

