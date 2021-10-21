package br.com.robsonoliveira.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.robsonoliveira.model.Client;
import br.com.robsonoliveira.service.ClientService;

@RestController
@RequestMapping("/customers")
public class ClientController {
	@Autowired
   private ClientService clientservice;
	@PostMapping
	public Client insert(@RequestBody Client client) {
		return clientservice.insert(client);
	}

	@PutMapping
	public Client update(@RequestBody Client client) {
		return clientservice.update(client);
	}
	@GetMapping
	public List<Client> findAll(){
		return clientservice.finAll();
		}
	@GetMapping("/{id}")
	public Optional<Client> findOne(@PathVariable int id){
		return clientservice.findOne(id);
	}
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id){
		clientservice.remove(id);
	}
}
