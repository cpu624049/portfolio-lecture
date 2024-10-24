package com.portfolioLecture.portfolio.domain.repository

import com.portfolioLecture.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long>{

    // select * from achievement where is_active = :is_active
    fun findAllByIsActive(isActive: Boolean): List<Achievement>

}