package inheritance;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade){
		super(nome, idade);
	} 
	
	@Override
	public void correr() {
		return this.getNome() + " está correndo...";
	}
	
}
