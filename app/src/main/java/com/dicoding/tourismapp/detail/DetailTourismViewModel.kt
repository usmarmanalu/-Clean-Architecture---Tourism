package com.dicoding.tourismapp.detail

import androidx.lifecycle.*
import com.dicoding.tourismapp.core.domain.model.*
import com.dicoding.tourismapp.core.domain.usecase.*

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus: Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

