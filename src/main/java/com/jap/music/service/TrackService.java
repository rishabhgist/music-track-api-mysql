package com.jap.music.service;

import com.jap.music.domain.Track;
import com.jap.music.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackService implements ITrackService {
    private TrackRepository trackRepository;
    @Autowired
    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public List<Track> getAll() {
        return null;
    }

    @Override
    public Track save(Track track) {
        return null;
    }

    @Override
    public List<Track> getTrackByName(String name) {
        return null;
    }

    @Override
    public List<Track> getTrackByArtist(String artist) {
        return null;
    }

    @Override
    public Track update(int id, Track track) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
