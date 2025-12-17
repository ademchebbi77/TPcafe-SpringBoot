package com.esprit.tpcafe.tpcafe_ademchebbi.restController;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Client;
import com.esprit.tpcafe.tpcafe_ademchebbi.services.IClientService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
@AllArgsConstructor
@Tag(name = "👤 Client")
public class ClientRestController {

    private IClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.selectAllClients();
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PostMapping("addall")
    public List<Client> addClients(@RequestBody List<Client> clients) {
        return clientService.saveClients(clients);
    }

    @GetMapping("{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.selectClientByIdWithOrElse(id);
    }

    @DeleteMapping("{id}")
    public String deleteClientById(@PathVariable Long id) {
        clientService.deleteClientById(id);
        return "Client with ID " + id + " deleted successfully";
    }

    @DeleteMapping("deleteAll")
    public String deleteAllClients() {
        clientService.deleteAllClients();
        return "All clients deleted successfully";
    }

    @GetMapping("count")
    public long countClients() {
        return clientService.countingClients();
    }

    @GetMapping("/exists/{id}")
    public boolean verifClientById(@PathVariable Long id) {
        return clientService.verifClientById(id);
    }
}
