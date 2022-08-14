package br.com.kotlindetonado.service

import br.com.kotlindetonado.dto.HotelDto
import br.com.kotlindetonado.mapper.HotelMapperDto
import br.com.kotlindetonado.mapper.HotelMapperViewModel
import br.com.kotlindetonado.repository.HotelRepository
import br.com.kotlindetonado.viewModel.HotelViewModel
import org.springframework.stereotype.Service

@Service
class HotelService (
    private val repository: HotelRepository,
    private var mapperDto:  HotelMapperDto,
    private  var mapperViewModel: HotelMapperViewModel
        ) {

    fun addNewHotel(input: HotelDto){
        repository.save(mapperDto.toInput(input))
    }

    fun getAll() : List<HotelViewModel>{
       return repository.findAll().map { x -> mapperViewModel.toOutput(x) }
    }

}