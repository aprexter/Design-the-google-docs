package com.aprexter.googledocs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
public class JwtService {
    private final JwtEncoder jwtEncoder;

    public JwtService (JwtEncoder jwtEncoder) {
        this.jwtEncoder = jwtEncoder;
    }

    @Value("${jwt.issuer}")
    private String issuer;

    @Value("${jwt.expiry}")
    private Long expiry;

    public String generateToken(Authentication authentication) {
        Instant now = Instant.now();

        List<String> authorities =
                authentication.getAuthorities()
                        .stream()
                        .map(GrantedAuthority::getAuthority)
                        .toList();

        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer(issuer)
                .issuedAt(now)
                .expiresAt(
                        now.plusSeconds(expiry)
                )
                .subject(
                        authentication.getName()
                )
                .claim(
                        "authorities",
                        authorities
                )
                .build();

        Jwt jwt = jwtEncoder.encode(
                JwtEncoderParameters.from(claims)
        );

        return jwt.getTokenValue();
    }

    public String extractUsername(String jwtToken) {
        return "";
    }

    public Boolean isTokenValid(String jwtToken, UserDetails userDetails) {
        return false;
    }
}
