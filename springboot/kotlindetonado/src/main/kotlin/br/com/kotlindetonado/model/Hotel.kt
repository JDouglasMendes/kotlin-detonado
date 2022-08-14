package br.com.kotlindetonado.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Hotel(
    @Id @GeneratedValue var id: Long?,
    var description: String,
)