package com.plesk.conferencedemo.repositories;

import com.plesk.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerReepository extends JpaRepository<Speaker, Long> {

}
