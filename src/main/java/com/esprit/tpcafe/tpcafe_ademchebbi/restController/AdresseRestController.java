package com.esprit.tpcafe.tpcafe_ademchebbi.restController;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Adresse;
import com.esprit.tpcafe.tpcafe_ademchebbi.services.IAdresseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("adresses")
@AllArgsConstructor
@Tag(name = "📍 Adresses")
public class AdresseRestController {

    private IAdresseService adresseService;

    @GetMapping
    public List<Adresse> getAllAdresses() {
        return adresseService.selectAllAdresses();
    }

    @PostMapping
    public Adresse addAdresse(@RequestBody Adresse adresse) {
        return adresseService.addAdresse(adresse);
    }



    @PostMapping("addall")
    public List<Adresse> addAdresses(@RequestBody List<Adresse> adresses) {
        return adresseService.saveAdresses(adresses);
    }

    @GetMapping("{id}")
    public Adresse getAdresseById(@PathVariable Long id) {
        return adresseService.selectAdresseById(id);
    }

    @DeleteMapping("{id}")
    public String deleteAdresseById(@PathVariable Long id) {
        adresseService.deleteAdresseById(id);
        return "Adresse with ID " + id + " deleted successfully";
    }

    @DeleteMapping("deleteAll")
    public String deleteAllAdresses() {
        adresseService.deleteAllAdresses();
        return "All adresses deleted successfully";
    }

    @GetMapping("count")
    public long countAdresses() {
        return adresseService.countAdresses();
    }

    @GetMapping("/exists/{id}")
    public boolean verifAdresseById(@PathVariable Long id) {
        return adresseService.verifAdresseById(id);
    }
}
