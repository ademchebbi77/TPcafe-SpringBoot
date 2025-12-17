package com.esprit.tpcafe.tpcafe_ademchebbi.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI cafeOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("🏷️ TPCafé REST API — by 'Adem Chebbi'")
                        .description("""
                                <div style='background-color:#f0f0f0; padding:20px; border-radius:10px; 
                                            font-family:Segoe UI, sans-serif; line-height:1.6;'>
                                    <h2 style='background: linear-gradient(90deg, #b07a30, #6b4e3d);
                                               -webkit-background-clip: text;
                                               -webkit-text-fill-color: transparent;'>
                                        ☕ Bienvenue sur <b>TPCafé API</b>
                                    </h2>
                                    <p style='color:#333;'>Découvrez une API complète pour la gestion intelligente d’un café moderne.</p>
                                    <ul style='margin-left:15px; font-size:15px; color:#222;'>
                                        <li>👤 <b>Gestion des clients</b> — création, mise à jour et fidélisation</li>
                                        <li>📄 <b>Articles</b> — gestion du menu, stocks, et détails produits</li>
                                        <li>🧾 <b>Commandes</b> — suivi complet et détail des achats</li>
                                        <li>🏷️ <b>Promotions</b> — offres exclusives et réductions dynamiques</li>
                                        <li>📍 <b>Adresses</b> — géolocalisation et suivi des clients</li>
                                        <li>💳 <b>Cartes de fidélité</b> — points et récompenses automatiques</li>
                                    </ul>
                                    <hr style='border:none; border-top:1px solid #ccc; margin:20px 0;'>
                                    <div style='font-size:13px; color:#555;'>
                                        <p>🧠 Développée avec <b>Spring Boot 3</b> + <b>Swagger UI</b></p>
                                        <p>👨‍💻 Réalisé par <a href='https://www.linkedin.com/in/adem-chebbi-438a1b37a/'
                                                style='color:#8B4513; text-decoration:none; font-weight:bold;'>
                                                Adem Chebbi</a></p>
                                    </div>
                                </div>
                                """)
                        .contact(new Contact()
                                .name("Adem Chebbi")
                                .email("medadem.chebbi@esprit.tn")
                                .url("https://www.linkedin.com/in/adem-chebbi-438a1b37a/")
                        )
                        .license(new License()
                                .name("📘 Licence — Projet universitaire ESPRIT")
                                .url("https://esprit.tn/")
                        )
                )
                .servers(List.of(
                        new Server()
                                .url("http://localhost:8089/api")
                                .description("🧪 Serveur Local — Développement"),
                        new Server()
                                .url("https://api.tpcafe.tn")
                                .description("🚀 Serveur Distant — Production")
                ))
                .externalDocs(new ExternalDocumentation()
                        .description("📂 Voir le code source sur GitHub")
                        .url("https://github.com/ademchebbi145/Adem-Chebbi")
                );
    }
}
