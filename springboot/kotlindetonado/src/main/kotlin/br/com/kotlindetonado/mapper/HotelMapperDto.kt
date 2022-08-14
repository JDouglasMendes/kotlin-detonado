package br.com.kotlindetonado.mapper

import br.com.kotlindetonado.dto.HotelDto
import br.com.kotlindetonado.model.Hotel
import org.springframework.stereotype.Component

@Component
class HotelMapperDto : Mapper<Hotel, HotelDto> {

    override fun toOutput(input: Hotel): HotelDto {
        return HotelDto(
            input.description
        )
    }

    override fun toInput(output: HotelDto): Hotel {
        return  Hotel(
            null,
            output.description
        )
    }
}