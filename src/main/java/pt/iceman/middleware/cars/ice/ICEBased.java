package pt.iceman.middleware.cars.ice;

import pt.iceman.middleware.cars.BaseCommand;

import java.nio.ByteBuffer;

public class ICEBased extends BaseCommand {
    private final boolean oilPressureLow;
    private final boolean sparkPlugOn;
    private final int rpmAnalogLevel;
    private final int fuelAnalogLevel;
    private final int engineTemperatureAnalogLevel;
    private int rpm;
    private int fuelLevel;
    private int engineTemperature;

    public ICEBased(ByteBuffer bytebuffer) {
        super(bytebuffer);

        byte oilPressure = bytebuffer.get();
        this.oilPressureLow = oilPressure == -1;

        byte sparkPlug = bytebuffer.get();
        this.sparkPlugOn = sparkPlug == -1;

        this.rpmAnalogLevel = parseIntValue(bytebuffer);
        this.fuelAnalogLevel = parseIntValue(bytebuffer);
        this.engineTemperatureAnalogLevel = parseIntValue(bytebuffer);
    }

    public boolean isOilPressureLow() {
        return oilPressureLow;
    }

    public boolean isSparkPlugOn() {
        return sparkPlugOn;
    }

    public int getRpmAnalogLevel() {
        return rpmAnalogLevel;
    }

    public int getFuelAnalogLevel() {
        return fuelAnalogLevel;
    }

    public int getEngineTemperatureAnalogLevel() {
        return engineTemperatureAnalogLevel;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getEngineTemperature() {
        return engineTemperature;
    }

    public void setEngineTemperature(int engineTemperature) {
        this.engineTemperature = engineTemperature;
    }
}
