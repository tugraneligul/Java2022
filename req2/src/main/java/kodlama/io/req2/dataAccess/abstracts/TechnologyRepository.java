package kodlama.io.req2.dataAccess.abstracts;

import kodlama.io.req2.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
}
