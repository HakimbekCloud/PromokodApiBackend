package promokod.api.promokodapibackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import promokod.api.promokodapibackend.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {

}
