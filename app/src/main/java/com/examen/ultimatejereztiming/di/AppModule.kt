package com.examen.ultimatejereztiming.di

import com.examen.ultimatejereztiming.data.GuideDataSource
import com.examen.ultimatejereztiming.data.local.LocalGuideDataSource
import com.examen.ultimatejereztiming.data.repository.GuideRepository
import com.examen.ultimatejereztiming.data.repository.GuideRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindGuideDataSource(dataSource: LocalGuideDataSource): GuideDataSource

    @Binds
    @Singleton
    abstract fun bindGuideRepository(repository: GuideRepositoryImpl): GuideRepository
}
