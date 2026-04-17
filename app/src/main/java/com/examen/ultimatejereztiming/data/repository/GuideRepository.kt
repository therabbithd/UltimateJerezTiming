package com.examen.ultimatejereztiming.data.repository

import com.examen.ultimatejereztiming.data.model.GuideTopic
import kotlinx.coroutines.flow.Flow

interface GuideRepository {
    fun getTopics(): Flow<Result<List<GuideTopic>>>
    suspend fun getTopic(id: String): Result<GuideTopic>
}
