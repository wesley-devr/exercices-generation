package inheritancepolimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Scot");
		cachorro1.setIdade(10);
		System.out.println(cachorro1.emitirSom()+ cachorro1.correr());
		
		Cavalo cavalo1 = new Cavalo();
		cavalo1.setNome("Raio");
		cavalo1.setIdade(12);
		System.out.println(cavalo1.emitirSom()+ cavalo1.correr());
		
		Preguica preguica1 = new Preguica();
		preguica1.setNome("Mid");
		preguica1.setIdade(15);
		System.out.println(preguica1.emitirSom() + preguica1.subirArvore());
	}

}
