package conexiones;

import java.net.Socket;

public abstract class ConexionCliente {
    protected Socket socket;
    
    public ConexionCliente(Socket socket) {
        this.socket = socket;
    }
    
    public abstract void enviarMensaje(String mensaje);
    public abstract String recibirMensaje();
}
