package com.cice.gestionequipo;

import com.cice.gestionequipo.service.UtilleroService;
import com.cice.gestionequipo.service.impl.PersonalServiceImpl;
import com.cice.gestionequipo.service.impl.UtilleroServiceImpl;

public class Main {
// estoy modificando
	public static void main(String[] args) {
		
	PersonalServiceImpl prueba = new PersonalServiceImpl();
	prueba.contratar(1551812941, 1, "Pep", "Guardiola");
	System.out.println("==============");
	prueba.despedir(1551812957, 36);

	}

}
