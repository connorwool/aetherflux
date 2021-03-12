package com.connorwool.aetherflux.backend;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class TrackDatastore {
    private Map<UUID, Track> tracks = new HashMap<>();

    public Optional<Track> getTrack(UUID id){
        return Optional.ofNullable(tracks.get(id));
    }
}
