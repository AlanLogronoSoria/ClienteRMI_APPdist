package clases;

import java.io.IOException;
import java.rmi.Naming;

public class Cliente {
    public static String consultar (int id) throws Exception {
        String resultado = null;
        String rmiObjetName = "rmi://localhost/Datos";
        Servidor servicio = (Servidor)  Naming.lookup(rmiObjetName);
        resultado = servicio.consultar(id);
        return resultado;
    }
}
