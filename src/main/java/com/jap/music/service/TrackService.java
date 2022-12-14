package com.jap.music.service;

import com.jap.music.domain.Track;
import com.jap.music.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackService implements ITrackService {
    private final TrackRepository trackRepository;

    @Autowired
    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public List<Track> getAll() {
        return trackRepository.findAll();
    }

    @Override
    public Track save(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getTrackByName(String name) {
        return trackRepository.findByTrackName(name);
    }

    @Override
    public List<Track> getTrackByArtist(String artist) {
        return trackRepository.findByTrackArtist(artist);
    }

    @Override
    public Track update(int id, Track track) {
        Optional<Track> optTrack = trackRepository.findById(id);
        if (optTrack.isEmpty()) {
            return null;
        }
        Track existingTrack = optTrack.get();
        if (track.getTrackName() != null) {
            existingTrack.setTrackName(track.getTrackName());
        }
        if (track.getTrackComment() != null) {
            existingTrack.setTrackComment(track.getTrackComment());
        }
        if (track.getTrackRating() != 0.0) {
            existingTrack.setTrackRating(track.getTrackRating());
        }
        if (track.getTrackArtist() != null) {
            existingTrack.setTrackArtist(track.getTrackArtist());
        }
        return trackRepository.save(existingTrack);
    }

    @Override
    public void delete(int id) {
        Optional<Track> optTrack = trackRepository.findById(id);
        trackRepository.deleteById(id);
    }

    @Override
    public Optional<Track> getById(int id) {
        return trackRepository.findById(id);
    }
}
