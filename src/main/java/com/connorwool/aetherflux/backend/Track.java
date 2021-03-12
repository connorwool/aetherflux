package com.connorwool.aetherflux.backend;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.measure.quantity.Acceleration;
import javax.measure.quantity.Angle;
import javax.measure.quantity.Velocity;
import org.jscience.geography.coordinates.Altitude;
import org.jscience.geography.coordinates.LatLong;
import org.jscience.geography.coordinates.Time;

public class Track {
    private final UUID id;
    private final Time timeOfLastUpdate;
    private final LatLong latLong;
    private final Altitude altitude;
    private final Velocity velocityNorth;
    private final Velocity velocityEast;
    private final Velocity velocityDown;
    private final Acceleration accelerationNorth;
    private final Acceleration accelerationEast;
    private final Acceleration accelerationDown;
    private final Angle course;

    private Track(TrackBuilder builder) {
        this.id = builder.id;
        this.timeOfLastUpdate = builder.timeOfLastUpdate;
        this.latLong = builder.latLong;
        this.altitude = builder.altitude;
        this.velocityNorth =  builder.velocityNorth;
        this.velocityEast = builder.velocityEast;
        this.velocityDown = builder.velocityDown;
        this.accelerationNorth = builder.accelerationNorth;
        this.accelerationEast = builder.accelerationEast;
        this.accelerationDown = builder.accelerationDown;
        this.course = builder.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return id.equals(track.id) && timeOfLastUpdate.equals(track.timeOfLastUpdate) && latLong.equals(track.latLong) && Objects.equals(altitude, track.altitude) && Objects.equals(velocityNorth, track.velocityNorth) && Objects.equals(velocityEast, track.velocityEast) && Objects.equals(velocityDown, track.velocityDown) && Objects.equals(accelerationNorth, track.accelerationNorth) && Objects.equals(accelerationEast, track.accelerationEast) && Objects.equals(accelerationDown, track.accelerationDown) && Objects.equals(course, track.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timeOfLastUpdate, latLong, altitude, velocityNorth, velocityEast, velocityDown, accelerationNorth, accelerationEast, accelerationDown, course);
    }

    public Optional<Time> getTimeOfLastUpdate() {
        return Optional.ofNullable(timeOfLastUpdate);
    }

    public Optional<LatLong> getLatLong() {
        return Optional.ofNullable(latLong);
    }

    public Optional<Altitude> getAltitude() {
        return Optional.ofNullable(altitude);
    }

    public Optional<Velocity> getVelocityNorth() {
        return Optional.ofNullable(velocityNorth);
    }

    public Optional<Velocity> getVelocityEast() {
        return Optional.ofNullable(velocityEast);
    }

    public Optional<Velocity> getVelocityDown() {
        return Optional.ofNullable(velocityDown);
    }

    public Optional<Acceleration> getAccelerationNorth() {
        return Optional.ofNullable(accelerationNorth);
    }

    public Optional<Acceleration> getAccelerationEast() {
        return Optional.ofNullable(accelerationEast);
    }

    public Optional<Acceleration> getAccelerationDown() {
        return Optional.ofNullable(accelerationDown);
    }

    public Optional<Angle> getCourse() {
        return Optional.ofNullable(course);
    }

    public static class TrackBuilder {
        private UUID id;
        private Time timeOfLastUpdate;
        private LatLong latLong;
        private Altitude altitude;
        private Velocity velocityNorth;
        private Velocity velocityEast;
        private Velocity velocityDown;
        private Acceleration accelerationNorth;
        private Acceleration accelerationEast;
        private Acceleration accelerationDown;
        private Angle course;

        public TrackBuilder(Track source){
            this.id = source.id;
            this.timeOfLastUpdate = source.timeOfLastUpdate;
            this.latLong = source.latLong;
            this.altitude = source.altitude;
            this.velocityNorth = source.velocityNorth;
            this.velocityEast = source.velocityEast;
            this.velocityDown = source.velocityDown;
            this.accelerationNorth = source.accelerationNorth;
            this.accelerationEast = source.accelerationEast;
            this.accelerationDown = source.accelerationDown;
            this.course = source.course;
        }

        public TrackBuilder setTimeOfLastUpdate(Time timeOfLastUpdate) {
            this.timeOfLastUpdate = timeOfLastUpdate;
            return this;
        }

        public TrackBuilder setLatLong(LatLong latLong) {
            this.latLong = latLong;
            return this;
        }

        public TrackBuilder setAltitude(Altitude altitude) {
            this.altitude = altitude;
            return this;
        }

        public TrackBuilder setVelocityNorth(Velocity velocityNorth) {
            this.velocityNorth = velocityNorth;
            return this;
        }

        public TrackBuilder setVelocityEast(Velocity velocityEast) {
            this.velocityEast = velocityEast;
            return this;
        }

        public TrackBuilder setVelocityDown(Velocity velocityDown) {
            this.velocityDown = velocityDown;
            return this;
        }

        public TrackBuilder setAccelerationNorth(Acceleration accelerationNorth) {
            this.accelerationNorth = accelerationNorth;
            return this;
        }

        public TrackBuilder setAccelerationEast(Acceleration accelerationEast) {
            this.accelerationEast = accelerationEast;
            return this;
        }

        public TrackBuilder setAccelerationDown(Acceleration accelerationDown) {
            this.accelerationDown = accelerationDown;
            return this;
        }

        public TrackBuilder setCourse(Angle course) {
            this.course = course;
            return this;
        }

        public Track build() {
            if(this.id == null){
                this.id = UUID.randomUUID();
            }
            return new Track(this);
        }
    }
}
