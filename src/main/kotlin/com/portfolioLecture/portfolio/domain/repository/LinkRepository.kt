package com.portfolioLecture.portfolio.domain.repository

import com.portfolioLecture.portfolio.domain.entity.Achievement
import com.portfolioLecture.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>{

    fun findAllByIsActive(isActive: Boolean): List<Link>

}