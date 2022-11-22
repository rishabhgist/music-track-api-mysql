package com.jap.music.service;

import com.jap.music.domain.Track;

import java.util.List;

public interface ITrackService {
    List<Track> getAll();
    Track save(Track track);
    List<Track> getTrackByName(String name);
    List<Track> getTrackByArtist(String artist);
    Track update(int id, Track track);
    boolean delete(int id);
}
