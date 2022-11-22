package com.jap.music.service;

import com.jap.music.domain.Track;

import java.util.List;
import java.util.Optional;

public interface ITrackService {
    List<Track> getAll();
    Track save(Track track);
    List<Track> getTrackByName(String name);
    List<Track> getTrackByArtist(String artist);
    Track update(int id, Track track);
    void delete(int id);

    Optional<Track> getById(int id);
}
