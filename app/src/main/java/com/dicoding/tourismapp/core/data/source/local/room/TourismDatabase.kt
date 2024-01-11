package com.dicoding.tourismapp.core.data.source.local.room

import android.content.*
import androidx.room.*
import com.dicoding.tourismapp.core.data.source.local.entity.*

@Database(entities = [TourismEntity::class], version = 1, exportSchema = false)
abstract class TourismDatabase : RoomDatabase() {

    abstract fun tourismDao(): TourismDao

    companion object {
        @Volatile
        private var INSTANCE: TourismDatabase? = null

        fun getInstance(context: Context): TourismDatabase =
            INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                TourismDatabase::class.java,
                "com.dicoding.tourismapp.core.domain.model.Tourism.db"
            )
                .fallbackToDestructiveMigration()
                .build()
            INSTANCE = instance
            instance
        }
    }
}