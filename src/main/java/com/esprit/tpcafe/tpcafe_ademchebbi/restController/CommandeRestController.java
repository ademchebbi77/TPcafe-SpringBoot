package com.esprit.tpcafe.tpcafe_ademchebbi.restController;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Commande;
import com.esprit.tpcafe.tpcafe_ademchebbi.services.ICommandeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("commandes")
@AllArgsConstructor
@Tag(name = "🧾 Commandes")
public class CommandeRestController {

    private ICommandeService commandeService;

    @GetMapping
    public List<Commande> getAllCommandes() {
        return commandeService.selectAllCommandes();
    }

    @PostMapping
    public Commande addCommande(@RequestBody Commande commande) {
        return commandeService.addCommande(commande);
    }

    @PostMapping("addall")
    public List<Commande> addCommandes(@RequestBody List<Commande> commandes) {
        return commandeService.saveCommandes(commandes);
    }

    @GetMapping("{id}")
    public Commande getCommandeById(@PathVariable Long id) {
        return commandeService.selectCommandeById(id);
    }

    @DeleteMapping("{id}")
    public String deleteCommandeById(@PathVariable Long id) {
        commandeService.deleteCommandeById(id);
        return "Commande with ID " + id + " deleted successfully";
    }

    @DeleteMapping("deleteAll")
    public String deleteAllCommandes() {
        commandeService.deleteAllCommandes();
        return "All commandes deleted successfully";
    }

    @GetMapping("count")
    public long countCommandes() {
        return commandeService.countCommandes();
    }

    @GetMapping("/exists/{id}")
    public boolean verifCommandeById(@PathVariable Long id) {
        return commandeService.verifCommandeById(id);
    }
}
