package com.tutoring.solidisp.core.application.dto

import com.tutoring.solidisp.core.domain.enums.Device
import com.tutoring.solidisp.core.domain.enums.LessonType
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull

/**
 * @author Brian
 * @since 1/26/24
 */
sealed class LessonStart {
    data class Request(
        @NotNull
        val device: Device,
        @NotNull
        val lessonType: LessonType,
        @NotNull
        @Min(value = 1)
        val studentId: Long,
        @NotNull
        @Min(value = 1)
        val tutorId: Long
    )

    data class Response(
        val id: Long,
        val device: Device,
        val lessonType: LessonType,
        val studentId: Long,
        val tutorId: Long
    )
}