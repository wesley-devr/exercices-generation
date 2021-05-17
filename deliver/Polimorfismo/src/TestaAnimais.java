package inheritance;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro("Scot", 10);
		Cavalo cavalo1 = new Cavalo("Raio", 15);
		Preguica preguica1 = new Preguica("Zen", 20);
		
	
		System.out.println(cachorro1.getNome()+" tem idade " + cachorro1.getIdade());
		System.out.println(cavalo1.getNome() + " tem idade " + cavalo1.getIdade());
		System.out.println(preguica1.getNome() + " tem idade " + preguica1.getIdade());
	
		System.out.println("\n"+ "**********Funções*********");
		
		cachorro1.correr();
		cavalo1.correr();
		preguica1.subirArvore();
	}

}
