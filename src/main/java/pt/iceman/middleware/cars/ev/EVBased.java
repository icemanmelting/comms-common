package pt.iceman.middleware.cars.ev;

import pt.iceman.middleware.cars.BaseCommand;

import java.nio.ByteBuffer;

public class EVBased extends BaseCommand {
    private int batteryLevelPercentage;

    public EVBased(ByteBuffer byteBuffer) {
        super(byteBuffer);

        this.batteryLevelPercentage = parseIntValue(byteBuffer);
    }

    public EVBased() {}

    public void setBatteryLevelPercentage(int batteryLevelPercentage) {
        this.batteryLevelPercentage = batteryLevelPercentage;
    }

    public int getBatteryLevelPercentage() {
        return batteryLevelPercentage;
    }
}
