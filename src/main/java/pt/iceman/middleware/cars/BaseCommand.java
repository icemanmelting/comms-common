package pt.iceman.middleware.cars;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.UUID;

public class BaseCommand implements Serializable {
    private UUID carId;

    private UUID tripId;

    private double tyreOffset;
    private boolean battery12vNotCharging;
    private boolean parkingBrakeOn;
    private boolean brakesHydraulicFluidLevelLow;
    private boolean turningSigns;
    private boolean absAnomaly;
    private boolean highBeamOn;
    private boolean ignition;
    private int speed;

    private double tripDistance;
    private double totalDistance;

    public BaseCommand(ByteBuffer bytebuffer) {
        byte battery = bytebuffer.get();
        this.battery12vNotCharging = battery == -1;

        byte parkingBrake = bytebuffer.get();
        this.parkingBrakeOn = parkingBrake == -1;

        byte brakes = bytebuffer.get();
        this.brakesHydraulicFluidLevelLow = brakes == -1;

        byte turningSigns = bytebuffer.get();
        this.turningSigns = turningSigns == -1;

        byte absAnomaly = bytebuffer.get();
        this.absAnomaly = absAnomaly == -1;

        byte highBeam = bytebuffer.get();
        this.highBeamOn = highBeam == -1;

        byte ignition = bytebuffer.get();
        this.ignition = ignition == -1;

        this.speed = parseIntValue(bytebuffer);
    }

    public BaseCommand() {}

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public UUID getTripId() {
        return tripId;
    }

    public void setTripId(UUID tripId) {
        this.tripId = tripId;
    }

    public double getTyreOffset() {
        return tyreOffset;
    }

    public void setTyreOffset(double tyreOffset) {
        this.tyreOffset = tyreOffset;
    }

    protected int parseIntValue(ByteBuffer byteBuffer) {
        byte[] byteValue = new byte[2];

        byteBuffer.get(byteValue);

        return byteValue[0] & 0xFF | (byteValue[1] << 8 & 0xFF00);
    }

    public double getTripDistance() {
        return tripDistance;
    }

    public void setTripDistance(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    public void setBattery12vNotCharging(boolean battery12vNotCharging) {
        this.battery12vNotCharging = battery12vNotCharging;
    }

    public void setParkingBrakeOn(boolean parkingBrakeOn) {
        this.parkingBrakeOn = parkingBrakeOn;
    }

    public void setBrakesHydraulicFluidLevelLow(boolean brakesHydraulicFluidLevelLow) {
        this.brakesHydraulicFluidLevelLow = brakesHydraulicFluidLevelLow;
    }

    public void setTurningSigns(boolean turningSigns) {
        this.turningSigns = turningSigns;
    }

    public void setAbsAnomaly(boolean absAnomaly) {
        this.absAnomaly = absAnomaly;
    }

    public void setHighBeamOn(boolean highBeamOn) {
        this.highBeamOn = highBeamOn;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isBattery12vNotCharging() {
        return battery12vNotCharging;
    }

    public boolean isParkingBrakeOn() {
        return parkingBrakeOn;
    }

    public boolean isBrakesHydraulicFluidLevelLow() {
        return brakesHydraulicFluidLevelLow;
    }

    public boolean isTurningSigns() {
        return turningSigns;
    }

    public boolean isAbsAnomaly() {
        return absAnomaly;
    }

    public boolean isHighBeamOn() {
        return highBeamOn;
    }

    public boolean isIgnition() {
        return ignition;
    }

    public int getSpeed() {
        return speed;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }
}
