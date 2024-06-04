package kb.demoboot.repository;

import kb.demoboot.bo.Livre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ListResourceBundle;

@Repository
public interface LivreRepository extends CrudRepository<Livre, Integer> {
    List<Livre> findByTitre(String titre);
    List<Livre> findByAuteur(String auteur);
    List<Livre> findByTitreAndAuteur(String titre, String auteur);
    List<Livre> findByTitreOrAuteurOrderByAuteur(String titre, String auteur);
}
