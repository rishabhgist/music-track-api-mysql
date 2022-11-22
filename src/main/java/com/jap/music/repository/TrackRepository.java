package com.jap.music.repository;

import com.jap.music.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TrackRepository extends JpaRepository<Track, Integer> {
    List<Track> findByTrackName(String name);
    List<Track> findByTrackArtist(String artist);

}
