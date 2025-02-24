package br.com.diogovaraschin.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
	/*
	 * get - buscar infp
	 * post - add dado/info
	 * put - alterar dado/info
	 * delete - remover dado
	 * patch = alterar somente uma info
	 * */
	@GetMapping("/primeiroMetodo")
	public String primeiraMensagem() {
		return "funfou xD";
	}
}
