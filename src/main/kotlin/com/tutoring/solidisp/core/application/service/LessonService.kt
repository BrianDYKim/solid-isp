package com.tutoring.solidisp.core.application.service

import com.tutoring.solidisp.core.application.dto.LessonStart
import com.tutoring.solidisp.core.application.mapper.LessonEntityToResponseMapper
import com.tutoring.solidisp.core.application.mapper.LessonRequestToEntityMapper
import com.tutoring.solidisp.core.domain.repository.LessonJpaRepository
import com.tutoring.solidisp.external.messaging.ExternalMessagingManager
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

/**
 * @author Brian
 * @since 1/26/24
 */
@Service
@Transactional
class LessonService(
    private val lessonRepository: LessonJpaRepository,
    private val messagingManager: ExternalMessagingManager,
    private val requestToEntityMapper: LessonRequestToEntityMapper,
    private val entityToResponseMapper: LessonEntityToResponseMapper
) {
    fun startLesson(request: LessonStart.Request): LessonStart.Response {
        val lesson = requestToEntityMapper.mapCreateRequest(request)

        val savedLesson = lessonRepository.save(lesson)

        // 푸시 메시지 발송
        messagingManager.getSender(savedLesson.device.pushType).send("수업 시작")

        return entityToResponseMapper.mapCreateResponse(savedLesson)
    }
}