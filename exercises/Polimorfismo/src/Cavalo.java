package inheritance;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome,idade);
	}
	
	@Override
	public void correr() {
		return this.getNome() + " está correndo...";
	}
	
}
