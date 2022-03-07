package jdom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LecturaXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder analizador;
		Document doc;
		Node raiz;

		try {
			analizador = fabrica.newDocumentBuilder();
			doc = analizador.parse("concierto.xml");
			raiz = doc.getDocumentElement();
			recorrerNodos(raiz, doc);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void recorrerNodos(Node raiz, Document doc) {

		// Este metodo devuelve todos los nodos hijos directos del elemento conciertos
		NodeList nodos = raiz.getChildNodes();
		System.out.println("Elementos en el nodo raíz: " + nodos.getLength());
		// System.out.println(nodos);
		String fecha = nodos.item(0).getTextContent();
		String hora = nodos.item(1).getTextContent();
		System.out.println("Fecha y hora del concierto: " + fecha + " " + hora);

		NodeList participantes = doc.getElementsByTagName("participante");

		for (int i = 0; i < participantes.getLength(); i++) {
			Node participante = participantes.item(i);

			if (participante.getNodeType() == Node.ELEMENT_NODE) {
				Node inicio = participante.getChildNodes().item(0);
				Node grupo = participante.getChildNodes().item(1);
				System.out.println("  " + inicio.getTextContent() + "  " + grupo.getTextContent());

			}
		}

	}

}
