package api;

import modelo.Persona;

public interface ServicePersona {
	String guardar(Persona persona);
	int eliminar(String curp);
	 boolean existe(String curp);
}
