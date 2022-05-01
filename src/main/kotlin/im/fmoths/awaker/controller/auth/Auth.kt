package im.fmoths.awaker.controller.auth

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping
@RestController("/api/v1/auth")
class AuthController {

    @GetMapping("login")
    fun login(): String {
        return "test"
    }
}