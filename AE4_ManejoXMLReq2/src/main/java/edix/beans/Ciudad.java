package edix.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ciudad")
@XmlType(propOrder = { "nombre", "barrios", })

public class Ciudad {

	private String nombre;
	private List<Barrio> barrios;

	public Ciudad() {
	}

	public Ciudad(String nombre, List<Barrio> barrios) {
		super();
		this.nombre = nombre;
		this.barrios = barrios;
	}

	@XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement(name = "barrio")
	@XmlElementWrapper(name = "barrios")
	public List<Barrio> getBarrios() {
		return barrios;
	}

	public void setBarrios(List<Barrio> barrios) {
		this.barrios = barrios;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", barrios=" + barrios + "]";
	}
}
