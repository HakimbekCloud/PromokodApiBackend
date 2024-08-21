package promokod.api.promokodapibackend.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import promokod.api.promokodapibackend.entity.PromoCodEntity;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResponseSearch {
    private List<PromoCodEntity> promoCodEntityList;
    private Integer status;
    private String message;
}
