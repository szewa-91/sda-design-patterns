package eu.marcinszewczyk.adapterexample;

public class MainAppAdapter {

    public static void main(String[] args) {

        UKSocket ukSocket = new UKSocket();
        UKDevice britishMeatGrinder = new BritishMeatGrinder();

        ContinentalSocket continentalSocket = new ContinentalSocket();
        ContinentalDevice laptop = new PolishLaptop();
//        continentalSocket.plugIn(laptop);

        continentalSocket.plugIn(new ContinentalBritishAdapter(britishMeatGrinder));
    }
}
