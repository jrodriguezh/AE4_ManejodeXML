package edix.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "centroDeportivo")
@XmlType(propOrder= {
		"nombre",
		"horario",
		"direccion",
		"clases",
})
public class CentroDeportivo {

	private String nombre;
	private String horario;
	private Direccion direccion;
	private List<Clase> clases;

	public CentroDeportivo() {

	}
	
	

	public CentroDeportivo(String nombre, String horario, Direccion direccion, List<Clase> clases) {
		super();
		this.nombre = nombre;
		this.horario = horario;
		this.direccion = direccion;
		this.clases = clases;
	}



	@XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@XmlElement
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@XmlElement(name = "clase")
	@XmlElementWrapper(name = "clases")
	public List<Clase> getClases() {
		return clases;
	}

	public void setClases(List<Clase> clases) {
		this.clases = clases;
	}

}
