package Computer.Shop.Configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer
{
    @Override
    public void addCorsMappings(CorsRegistry registry)
    {
        registry.addMapping("/api/**")  // Đường dẫn API cần phải cho phép CORS
                .allowedOrigins("http://localhost:5500")  // Domain của ứng dụng frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("Authorization", "Content-Type")
                .exposedHeaders("Authorization")  // Header sẽ được expose để có thể truy cập từ frontend
                .allowCredentials(true);
    }
}

