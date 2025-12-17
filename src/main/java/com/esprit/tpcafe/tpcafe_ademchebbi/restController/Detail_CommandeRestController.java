package com.esprit.tpcafe.tpcafe_ademchebbi.restController;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Detail_Commande;
import com.esprit.tpcafe.tpcafe_ademchebbi.services.IDetail_CommandeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("details-commandes")
@AllArgsConstructor
@Tag(name = "🧾 Detail Commandes")
public class Detail_CommandeRestController {

    private IDetail_CommandeService detailCommandeService;

    @GetMapping
    public List<Detail_Commande> getAllDetailCommandes() {
        return detailCommandeService.selectAllDetailCommandes();
    }

    @PostMapping
    public Detail_Commande addDetailCommande(@RequestBody Detail_Commande detailCommande) {
        return detailCommandeService.addDetailCommande(detailCommande);
    }

    @PostMapping("addall")
    public List<Detail_Commande> addDetailCommandes(@RequestBody List<Detail_Commande> details) {
        return detailCommandeService.saveDetailCommandes(details);
    }

    @GetMapping("{id}")
    public Detail_Commande getDetailCommandeById(@PathVariable Long id) {
        return detailCommandeService.selectDetailCommandeById(id);
    }

    @DeleteMapping("{id}")
    public String deleteDetailCommandeById(@PathVariable Long id) {
        detailCommandeService.deleteDetailCommandeById(id);
        return "Detail_Commande with ID " + id + " deleted successfully";
    }

    @DeleteMapping("deleteAll")
    public String deleteAllDetailCommandes() {
        detailCommandeService.deleteAllDetailCommandes();
        return "All detail_commandes deleted successfully";
    }
}
