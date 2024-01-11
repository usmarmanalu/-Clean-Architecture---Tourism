package com.dicoding.tourismapp.core.domain.repository

import androidx.lifecycle.*
import com.dicoding.tourismapp.core.data.*
import com.dicoding.tourismapp.core.domain.model.*

interface ITourismRepository {

    fun getAllTourism(): LiveData<Resource<List<Tourism>>>

    fun getFavoriteTourism(): LiveData<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)

}