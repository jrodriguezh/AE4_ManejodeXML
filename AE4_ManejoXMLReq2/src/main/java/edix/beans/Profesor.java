package edix.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder= {
		"nombre",
		"edad",
		"altura",
})
public class Profesor {

	private String nombre;
	private int edad;
	private double altura;
	public Profesor() {
		super();
	}
	public Profesor(String nombre, int edad, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
	}
	
	

}
