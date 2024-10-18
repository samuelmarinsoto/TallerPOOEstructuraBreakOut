package bloques;

public class BloqueBuenoFactory implements AbstractBloqueFactory {

    @Override
    public TamañoRaqueta crearTamañoRaqueta(int cantidad) {
        return new IncrementarTamañoRaqueta(cantidad);
    }

    @Override
    public VelocidadBola crearVelocidadBola(int cantidad) {
        return new ReducirVelocidadBola(cantidad);
    }

    @Override
    public VelocidadRaqueta crearVelocidadRaqueta(int cantidad) {
        return new IncrementarVelocidadRaqueta(cantidad);
    }

    @Override
    public Bolas crearBolas(int cantidad) {
        return new DarBolas(cantidad);
    }

    @Override
    public Vidas crearVidas(int cantidad) {
        return new DarVidas(cantidad);
    }
}
