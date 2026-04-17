package com.examen.ultimatejereztiming.data.local

import com.examen.ultimatejereztiming.data.GuideDataSource
import com.examen.ultimatejereztiming.data.model.ContentType
import com.examen.ultimatejereztiming.data.model.GuideTopic
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class LocalGuideDataSource @Inject constructor() : GuideDataSource {

    override fun getTopics(): Flow<Result<List<GuideTopic>>> {
        return flowOf(Result.success(GuideData.topics))
    }

    override suspend fun getTopic(id: String): Result<GuideTopic> {
        val topic = GuideData.topics.find { it.id == id }
        return if (topic != null) {
            Result.success(topic)
        } else {
            Result.failure(Exception("Topic not found"))
        }
    }
}
