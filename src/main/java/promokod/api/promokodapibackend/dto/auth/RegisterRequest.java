package promokod.api.promokodapibackend.dto.auth;



import io.swagger.v3.oas.annotations.Hidden;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import promokod.api.promokodapibackend.entity.user.Role;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String firstName;
    private String lastName;
    @Hidden
    private Role role;
    private String email;
    private String password;
}
