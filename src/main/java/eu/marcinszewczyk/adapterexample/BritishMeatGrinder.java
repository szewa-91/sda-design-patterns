package eu.marcinszewczyk.adapterexample;

public class BritishMeatGrinder implements UKDevice {
    @Override
    public void powerOn() {
        System.out.println("Brytyjska maszynka do mięsa zasuwa");
    }
}
