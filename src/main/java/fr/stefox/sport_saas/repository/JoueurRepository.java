package fr.stefox.sport_saas.repository;

import fr.stefox.sport_saas.model.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
}
