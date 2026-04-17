package com.examen.ultimatejereztiming.data.repository

import com.examen.ultimatejereztiming.data.GuideDataSource
import com.examen.ultimatejereztiming.data.model.GuideTopic
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GuideRepositoryImpl @Inject constructor(
    private val localDataSource: GuideDataSource
) : GuideRepository {

    override fun getTopics(): Flow<Result<List<GuideTopic>>> {
        return localDataSource.getTopics()
    }

    override suspend fun getTopic(id: String): Result<GuideTopic> {
        return localDataSource.getTopic(id)
    }
}
