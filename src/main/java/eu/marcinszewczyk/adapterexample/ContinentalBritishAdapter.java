package eu.marcinszewczyk.adapterexample;

public class ContinentalBritishAdapter implements ContinentalDevice {
    private UKDevice ukDevice;

    public ContinentalBritishAdapter(UKDevice ukDevice) {
        this.ukDevice = ukDevice;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }
}
