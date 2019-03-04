package com.cice.gestionequipo;


import com.cice.gestionequipo.service.UtilleroService;
import com.cice.gestionequipo.service.impl.UtilleroServiceImpl;

public class Main {
// estoy modificando
	public static void main(String[] args) {
		UtilleroService utilleroService = new UtilleroServiceImpl();
		
		utilleroService.contratar(null, 1, "Pep", "Guardiola");

	}

}
