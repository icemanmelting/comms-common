package pt.iceman.middleware.cars.ice;

import pt.iceman.middleware.cars.BaseCommand;

import java.nio.ByteBuffer;

public class ICEBased extends BaseCommand {
    private boolean oilPressureLow;
    private boolean sparkPlugOn;
    private int rpmAnalogLevel;
    private int fuelAnalogLevel;
    private int engineTemperatureAnalogLevel;
    private int rpm;
    private int fuelLevel;
    private double engineTemperature;

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

    public ICEBased() {
        super();
    }

    public void setOilPressureLow(boolean oilPressureLow) {
        this.oilPressureLow = oilPressureLow;
    }

    public void setSparkPlugOn(boolean sparkPlugOn) {
        this.sparkPlugOn = sparkPlugOn;
    }

    public void setRpmAnalogLevel(int rpmAnalogLevel) {
        this.rpmAnalogLevel = rpmAnalogLevel;
    }

    public void setFuelAnalogLevel(int fuelAnalogLevel) {
        this.fuelAnalogLevel = fuelAnalogLevel;
    }

    public void setEngineTemperatureAnalogLevel(int engineTemperatureAnalogLevel) {
        this.engineTemperatureAnalogLevel = engineTemperatureAnalogLevel;
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

    public double getEngineTemperature() {
        return engineTemperature;
    }

    public void setEngineTemperature(double engineTemperature) {
        this.engineTemperature = engineTemperature;
    }
}
