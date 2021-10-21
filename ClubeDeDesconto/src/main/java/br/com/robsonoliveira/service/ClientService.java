package br.com.robsonoliveira.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.robsonoliveira.model.Client;
import br.com.robsonoliveira.repository.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientrepository;
		
	public Client insert(Client client){
		return clientrepository.save(client);
	}
	public Client update(Client client) {
	    return clientrepository.save(client);
	    }
	public List<Client> finAll(){
		List<Client> coustomers = new ArrayList<>();
		clientrepository.findAll().forEach(coustomers::add);
		return coustomers;
	}
	public Optional<Client> findOne(int id){
		return clientrepository.findById(id);
	}
	public void remove(int id){
		clientrepository.deleteById(id);
		
	}
	
}	