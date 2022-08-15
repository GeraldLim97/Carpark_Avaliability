package sg.edu.rp.c346.id21037552.carpark_avaliability;

public class Carpark {
    String carpark_info;

    public Carpark(String carpark_info) {
        this.carpark_info = carpark_info;
    }

    public String getCarpark_info() {
        return carpark_info;
    }

    public void setCarpark(String carpark_info) {
        this.carpark_info = carpark_info;
    }

    @Override
    public String toString() {
        return "CARPARK" + "\n" + "Lots info: " + carpark_info;
    }
}
