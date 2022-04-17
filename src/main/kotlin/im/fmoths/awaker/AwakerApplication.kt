package im.fmoths.awaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AwakerApplication

fun main(args: Array<String>) {
	runApplication<AwakerApplication>(*args)
}
