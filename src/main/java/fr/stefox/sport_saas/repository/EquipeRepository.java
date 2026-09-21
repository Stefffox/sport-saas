package fr.stefox.sport_saas.repository;

import fr.stefox.sport_saas.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}