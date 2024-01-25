package com.tutoring.solidisp.core.application.mapper

import com.tutoring.solidisp.core.application.dto.LessonStart
import com.tutoring.solidisp.core.domain.Lesson
import org.springframework.stereotype.Component
import java.time.LocalDateTime

/**
 * @author Brian
 * @since 1/26/24
 */
@Component
class LessonRequestToEntityMapper {
    fun mapCreateRequest(request: LessonStart.Request): Lesson = with(request) {
        Lesson(
            id = 0,
            studentId = this.studentId,
            tutorId = this.tutorId,
            device = this.device,
            lessonType = this.lessonType,
            LocalDateTime.now(),
            finishedAt = null
        )
    }
}