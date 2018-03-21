package ejemplo_1.bean;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroAlumno;
	private String nombre;
	public Alumno(int numeroAlumno, String nombre) {
		this.numeroAlumno = numeroAlumno;
		this.nombre = nombre;
	}
	public int getNumeroAlumno() {
		return numeroAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNumeroAlumno(int numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", numeroAlumno=" + numeroAlumno
				+ "]";
	}
	
}
