package com.pluralsight.conference.demo.repositories;

import com.pluralsight.conference.demo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ivan Kaptue (ivanokaptue@gmail.com)
 */
public interface SessionRepository extends JpaRepository<Session, Long> {
}
