package com.tutoring.solidisp.core.domain.repository

import com.tutoring.solidisp.core.domain.Lesson
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author Brian
 * @since 1/26/24
 */
@Repository
interface LessonJpaRepository : JpaRepository<Lesson, Long> {
}