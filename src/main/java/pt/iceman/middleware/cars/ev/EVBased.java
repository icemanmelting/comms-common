package pt.iceman.middleware.cars.ev;

import pt.iceman.middleware.cars.BaseCommand;

import java.nio.ByteBuffer;

public class EVBased extends BaseCommand {
    private final int batteryLevelPercentage;

    public EVBased(ByteBuffer byteBuffer) {
        super(byteBuffer);

        this.batteryLevelPercentage = parseIntValue(byteBuffer);
    }

    public int getBatteryLevelPercentage() {
        return batteryLevelPercentage;
    }
}
