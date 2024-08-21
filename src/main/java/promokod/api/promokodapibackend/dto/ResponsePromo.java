package promokod.api.promokodapibackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponsePromo {
    private Object responseEntity;

    private Integer status;

    private String message;
}
