package com.pluralsight.conference.demo.repositories;

import com.pluralsight.conference.demo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ivan Kaptue (ivanokaptue@gmail.com)
 */
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
