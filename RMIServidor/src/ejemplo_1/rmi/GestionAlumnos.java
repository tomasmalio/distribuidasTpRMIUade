package ejemplo_1.rmi;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

import ejemplo_1.bean.Alumno;
import ejemplo_1.interfaz.TDAManejoDatos;


public class GestionAlumnos extends UnicastRemoteObject implements TDAManejoDatos {

	private static final long serialVersionUID = 1L;
	private Set<Alumno> alumnos;

	public GestionAlumnos() throws RemoteException {
		super();	
		alumnos = new HashSet<Alumno>();
		alumnos.add(new Alumno(1,"Juan"));
		alumnos.add(new Alumno(2,"Pedro"));
		alumnos.add(new Alumno(4,"Maria"));
		alumnos.add(new Alumno(5,"Ramon"));
	}

	public void envioAlumno(Alumno alumno) throws RemoteException 
	{
		alumnos.add(alumno);
	}

	public Alumno obtengoAlumno(int nroAlumno) throws RemoteException {
		Alumno aux;
		for(Iterator<Alumno> i=alumnos.iterator();i.hasNext();)
		{
			aux = i.next();
			if(aux.getNumeroAlumno()==nroAlumno)
				return aux;
		}
		throw new RemoteException("No encontre al alumno");
	}

	public Set<Alumno> obtengoAlumnos() throws RemoteException 
	{
		return alumnos;
	}

	@Override
	public int cantidadAlumnos() throws RemoteException {
		// TODO Auto-generated method stub
		return alumnos.size();
	}
}
