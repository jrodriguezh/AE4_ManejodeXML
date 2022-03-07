package edix.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import edix.beans.Alumno;
import edix.beans.Barrio;
import edix.beans.CentroDeportivo;
import edix.beans.Ciudad;
import edix.beans.Clase;
import edix.beans.Direccion;
import edix.beans.Profesor;

public class ObjectToXml {

	public static void main(String[] args) {

		JAXBContext contexto;

		try {
			contexto = JAXBContext.newInstance(Ciudad.class);
		} catch (JAXBException e) {
			System.out.println("Error creando el contexto");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}

		Marshaller m;
		try {
			m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			Ciudad ciudad = new Ciudad();
			ciudad = crearCiudad(ciudad);

			m.marshal(ciudad, System.out);
			m.marshal(ciudad, new File("ciudad.xml"));
			System.out.println("Archivo creado con exito");

		} catch (JAXBException e) {
			System.out.println("Error convertiendo el objeto a formato XML");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	private static Ciudad crearCiudad(Ciudad ciudad) {

		List<Barrio> barrios = new ArrayList<Barrio>();
		List<CentroDeportivo> centrosDeportivos1 = new ArrayList<CentroDeportivo>();
		List<CentroDeportivo> centrosDeportivos2 = new ArrayList<CentroDeportivo>();
		List<Clase> clases1 = new ArrayList<Clase>();
		List<Clase> clases2 = new ArrayList<Clase>();
		List<Clase> clases3 = new ArrayList<Clase>();
		List<Clase> clases4 = new ArrayList<Clase>();
		List<Alumno> alumnos1 = new ArrayList<Alumno>();
		List<Alumno> alumnos2 = new ArrayList<Alumno>();
		List<Alumno> alumnos3 = new ArrayList<Alumno>();
		List<Alumno> alumnos4 = new ArrayList<Alumno>();

		ciudad.setNombre("Madrid");

		// -- BARRIOS --

		barrios.add(new Barrio("Moratalaz", 4000, centrosDeportivos1));
		barrios.add(new Barrio("Vallecas", 20000, centrosDeportivos2));

		ciudad.setBarrios(barrios);

		// -- DIRECCIONES --
		
		Direccion direccion1 = new Direccion("C. Valdebernardo", 2);
		Direccion direccion2 = new Direccion("Av. de las Trece Rosas", 6);
		Direccion direccion3 = new Direccion("C. del Payaso Fofó", 0);
		Direccion direccion4 = new Direccion("C. Mohernando", 1);
		
		// -- PROFESORES --
		
		Profesor profesor1 = new Profesor("Roberto",23,1.89);
		Profesor profesor2 = new Profesor("Carlos",19,1.9);
		Profesor profesor3 = new Profesor("Cristina",25,1.72);
		Profesor profesor4 = new Profesor("Maria",34,1.66);
		Profesor profesor5 = new Profesor("Jesus",45,1.76);
		Profesor profesor6 = new Profesor("Alejandro",34,2.05);
		Profesor profesor7 = new Profesor("Pedro",24,1.77);
		Profesor profesor8 = new Profesor("Ramón",52,1.81);
		
		// -- ALUMNOS --
		
		alumnos1.add( new Alumno("Mario",14,"Cadete"));
		alumnos1.add( new Alumno("Pablo",15,"Cadete"));
		alumnos2.add( new Alumno("Steven",12,"Infantil"));
		alumnos2.add( new Alumno("Javier",13,"Infantil"));
		alumnos3.add( new Alumno("Sofia",16,"Junior"));
		alumnos3.add( new Alumno("Jorge",16,"Junior"));
		alumnos4.add( new Alumno("Laura",23,"Senior"));
		alumnos4.add( new Alumno("Raul",26,"Senior"));
		
		
		// -- CLASES --
		
		clases1.add(new Clase("Spinning",10,profesor1,alumnos1));
		clases1.add(new Clase("Judo",16,profesor2,alumnos2));
		clases2.add(new Clase("Spinning",10,profesor3,alumnos3));
		clases2.add(new Clase("Judo",18,profesor4,alumnos4));
		clases3.add(new Clase("Spinning",10,profesor5,alumnos1));
		clases3.add(new Clase("Judo",18,profesor6,alumnos2));
		clases4.add(new Clase("Spinning",10,profesor7,alumnos3));
		clases4.add(new Clase("Judo",18,profesor8,alumnos4));
		
				
		// -- CENTROS DEPORTIVOS --
		centrosDeportivos1.add(new CentroDeportivo("Municipal", "9:00 a 20:00", direccion1, clases1));
		centrosDeportivos1.add(new CentroDeportivo("Trece Rosas", "8:00 a 22:00", direccion2, clases2));
		centrosDeportivos2.add(new CentroDeportivo("Vallecas", "14:00 a 00:00", direccion4, clases1));
		centrosDeportivos2.add(new CentroDeportivo("Rayo Vallecano", "8:00 a 22:00", direccion3, clases2));
		
		return ciudad;

	}
}
