package edix.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="barrio")
@XmlType(propOrder = {
		"nombre",
		"habitantes",
		"centroDeportivos",
})

public class Barrio {

	private String nombre;
	private int habitantes;
	private List<CentroDeportivo> centroDeportivos;
	
	
	
	public Barrio() {
		}
	
	

	public Barrio(String nombre, int habitantes, List<CentroDeportivo> centroDeportivos) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.centroDeportivos = centroDeportivos;
	}



	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getHabitantes() {
		return habitantes;
	}
	
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	@XmlElement(name = "centroDeportivo")
	@XmlElementWrapper(name = "centroDeportivos")
	public List<CentroDeportivo> getCentroDeportivos() {
		return centroDeportivos;
	}

	public void setCentroDeportivos(List<CentroDeportivo> centroDeportivos) {
		this.centroDeportivos = centroDeportivos;
	}
	
	
	
}
