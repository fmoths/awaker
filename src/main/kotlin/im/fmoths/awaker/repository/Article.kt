package im.fmoths.awaker.repository

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Article(
    val subject: String,
    val url: String,
    val regTs: LocalDateTime,
    val updTs: LocalDateTime,
) {
    @Id
    var id: Long = 0
}