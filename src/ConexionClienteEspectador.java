package conexiones;

import java.io.*;
import java.net.Socket;

public class ConexionClienteEspectador extends ConexionCliente {

    public ConexionClienteEspectador(Socket socket) {
        super(socket);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write(mensaje);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String recibirMensaje() {
        // Espectadores no reciben mensajes
        return null;
    }
}
