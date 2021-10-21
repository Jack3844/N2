package br.com.robsonoliveira.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import br.com.robsonoliveira.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

}
