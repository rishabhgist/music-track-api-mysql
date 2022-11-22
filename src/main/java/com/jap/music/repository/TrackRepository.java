package com.jap.music.repository;

import com.jap.music.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Integer> {
    List<Track> findByTrackName(String name);
    List<Track> findByArtistName(String artist);

}
