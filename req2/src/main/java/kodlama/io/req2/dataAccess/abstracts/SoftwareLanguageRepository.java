package kodlama.io.req2.dataAccess.abstracts;

import kodlama.io.req2.entities.concretes.SoftwareLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareLanguageRepository extends JpaRepository<SoftwareLanguage,Integer> {
}
