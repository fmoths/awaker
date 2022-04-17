package im.fmoths.awaker.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api-batch/v1")
class SendMessageBatchController {

    @PostMapping("/messages")
    fun startSendMessageBatch() {
        println("test")
    }
}