package bloques;

public abstract class Bolas {
    protected int cantidad;

    public Bolas(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract String serializar();
}

