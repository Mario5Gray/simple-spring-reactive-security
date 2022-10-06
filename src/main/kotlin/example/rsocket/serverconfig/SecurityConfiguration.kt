package example.rsocket.serverconfig

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.rsocket.RSocketSecurity
import org.springframework.security.rsocket.core.PayloadSocketAcceptorInterceptor

@Configuration
@Profile("LOGINONLY")
open class SecurityConfiguration {

    @Bean
    open fun simpleSecurityAuthentication(security: RSocketSecurity)
            : PayloadSocketAcceptorInterceptor = security
            .simpleAuthentication(Customizer.withDefaults())
            .authorizePayload { authorize ->
                authorize
                        .setup().hasRole("LOGINONLY")
                        .anyRequest().authenticated()
            }
            .build()
}