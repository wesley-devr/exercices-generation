package poo;

public class TestePaciente {

	public static void main(String[] args) {
		Paciente pac1 = new Paciente("Wesley", "666.666.666", "Av. Perto de casa", "99999999", "22.333.555.66");

		pac1.printInfo();
		pac1.marcarConsulta();
		pac1.desmarcarConsulta();
	}

}
