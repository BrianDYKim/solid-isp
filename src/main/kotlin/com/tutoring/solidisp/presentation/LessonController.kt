package com.tutoring.solidisp.presentation

import com.tutoring.solidisp.core.application.dto.LessonStart
import com.tutoring.solidisp.core.application.service.LessonService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Brian
 * @since 1/26/24
 */
@RestController
@RequestMapping("/api/lesson")
class LessonController(private val lessonService: LessonService) {
    @PostMapping("/")
    fun startLesson(@RequestBody request: LessonStart.Request): LessonStart.Response {
        return lessonService.startLesson(request)
    }
}