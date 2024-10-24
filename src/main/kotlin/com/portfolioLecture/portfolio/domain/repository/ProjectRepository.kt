package com.portfolioLecture.portfolio.domain.repository

import com.portfolioLecture.portfolio.domain.entity.Experience
import com.portfolioLecture.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ProjectRepository : JpaRepository<Project, Long>{

    fun findAllByIsActive(isActive: Boolean): List<Project>

}