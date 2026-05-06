package clases;

import java.rmi.Naming;

public class Cliente {

    public static String consultar (int id) throws Exception {
        String resultado=null;
        String rmiObjectName = "rmi://localhost/Datos";
        Servidor servicio = (Servidor) Naming.lookup(rmiObjectName);
        servicio.consultar(id);
        return resultado;
    }

    public static void main(String[] args) {
        try {
            consultar(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}