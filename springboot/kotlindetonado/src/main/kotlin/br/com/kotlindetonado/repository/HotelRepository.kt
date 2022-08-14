package br.com.kotlindetonado.repository

import br.com.kotlindetonado.model.Hotel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HotelRepository : JpaRepository<Hotel, Long>{
}