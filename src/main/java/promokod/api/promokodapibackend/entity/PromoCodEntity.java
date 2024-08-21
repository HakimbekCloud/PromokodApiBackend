package promokod.api.promokodapibackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "_promokod")
public class PromoCodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String companyName;

    private String promoName;

    private String title;

    private String startPrice;

    private String discountPrice;

    private String expireDate;

    private Boolean isActive;

    private String link;

    private long rating;

    private String image;

}
