package actualizacion;

import conexiones.ConexionCliente;

import java.util.ArrayList;
import java.util.List;

public class UpdateObserver {
    private List<ConexionCliente> clientes;

    public UpdateObserver() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(ConexionCliente cliente) {
        this.clientes.add(cliente);
    }

    public void eliminarCliente(ConexionCliente cliente) {
        this.clientes.remove(cliente);
    }

    public void notificarClientes(String mensaje) {
        for (ConexionCliente cliente : clientes) {
            cliente.enviarMensaje(mensaje);
        }
    }
}
