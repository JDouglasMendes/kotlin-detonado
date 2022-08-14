package br.com.kotlindetonado.controller

import br.com.kotlindetonado.dto.HotelDto
import br.com.kotlindetonado.service.HotelService
import br.com.kotlindetonado.viewModel.HotelViewModel
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/hotel")
class HotelController(
    var service: HotelService
) {
    @PostMapping
    fun addNewHotel(@RequestBody input: HotelDto){
        service.addNewHotel(input)
    }

    @GetMapping
    fun getAll(): List<HotelViewModel> {
        return service.getAll()
    }
}