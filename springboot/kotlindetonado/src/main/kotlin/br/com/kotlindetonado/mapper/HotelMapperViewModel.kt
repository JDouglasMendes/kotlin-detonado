package br.com.kotlindetonado.mapper

import br.com.kotlindetonado.model.Hotel
import br.com.kotlindetonado.viewModel.HotelViewModel
import org.springframework.stereotype.Component

@Component
class HotelMapperViewModel : Mapper<Hotel, HotelViewModel> {
    override fun toOutput(input: Hotel): HotelViewModel {
        return  HotelViewModel(
            input.id,
            input.description,
        )
    }

    override fun toInput(output: HotelViewModel): Hotel {
        return  Hotel(
            output.id,
            output.description
        )
    }
}