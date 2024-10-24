package com.portfolioLecture.portfolio.domain.repository

import com.portfolioLecture.portfolio.domain.entity.Achievement
import com.portfolioLecture.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long>{

    // select * from introduction where is_active = :is_active
    fun findAllByIsActive(isActive: Boolean): List<Introduction>

}