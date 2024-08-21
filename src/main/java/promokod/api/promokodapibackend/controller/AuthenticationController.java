package promokod.api.promokodapibackend.controller;

import org.springframework.web.bind.annotation.*;
import promokod.api.promokodapibackend.dto.AuthenticationResponse;
import promokod.api.promokodapibackend.dto.auth.AuthenticationRequest;
import promokod.api.promokodapibackend.dto.auth.RegisterRequest;
import promokod.api.promokodapibackend.service.AuthenticateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    private final AuthenticateService authenticateService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest registerRequest) {
        return ResponseEntity.ok(authenticateService.register(registerRequest));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest registerRequest) {
        return ResponseEntity.ok(authenticateService.authenticate(registerRequest));
    }

}
