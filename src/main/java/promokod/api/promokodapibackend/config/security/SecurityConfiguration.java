package promokod.api.promokodapibackend.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

    private final JwtAuthenticationFilter jwtAuthFilter;

    private final AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/api/v1/auth/**").permitAll()
                        .requestMatchers("/swagger-ui/**").permitAll()
                        .requestMatchers("/v2/api-docs").permitAll()
                        .requestMatchers("/v3/api-docs").permitAll()
                        .requestMatchers("/v3/api-docs/**").permitAll()
                        .requestMatchers("/swagger-resources").permitAll()
                        .requestMatchers("/swagger-resources/**").permitAll()
                        .requestMatchers("/configuration/ui").permitAll()
                        .requestMatchers("/configuration/security").permitAll()
                        .requestMatchers("/swagger-ui/**").permitAll()
                        .requestMatchers("/webjars/**").permitAll()
                        .requestMatchers("/javainuse-openapi/**").permitAll()
                        .requestMatchers("/api/v1/promo/getPromoById/**").permitAll()
                        .requestMatchers("/api/v1/promo/getAllPromo/**").permitAll()
                        .requestMatchers("/api/v1/promo/search/**").permitAll()
                        .requestMatchers("/api/v1/promo/getAllCategory/**").permitAll()
                        .requestMatchers("/api/v1/promo/category/**").permitAll()
                        .requestMatchers("/api/v1/promo/getStatistics").permitAll()
                        .requestMatchers("/api/v1/promo/updatePromo/**").hasRole("ADMIN")
                        .requestMatchers("/api/v1/promo/createCategory").hasRole("ADMIN")
                        .requestMatchers("/api/v1/promo/addPromoCod").hasRole("ADMIN")
                        .anyRequest().authenticated())

                .sessionManagement((session) -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}
