package com.cice.gestionequipo;

import com.cice.gestionequipo.service.UtilleroService;
import com.cice.gestionequipo.service.impl.UtilleroServiceImpl;

public class Main {

	public static void main(String[] args) {
		UtilleroService utilleroservice = new UtilleroServiceImpl();
		
		utilleroservice.contratar(null, 1, "Pep", "Guardiola");

	}

}
