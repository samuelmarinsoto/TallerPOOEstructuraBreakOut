package conexiones;

import java.net.Socket;

public class ConexionClienteFactory {

    public static ConexionCliente crearConexion(String tipoCliente, Socket socket) {
        if (tipoCliente.equalsIgnoreCase("jugador")) {
            return new ConexionClienteJugador(socket);
        } else if (tipoCliente.equalsIgnoreCase("espectador")) {
            return new ConexionClienteEspectador(socket);
        }
        throw new IllegalArgumentException("Tipo de cliente no válido");
    }
}
