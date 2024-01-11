package com.dicoding.tourismapp.home

import androidx.lifecycle.*
import com.dicoding.tourismapp.core.domain.usecase.*

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val tourism = tourismUseCase.getAllTourism()

}

