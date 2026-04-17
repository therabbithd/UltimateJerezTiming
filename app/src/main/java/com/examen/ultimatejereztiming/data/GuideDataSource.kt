package com.examen.ultimatejereztiming.data

import com.examen.ultimatejereztiming.data.model.GuideTopic
import kotlinx.coroutines.flow.Flow

interface GuideDataSource {
    fun getTopics(): Flow<Result<List<GuideTopic>>>
    suspend fun getTopic(id: String): Result<GuideTopic>
}
