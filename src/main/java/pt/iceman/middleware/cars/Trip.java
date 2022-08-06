package pt.iceman.middleware.cars;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

public class Trip implements Serializable {
    private UUID id;

    private UUID carId;
    private double startKm;
    private double endKm;
    private double startTemp;
    private double endTemp;

    private double startFuel;

    private double endFuel;
    private double maxTemp;

    private int maxSpeed;
    private double avgSpeed;
    private Date startTime;
    private Date endTime;

    private boolean saved;

    private boolean updated;

    private boolean initialized;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public double getStartKm() {
        return startKm;
    }

    public void setStartKm(double startKm) {
        this.startKm = startKm;
    }

    public double getEndKm() {
        return endKm;
    }

    public void setEndKm(double endKm) {
        this.endKm = endKm;
    }

    public double getStartTemp() {
        return startTemp;
    }

    public void setStartTemp(double startTemp) {
        this.startTemp = startTemp;
    }

    public double getEndTemp() {
        return endTemp;
    }

    public double getStartFuel() {
        return startFuel;
    }

    public void setStartFuel(double startFuel) {
        this.startFuel = startFuel;
    }

    public double getEndFuel() {
        return endFuel;
    }

    public void setEndFuel(double endFuel) {
        this.endFuel = endFuel;
    }

    public void setEndTemp(double endTemp) {
        this.endTemp = endTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean isFinished () {
        return !(endTime == null);
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public boolean isUpdated() {
        return updated;
    }

    public void setUpdated(boolean updated) {
        this.updated = updated;
    }
}
