package pt.iceman.middleware.cars;

import java.io.Serializable;
import java.nio.ByteBuffer;

public class BaseCommand implements Serializable {
    private final boolean battery12vNotCharging;
    private final boolean parkingBrakeOn;
    private final boolean brakesHydraulicFluidLevelLow;
    private final boolean turningSigns;
    private final boolean absAnomaly;
    private final boolean highBeamOn;
    private final boolean ignition;
    private final int speed;
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

    protected int parseIntValue(ByteBuffer byteBuffer) {
        byte[] byteValue = new byte[2];

        byteBuffer.get(byteValue);

        return byteValue[0] & 0xFF | (byteValue[1] << 8 & 0xFF00);
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
