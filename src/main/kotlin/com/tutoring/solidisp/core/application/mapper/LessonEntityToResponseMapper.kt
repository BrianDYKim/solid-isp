package com.tutoring.solidisp.core.application.mapper

import com.tutoring.solidisp.core.application.dto.LessonStart
import com.tutoring.solidisp.core.domain.Lesson
import org.springframework.stereotype.Component

/**
 * @author Brian
 * @since 1/26/24
 */
@Component
class LessonEntityToResponseMapper {
    fun mapCreateResponse(lesson: Lesson): LessonStart.Response = with(lesson) {
        LessonStart.Response(
            id = this.id,
            device = this.device,
            lessonType = this.lessonType,
            studentId = studentId,
            tutorId = tutorId
        )
    }
}