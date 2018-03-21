package ejemplo_1.interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;
import ejemplo_1.bean.Alumno;


public interface TDAManejoDatos extends Remote 
{
	/* retorna un alumno */
	public Alumno obtengoAlumno(int nroAlumno) throws RemoteException;
	
	/* recibe un alumno */ 
	public void envioAlumno(Alumno alumno)throws RemoteException;
	 
	/* retorna todos los alumnos */ 
	public Set<Alumno> obtengoAlumnos()throws RemoteException;
	
	public int cantidadAlumnos() throws RemoteException;
}
