package Computer.Shop.Configuration.Jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.HashMap;
import java.util.stream.Collectors;

public class JwtLoginFilter extends AbstractAuthenticationProcessingFilter
{
    private final JwtEncoder jwtEncoder;
    public JwtLoginFilter(AuthenticationManager authenticationManager, JwtEncoder jwtEncoder)
    {
        super(new AntPathRequestMatcher("/api/v1/auth/login", "POST"), authenticationManager);
        this.jwtEncoder = jwtEncoder;
    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException
    {
        var username = request.getParameter("username");
        var password = request.getParameter("password");
        var authentication = UsernamePasswordAuthenticationToken.unauthenticated(username, password);
        return getAuthenticationManager().authenticate(authentication);
    }
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult)
    {
        var now = Instant.now();
        var scope = authResult.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(" "));
        var claims = JwtClaimsSet.builder()
                .issuer("self")
                .issuedAt(now)
                .expiresAt(now.plusSeconds(18000L))
                .subject(authResult.getName())
                .claim("scope", scope)
                .build();
        var token = jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
        var responseBody = new HashMap<>();
        responseBody.put("token", token);
        response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter writer = response.getWriter())
        {
            writer.write(new ObjectMapper().writeValueAsString(responseBody));
            writer.flush();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}