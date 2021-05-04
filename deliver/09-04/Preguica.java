package inheritancepolimorfismo;

public class Preguica extends Animal {

	public Preguica() {
		
	}
	
	public String emitirSom() {
		return "O nome da preguiça é " + super.getNome() + ", ela tem " + super.getIdade() + " e faz o som Aaaaaaaaaaa...";
	}
	
	public String subirArvore() {
		return " e está subindo na arvoré...";
	}
}
