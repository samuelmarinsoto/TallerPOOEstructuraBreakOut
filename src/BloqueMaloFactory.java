package bloques;

public class BloqueMaloFactory implements AbstractBloqueFactory {

    @Override
    public TamañoRaqueta crearTamañoRaqueta(int cantidad) {
        return new ReducirTamañoRaqueta(cantidad);
    }

    @Override
    public VelocidadBola crearVelocidadBola(int cantidad) {
        return new IncrementarVelocidadBola(cantidad);
    }

    @Override
    public VelocidadRaqueta crearVelocidadRaqueta(int cantidad) {
        return new ReducirVelocidadRaqueta(cantidad);
    }

    @Override
    public Bolas crearBolas(int cantidad) {
        return new QuitarBolas(cantidad);
    }

    @Override
    public Vidas crearVidas(int cantidad) {
        return new QuitarVidas(cantidad);
    }
}
