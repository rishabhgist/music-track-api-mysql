package com.jap.music.service;

import com.jap.music.repository.TrackRepository;
import org.springframework.stereotype.Service;

@Service
public class TrackService {
    private TrackRepository trackRepository;

    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }
}
