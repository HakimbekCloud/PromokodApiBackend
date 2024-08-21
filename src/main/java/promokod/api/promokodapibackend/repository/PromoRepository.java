package promokod.api.promokodapibackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import promokod.api.promokodapibackend.entity.PromoCodEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface PromoRepository extends JpaRepository<PromoCodEntity,Integer> {
    @Query(value = "select * from _promokod where _promokod.is_active = true order by _promokod.expire_date desc",nativeQuery = true)
    List<PromoCodEntity> getAll();

    Optional<PromoCodEntity> findAllByPromoName(String promoName);

    @Query(value = "SELECT * FROM _promokod WHERE company_name || promo_name || title LIKE %?1%\n" +
            "UNION\n" +
            "SELECT * FROM _promokod WHERE company_name || promo_name || title LIKE %?1%\n" +
            "UNION\n" +
            "SELECT * FROM _promokod WHERE company_name || promo_name || title LIKE %?1%",nativeQuery = true)
    List<PromoCodEntity> findAllByQuery(String query);
}
