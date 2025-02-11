package service;

import entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClientRepository;

@Service
public class ClientService {
  @Autowired
  ClientRepository clientRepository;

  public Client create(Client client) {
    return clientRepository.save(client);
  }

}
