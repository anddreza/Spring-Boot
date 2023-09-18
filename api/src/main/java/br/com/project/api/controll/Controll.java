package br.com.project.api.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.api.model.Pessoa;

@RestController
public class Controll {
	//Exibir um resultado
	@GetMapping("")
	public String message(){
		return "Hello World!";
	}

	//
	@GetMapping("/welcome")
	public String welcome(){
		return "Seja bem-vindo(a)";
	}

	//Pega uma informação da URL e trata como variável
	@GetMapping("/welcome/{nome}")
	public String welcome(@PathVariable String nome){
		return "Seja bem-vindo(a), " + nome;
	}

	@PostMapping("/pessoa")
	public Pessoa pessoa(@RequestBody Pessoa p){
		return p;
	}


}