package bloques;

public interface AbstractBloqueFactory {
    TamañoRaqueta crearTamañoRaqueta(int cantidad);
    VelocidadBola crearVelocidadBola(int cantidad);
    VelocidadRaqueta crearVelocidadRaqueta(int cantidad);
    Bolas crearBolas(int cantidad);
    Vidas crearVidas(int cantidad);
}
