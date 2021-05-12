package com.springtest.testapp.contato;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springtest.testapp.model.ContatoModel;
import com.springtest.testapp.repository.ContatoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContatosRepositoryIntegrationsTest {

	private ContatoModel contato;

	@Autowired
	private ContatoRepository contatoRepository;

	@Before
	public void start() {
		contato = new ContatoModel("Test", "011y", "9xxxxxxx9");
	}

	@Test(expected = RuntimeException.class)
	public void salvarComTelNulo() throws Exception {

		contato.setTelefone(null);
		contatoRepository.save(contato);
	}

	@Test(expected = RuntimeException.class)
	public void salvarComDddNulo() throws Exception {

		contato.setDdd(null);
		contatoRepository.save(contato);
	}

	@Test(expected = RuntimeException.class)
	public void salvarComNomeNulo() throws Exception {

		contato.setNome(null);
		contatoRepository.save(contato);
	}
}
