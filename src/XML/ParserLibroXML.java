package XML;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class ParserLibroXML extends DefaultHandler
{
	private static  Libro libro;
	private String valor_actual;
	String valor_isbn;
	ArrayList<Libro>lista_libros = new ArrayList<Libro>();
	
	public static void listaLibros(ArrayList<Libro> libros) {

		for (Libro libro1 : libros) {
			System.out.println(libro1.getTitulo() + "  " +libro1.getIsbn()+"  "+ libro1.getAutor());

		}
	}
//	
	@Override
	public void startDocument() throws SAXException {
		
		System.out.println("INICIO");
	}
	
	@Override
	public void endDocument() throws SAXException {
		
		listaLibros(lista_libros);
	
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		if (localName.equals("libro"))
		{
			valor_isbn = attributes.getValue("isbn");
			libro=new Libro();
			libro.setIsbn(valor_isbn);
		}
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		if (localName.equalsIgnoreCase("titulo"))
		{
			libro.setTitulo(valor_actual);
		} else if(localName.equalsIgnoreCase("autor"))
		{
			libro.setAutor(valor_actual);
		} else if (localName.equalsIgnoreCase("anyo"))
		{
			libro.setAnyo(valor_actual);
		} else if (localName.equalsIgnoreCase("editorial"))
		{
			libro.setEditorial(valor_actual);
		}
		
		if(localName.equalsIgnoreCase("libro"))
		lista_libros.add(libro);
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		String str = new String(ch, start, length);
		valor_actual = str;
		
	}
}
