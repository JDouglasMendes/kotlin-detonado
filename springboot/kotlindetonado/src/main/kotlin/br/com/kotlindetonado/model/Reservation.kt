package br.com.kotlindetonado.model

data class Reservation(
    var id: Long?,
    var hotel: Hotel,
    var people: ArrayList<User> = ArrayList()
)
