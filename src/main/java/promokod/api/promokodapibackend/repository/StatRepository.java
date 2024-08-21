package promokod.api.promokodapibackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import promokod.api.promokodapibackend.entity.user.Statistics;

public interface StatRepository extends JpaRepository<Statistics,Integer> {
}
