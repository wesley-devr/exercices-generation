package inheritance;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome,idade);
	}
	
	public void correr() {
		System.out.println(this.getNome()+ " está correndo...");
	}
	
	
}
