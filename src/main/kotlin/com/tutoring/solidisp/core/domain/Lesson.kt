package com.tutoring.solidisp.core.domain

import com.tutoring.solidisp.core.domain.enums.Device
import com.tutoring.solidisp.core.domain.enums.LessonType
import jakarta.persistence.*
import java.time.LocalDateTime

/**
 * @author Brian
 * @since 1/25/24
 */
@Entity
@Table(name = "lessons")
open class Lesson() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        protected set

    var studentId: Long = 0
        protected set

    var tutorId: Long = 0
        protected set

    @Enumerated(value = EnumType.STRING)
    @Column(name = "device", nullable = false)
    var device: Device = Device.ANDROID
        protected set

    @Enumerated(value = EnumType.STRING)
    @Column(name = "lesson_type", nullable = false)
    var lessonType: LessonType = LessonType.AUDIO
        protected set

    @Column(name = "started_at", nullable = true)
    var startedAt: LocalDateTime? = null
        protected set

    @Column(name = "finished_at", nullable = true)
    var finishedAt: LocalDateTime? = null
        protected set

    constructor(
        id: Long,
        studentId: Long,
        tutorId: Long,
        device: Device,
        lessonType: LessonType,
        startedAt: LocalDateTime?,
        finishedAt: LocalDateTime?
    ) : this() {
        this.id = id
        this.studentId = studentId
        this.tutorId = tutorId
        this.device = device
        this.lessonType = lessonType
        this.startedAt = startedAt
        this.finishedAt = finishedAt
    }
}