package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import br.com.projeto.api.modelo.Pessoa;
import br.com.projeto.api.repositorio.Repositorio;

//Simplesmente retornar o objeto e os dados do objeto são gravadados diretamente na resposta HTTP como JSON ou XML
@RestController
public class Controle {

	//
	@Autowired
	private Repositorio acao;

	//5. Para ter acesso ao RequestBody tem que usar o método PostMapping
	@PostMapping("/api")
	//1. Um método que será nossa rota de cadastro
	//2. Por que Pessoa? Toda vez que formos cadastrar uma pessoa vamos informar o nome e a idade, em seguida será retornado o nome, idade e o código da pessoa 
	public Pessoa cadastrar(@RequestBody Pessoa obj){
		//3. Como fazer um insert? return acao. (os métodos que vem depois do ponto é do groupRepository) para salvar cadastrar usa o método save, e dentro do save tem que passar um obj do tipo pessoa. 
		
		//4. Como vou pegar uma informação do tipo pessoa? Dentro do parâmetro da função Pessoa cadastrar() -> estou esperando uma requisição do tipo Pessoa obj 
		return acao.save(obj); //save terá acesso através do obj. 
	}

	@GetMapping("/api")
	public List<Pessoa> selecionar(){
		return acao.findAll();
	}

	@GetMapping("/api/{codigo}")
	public Pessoa selecionarPeloCodigo(@PathVariable int codigo){
		return acao.findByCodigo(codigo);
	}

	@PutMapping("/api")
	//Esse método retorna um objeto do tipo Pessoa
	public Pessoa editar(@RequestBody Pessoa obj){
		//O save foi utilizado para cadastrar e editar, quando passa um objeto que não possui o ID - nesse caso o código - ele entende que tem que cadastrar um novo usuário
		return acao.save(obj);
	}

	@DeleteMapping("/api/{codigo}")
	public void remover(@PathVariable int codigo){
		Pessoa obj = selecionarPeloCodigo(codigo);
		acao.delete(obj);
	}

	@GetMapping("/api/contador")
	//long -> é o tipo de informação que o metodo count vai retornar
	public long contador(){
		return acao.count();
	}

	@GetMapping("/api/ordernarNomes")
	public List<Pessoa> ordernarNomes(){
		return acao.findByOrderByNomeDesc();
	}

	@GetMapping("/api/ordenarNomes2")
	public List<Pessoa> ordenarNomes2(){
		return acao.findByNomeOrderByIdadeDesc("Tatiana");
	}

	//Exibir um resultado
	@GetMapping("")
	public String message(){
		return "Hello World!";
	}

	//
	@GetMapping("/boasVindas/")
	public String welcome(){
		return "Seja bem-vindo(a)";
	}

	//Pega uma informação da URL e trata como variável
	@GetMapping("/boasVindas/{nome}")
	public String welcome(@PathVariable String nome){
		return "Seja bem-vindo(a), " + nome;
	}

 	@PostMapping("/pessoa")
	public Pessoa pessoa(@RequestBody Pessoa p){
		return p;
	} 


}