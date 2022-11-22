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
        return trackRepository.findByArtistName(artist);
    }

    @Override
    public Track update(int id, Track track) {
        Optional<Track> optTrack = trackRepository.findById(id);
        if (optTrack.isEmpty()) {
            return null;
        }
        Track existingTrack = optTrack.get();
        if (track.getName() != null) {
            existingTrack.setName(track.getName());
        }
        if (track.getComments() != null) {
            existingTrack.setComments(track.getComments());
        }
        if (track.getRating() != 0.0) {
            existingTrack.setRating(track.getRating());
        }
        if (track.getArtist() != null) {
            existingTrack.setArtist(track.getArtist());
        }
        return trackRepository.save(existingTrack);
    }

    @Override
    public void delete(int id) {
        trackRepository.deleteById(id);
    }

    @Override
    public Optional<Track> getById(int id) {
        return trackRepository.findById(id);
    }
}
