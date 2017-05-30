package taller;

import container.Listas;
import models.Cliente;
import models.Reparacion;
import models.Vehiculo;
import ventanas.login;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("cliente1", 29010, "primero", "12345678L", 123456789);
		Cliente c2 = new Cliente("cliente2", 29011, "segundo", "12345678P", 223456789);
		Cliente c3 = new Cliente("cliente3", 29012, "tercero", "12345678B", 323456789);
		Cliente c4 = new Cliente("cliente4", 29013, "cuarto", "12345678N", 423456789);
		// 1 dueño por vehiculo
		Vehiculo v1 = new Vehiculo("1234ABC", 2000, "ford", "caca", "marron", 288, "Coche", "12345678L");
		Vehiculo v2 = new Vehiculo("12ABCD12", 1500, "seat", "tolerdo", "azul", 150, "Moto", "12345678P");
		// 2 vehiculos 1 duelo
		Vehiculo v3 = new Vehiculo("2222ABC", 1571, "skoda", "lepanto", "amarillo", 170, "Coche", "12345678N");
		Vehiculo v4 = new Vehiculo("3333ABC", 1975, "ferrari", "franco", "rojo", 220, "Camion", "12345678N");
		// 3 vehiculos 1 dueño
		Vehiculo v5 = new Vehiculo("4444ABC", 1945, "VMW", "furer", "azul", 160, "Moto", "12345678B");
		Vehiculo v6 = new Vehiculo("5555ABC", 1492, "seat", "colon", "verde", 130, "Camion", "12345678B");
		Vehiculo v7 = new Vehiculo("6666ABC", 1605, "ford", "quijote", "blanco", 20, "Bici", "12345678B");


		// 3 coches 1 reparacion
		Reparacion r1 = new Reparacion("Demo", "1234ABC", "12345678L", "Coche", null, null, 5, "111","junta de la trocola");

		Reparacion r2 = new Reparacion("Demo", "12ABCD12", "12345678P", "Moto", null, null, 2, "288", "escape");

		Reparacion r3 = new Reparacion("Demo", "2222ABC", "12345678N", "Coche", null, null, 1, "350", "luna");

		// 2 coches 2 reparaciones.
		Reparacion r4 = new Reparacion("Demo", "3333ABC", "12345678N", "Camion", null, null, 1, "500", "Cambios");
		Reparacion r5 = new Reparacion("Demo", "3333ABC", "12345678N", "Camion", null, null, 3, "150", "Ruedas");

		Reparacion r6 = new Reparacion("Demo", "4444ABC", "12345678B", "Moto", null, null, 2, "620", "Direccion");
		Reparacion r7 = new Reparacion("Demo", "4444ABC", "12345678B", "Moto", null, null, 4, "300", "Frenos");

		// 2Coches 3 reparaciones, la ruina loco.

		Reparacion r8 = new Reparacion("Demo", "5555ABC", "12345678B", "Camion", null, null, 1, "70", "Claxon");
		Reparacion r9 = new Reparacion("Demo", "5555ABC", "12345678B", "Camion", null, null, 2, "170", "Airbag");
		Reparacion r10 = new Reparacion("Demo", "5555ABC", "12345678B", "Camion", null, null, 3, "320", "Asientos");

		Reparacion r11 = new Reparacion("Demo", "6666ABC", "12345678B", "Bici", null, null, 1, "50", "Alineacion");
		Reparacion r12 = new Reparacion("Demo", "6666ABC", "12345678B", "Bici", null, null, 4, "60", "Engrase");
		Reparacion r13 = new Reparacion("Demo", "6666ABC", "12345678B", "Bici", null, null, 5, "120",
				"Cambio Cubiertas");

		Listas.usuario = "";

		Listas.listaClientes.add(c1);
		Listas.listaClientes.add(c2);
		Listas.listaClientes.add(c3);
		Listas.listaClientes.add(c4);

		Listas.listaVehiculo.add(v1);
		Listas.listaVehiculo.add(v2);
		Listas.listaVehiculo.add(v3);
		Listas.listaVehiculo.add(v4);
		Listas.listaVehiculo.add(v5);
		Listas.listaVehiculo.add(v6);
		Listas.listaVehiculo.add(v7);

		Listas.listaReparaciones.add(r1);
		Listas.listaReparaciones.add(r2);
		Listas.listaReparaciones.add(r3);
		Listas.listaReparaciones.add(r4);
		Listas.listaReparaciones.add(r5);
		Listas.listaReparaciones.add(r6);
		Listas.listaReparaciones.add(r7);
		Listas.listaReparaciones.add(r8);
		Listas.listaReparaciones.add(r9);
		Listas.listaReparaciones.add(r10);

		Listas.listaReparaciones.add(r11);
		Listas.listaReparaciones.add(r12);
		Listas.listaReparaciones.add(r13);











		login g = new login();
		g.run();

	}
}
