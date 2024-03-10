/**
 * 
 */
package com.proyectjava.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.proyectjava.projectjsf.entity.Empleados;

/**
 * Clase que permite realizar la lógica de negocio para empleados
 */
public class EmpleadoService {
	
	/**
	 * Método que permite consultar a la lista de empleados de empresas de TI
	 * @return {@link Empleado} lista de empleados
	 */
	public List<Empleados> consultarEmpleado() {
		
		//Generar lista de empleados a consultar
		List<Empleados> empleados = new ArrayList<Empleados>();
		Empleados empIBM = new Empleados();
		Empleados empMicrosof = new Empleados();
		Empleados empApple = new Empleados();
		
		empIBM.setNombre("Josué");
		empIBM.setApPaterno("Sachún");
		empIBM.setApMaterno("Guarniz");
		empIBM.setCargo("Developer");
		empIBM.setEstatus(true);
		
		empMicrosof.setNombre("Alonso");
		empMicrosof.setApPaterno("Sachún");
		empMicrosof.setApMaterno("Guarniz");
		empMicrosof.setCargo("PM");
		empMicrosof.setEstatus(true);
		
		empApple.setNombre("Belén");
		empApple.setApPaterno("Sachún");
		empApple.setApMaterno("Guarniz");
		empApple.setCargo("DBA");
		empApple.setEstatus(true);
		
		empleados.add(empIBM);
		empleados.add(empMicrosof);
		empleados.add(empApple);
		
		return empleados;
	}
}