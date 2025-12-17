package com.esprit.tpcafe.tpcafe_ademchebbi.restController;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Promotion;
import com.esprit.tpcafe.tpcafe_ademchebbi.services.IPromotionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("promotions")
@AllArgsConstructor
@Tag(name = " 🏷️ Promotion")
public class PromotionRestController {

    private IPromotionService promotionService;

    @GetMapping
    public List<Promotion> getAllPromotions() {
        return promotionService.selectAllPromotions();
    }

    @PostMapping
    public Promotion addPromotion(@RequestBody Promotion promotion) {
        return promotionService.addPromotion(promotion);
    }

    @PostMapping("addall")
    public List<Promotion> addPromotions(@RequestBody List<Promotion> promotions) {
        return promotionService.savePromotions(promotions);
    }

    @GetMapping("{id}")
    public Promotion getPromotionById(@PathVariable Long id) {
        return promotionService.selectPromotionById(id);
    }

    @DeleteMapping("{id}")
    public String deletePromotionById(@PathVariable Long id) {
        promotionService.deletePromotionById(id);
        return "Promotion with ID " + id + " deleted successfully";
    }

    @DeleteMapping("deleteAll")
    public String deleteAllPromotions() {
        promotionService.deleteAllPromotions();
        return "All promotions deleted successfully";
    }

    @GetMapping("count")
    public long countPromotions() {
        return promotionService.countPromotions();
    }

    @GetMapping("/exists/{id}")
    public boolean verifPromotionById(@PathVariable Long id) {
        return promotionService.verifPromotionById(id);
    }
    @PostMapping("/affecter/{idArticle}/{idPromo}")
    public void affecterPromotionAArticle(
            @PathVariable long idArticle,
            @PathVariable long idPromotion
    ) {
        promotionService.affecterPromotionAArticle(idArticle, idPromotion);
    }

    @PostMapping("/desaffecter/{idArticle}/{idPromo}")
    public void desaffecterPromotionDeArticle(
            @PathVariable long idArticle,
            @PathVariable long idPromotion
    ) {
        promotionService.desaffecterPromotionDeArticle(idArticle, idPromotion);
    }
}
