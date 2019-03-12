package br.senai.sc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.domain.Categoria;
import br.senai.sc.domain.Produto;
import br.senai.sc.repositories.CategoriaRepository;
import br.senai.sc.repositories.ProdutoRepository;

@SpringBootApplication
public class ProjetoPedidoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPedidoApplication.class, args);
	}

	@Autowired
	private CategoriaRepository repo1;
	private ProdutoRepository repo2;
	
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Produto pro1 = new Produto(null, "Mouse", 19.99);
		Produto pro2 = new Produto(null, "Teclado", 14.99);
		
		repo1.save(cat1);
		repo1.save(cat2);
		repo2.save(pro1);
		repo2.save(pro2);
	}

}
