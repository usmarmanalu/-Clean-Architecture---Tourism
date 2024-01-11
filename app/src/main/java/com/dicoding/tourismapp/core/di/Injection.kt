package com.dicoding.tourismapp.core.di

import android.content.*
import com.dicoding.tourismapp.core.data.*
import com.dicoding.tourismapp.core.data.source.local.*
import com.dicoding.tourismapp.core.data.source.local.room.*
import com.dicoding.tourismapp.core.data.source.remote.*
import com.dicoding.tourismapp.core.domain.repository.*
import com.dicoding.tourismapp.core.domain.usecase.*
import com.dicoding.tourismapp.core.utils.*

object Injection {
    private fun provideRepository(context: Context): ITourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideTourismUseCase(context: Context): TourismUseCase {
        val repository = provideRepository(context)
        return TourismInteractor(repository)
    }
}
