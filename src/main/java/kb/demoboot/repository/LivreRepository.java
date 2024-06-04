package kb.demoboot.repository;

import kb.demoboot.bo.Livre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ListResourceBundle;

@RepositoryRestResource(path = "les-livres", collectionResourceRel = "data")
public interface LivreRepository extends CrudRepository<Livre, Integer> {
    List<Livre> findByTitre(String titre);
    @RestResource(path = "test")
    List<Livre> findByAuteur(String auteur);
    List<Livre> findByTitreAndAuteur(String titre, String auteur);
    List<Livre> findByTitreOrAuteurOrderByAuteur(String titre, String auteur);
}
