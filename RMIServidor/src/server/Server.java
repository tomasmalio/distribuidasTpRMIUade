package server;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import interfaz.TDASistemaInmobiliaria;

public class Server {
    
	TDASistemaInmobiliaria objetoRemoto;
	
	public static void main(String[] args) {
		new Server();
	}
	
	public Server() {
		init();
	}
	
    public void init() {
		try {
    		LocateRegistry.createRegistry(1099);	
            TDASistemaInmobiliaria sistema = SistemaInmobiliaria.getInstance();
            String url = "//localhost/GestionAlumnos";
            Naming.rebind(url, sistema);
            System.out.println("Server listening on: " + url);
            new Setup(sistema, true, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
