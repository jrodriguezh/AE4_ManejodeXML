package edix.main;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import edix.beans.Alumno;
import edix.beans.Barrio;
import edix.beans.CentroDeportivo;
import edix.beans.Ciudad;
import edix.beans.Clase;

public class XmlToObject {

	public static void main(String[] args) {
		try {
			JAXBContext contexto = JAXBContext.newInstance(Ciudad.class);

			Unmarshaller u = contexto.createUnmarshaller();
			File fichero = new File("ciudad.xml");
			if (fichero.exists()) {
				Ciudad ciudad = (Ciudad) u.unmarshal(fichero);
				listar(ciudad);
			} else {
				System.out.println("Fichero XML no encontrado");
			}

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}

	}

	static void listar(Ciudad ciudad) {

		System.out.println("La ciudad de " + ciudad.getNombre() + " tiene los siguientes barrios: ");
		for (int i = 0; i < ciudad.getBarrios().size(); i++) {
			Barrio b = ciudad.getBarrios().get(i);
			System.out.println("--------------------------------");
			System.out.println("Barrio de: " + b.getNombre());
			System.out.println("N� de habitantes: " + b.getHabitantes());
			System.out.println("Tiene los siguientes Centros deportivos:");
			for (CentroDeportivo c : b.getCentroDeportivos()) {
				System.out.println("------------");
				System.out.println("Centro deportivo: " + c.getNombre());
				System.out.println("Horario: " + c.getHorario());
				System.out.println("Direcci�n: " + c.getDireccion().getCalle() + ", " + c.getDireccion().getNumero());
				System.out.println("Tiene las siguientes clases: ");
				for (Clase c2 : c.getClases()) {
					System.out.println(".............");
					System.out.println(c2.getNombre() + ":");
					System.out.println("Hora comienzo: " + c2.getHora());
					System.out.println("Profesor: " + c2.getProfesor().getNombre() + " que tiene "
							+ c2.getProfesor().getEdad() + " a�os y mide " + c2.getProfesor().getAltura() + " m.");
					System.out.println("La clase tiene los siguientes alumnos: ");
					for (Alumno a : c2.getAlumnos()) {
						System.out.println("************");
						System.out.println("Nombre: "+a.getNombre());
						System.out.println("Edad: "+a.getEdad());
						System.out.println("Categoria: "+a.getCategoria());
					}
				}

			}

		}

	}

}
