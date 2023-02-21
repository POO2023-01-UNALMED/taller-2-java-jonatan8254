package test;

public class Auto {
	//atributos
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	//metodos
	int cantidadAsientos() {
		int numAsientos=0;
		for(int i=0;i<asientos.length;i++) {
			if(asientos[i] != null) {
				numAsientos++;
			}
		}
		return numAsientos;
	}
	
	String verificarIntegridad() {
		if (registro==motor.registro) {
			for(int i=0; i<asientos.length; i++) {
				if (asientos[i] != null) {
					if(asientos[i].registro != registro) {
						return "Las piezas no son originales";
					}
				}
			}
			return "Auto original";
		}else {
			return "Las piezas no son originales";
		}
	}
}
