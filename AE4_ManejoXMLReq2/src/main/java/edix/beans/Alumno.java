package edix.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="alumno")

@XmlType(propOrder = {
		"nombre",
	    "edad",
	    "categoria"
	})

public class Alumno {
	
	
	private String nombre;
	private int edad;
	private String categoria;
	
	
	public Alumno() {
		super();
	}


	public Alumno(String nombre, int edad, String categoria) {
		super();
		
		this.nombre = nombre;
		this.edad = edad;
		this.categoria = categoria;
	}

	
	
	@XmlElement
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	@XmlElement
	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", categoria=" + categoria
				+ "]";
	}
	
	
	
	
}
