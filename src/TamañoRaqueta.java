package bloques;

public abstract class TamañoRaqueta {
    protected int cantidad;

    public TamañoRaqueta(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract String serializar();
}

