// src/Computer.java

public class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
               ", Graphics Card=" + (isGraphicsCardEnabled ? "Enabled" : "Disabled") +
               ", Bluetooth=" + (isBluetoothEnabled ? "Enabled" : "Disabled") + "]";
    }

    public static class Builder {
        private final String CPU; // Required
        private final String RAM;  // Required
        private String storage; 
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder bluetooth(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
