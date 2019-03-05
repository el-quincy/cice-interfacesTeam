package com.cice.gestionequipo;

import com.cice.gestionequipo.service.UtilleroService;
import com.cice.gestionequipo.service.impl.UtilleroServiceImpl;

public class Main {
// estoy modificando
	public static void main(String[] args) {
		
		UtilleroServiceImpl hola = new UtilleroServiceImpl();
		hola.modificacionEstadoCapacidadDeViajar(18, true);

	}

}
