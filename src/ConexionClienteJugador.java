package conexiones;

import java.io.*;
import java.net.Socket;

public class ConexionClienteJugador extends ConexionCliente {

    public ConexionClienteJugador(Socket socket) {
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
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
