package promokod.api.promokodapibackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PromoCodDto {

    private int categoryId;

    private String companyName;

    private String promoName;

    private String title;

    private String image;

    private String startPrice;

    private String discountPrice;

    private String expireDate;

    private String link;

    private Boolean isActive;
}
