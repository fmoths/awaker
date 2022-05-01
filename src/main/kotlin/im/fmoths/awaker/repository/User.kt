package im.fmoths.awaker.repository

import javax.persistence.*

@Entity
class User(
    @Column(name = "email")
    val email: String,
    @Column(name = "username")
    val username: String,
    @Column(name = "profile_photo_url")
    val profilePhotoUrl: String,
    @Column(name = "email_provide_agreement_yn")
    val emailProvideAgreementYn: Boolean,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L
}