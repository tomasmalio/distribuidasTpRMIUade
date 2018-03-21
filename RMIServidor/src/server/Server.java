package server;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import interfaz.TDASistemaInmobiliaria;

public class Server {
    
	TDASistemaInmobiliaria objetoRemoto;
	
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
            TDASistemaInmobiliaria sistema = SistemaInmobiliaria.getInstance();
            String url = "//192.168.212.35/GestionAlumnos";
            Naming.rebind(url, (Remote) sistema);
            System.out.println("Server listening on: " + url);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
