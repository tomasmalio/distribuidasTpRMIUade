package ejemplo_1.server;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import ejemplo_1.interfaz.TDAManejoDatos;
import ejemplo_1.rmi.*;

public class Server {
    
	TDAManejoDatos objetoRemoto;
	
	public static void main(String[] args)
	{
		new Server();
	}
	
	public Server() {
		iniciar();
	}
	
    public void iniciar() {
    	try {
    		LocateRegistry.createRegistry(1099);	
            TDAManejoDatos gestionAlumnos = new GestionAlumnos();
            Naming.rebind ("//localhost/GestionAlumnos", gestionAlumnos);
            System.out.println("Fijado en //localhost/GestionAlumnos");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
