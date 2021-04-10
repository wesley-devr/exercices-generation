package inheritancepolimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo() {
		
	}

	public String emitirSom() {
		return "O nome do cavalo é " + super.getNome() + ", ele tem " + super.getIdade() + " e faz o som Irriiiiiii...";
	}
	
	public String correr() {
		return " e está correndo...";
	}
	
}
