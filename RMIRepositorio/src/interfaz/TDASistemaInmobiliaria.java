package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import bean.Alquiler;
import bean.Persona;
import bean.Propiedad;
import bean.Servicio;
import bean.Venta;

public interface TDASistemaInmobiliaria extends Remote {
	public float calcularComisiones(LocalDate fechaDesde, LocalDate fechaHasta ) throws RemoteException;
	public List<Persona> getPersonas() throws RemoteException;
	public Persona addPersona(String cuil_cuit, String nombre_razon, String domicilio, String telefono, String mail)  throws RemoteException;
	public Persona buscarPersona(String cuit) throws RemoteException;
	public void grabarPersonas(List<Persona> personas) throws RemoteException;
	public List<Propiedad> getPropiedades() throws RemoteException;
	public void addPropiedad (String nroPartida, String calle, int numero, String piso, String departamento, String ciudad, String cantAmb,  float metrosCubiertos,  float valorAlquiler,  float valorVenta, float impuestos, float servicios, float expensas, Persona propietario)  throws RemoteException;
	public void grabarPropiedades(List<Propiedad> propiedades) throws RemoteException;
	public Propiedad buscarPropiedad(String nroPartida)  throws RemoteException;
	public void grabarAlquileres(List<Alquiler> servicios)  throws RemoteException;
	public void grabarAlquiler(Alquiler servicio)  throws RemoteException;
	public void grabarVentas(List<Venta> servicios)  throws RemoteException;
	public void grabarVenta(Venta servicio) throws RemoteException;
	public void borrarServicio (Venta venta)  throws RemoteException;
	public Alquiler addAlquiler(Date fechaDesde, Date fechaHasta, float comisionGestion, float gastosSellado, Date fecha, String nroPartida, String cuil_cuit)  throws RemoteException;
	public Venta addVenta(Date fechaEscritura, float valorEscritura, float comisionVenta, float gastosEscritura, Date fecha, String nroPartida, String cuil_cuit)  throws RemoteException;
	public void deleteService(Alquiler alquiler)  throws RemoteException;
	public void deleteService(Venta venta)  throws RemoteException;
	public List<Alquiler> getAlquileres()  throws RemoteException;
	public List<Venta> getVentas()  throws RemoteException;
}
