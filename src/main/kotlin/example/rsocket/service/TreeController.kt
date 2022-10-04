package example.rsocket.service

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.core.userdetails.UserDetails
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface TreeControllerMapping : TreeService {
    @MessageMapping("shake")
    override fun shakeForLeaf(): Mono<String>

    @MessageMapping("rake")
    override fun rakeForLeaves(): Flux<String>

    @MessageMapping("status")
    fun status(@AuthenticationPrincipal user: Mono<UserDetails>): Mono<String> =
            user.hasElement().map(Boolean::toString)
}
