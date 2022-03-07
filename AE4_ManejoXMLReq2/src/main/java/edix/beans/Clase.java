package edix.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "nombre", "hora", "profesor","alumnos", })
public class Clase {

	private String nombre;
	private int hora;
	private Profesor profesor;
	private List<Alumno> alumnos;

	public Clase() {
	}

	public Clase(String nombre, int hora, Profesor profesor, List<Alumno> alumnos) {
		super();
		this.nombre = nombre;
		this.hora = hora;
		this.profesor = profesor;
		this.alumnos = alumnos;
	}

	@XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlElement
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	@XmlElement
	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@XmlElement(name = "alumno")
	@XmlElementWrapper(name = "alumnos")

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

}
