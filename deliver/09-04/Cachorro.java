package inheritancepolimorfismo;

public class Cachorro extends Animal {

	public Cachorro () {
		
	}
	
	public String emitirSom() {
		return "O nome do cachorro é " + super.getNome() + ", ele tem " + super.getIdade() + " e faz o som Au Au Au Au Au...";
	}
	
	public String correr() {
		return "e está correndo...";
	}
	
}
