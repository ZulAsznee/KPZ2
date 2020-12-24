import java.util.Objects;

public final class CarSpec {
    private final String brand;
    private final String modification;
    private final double engineVolume;
    private final int enginePower;
    private final double wheelLength;
    private final double fuelConsumption;
    private final double weight;

    public CarSpec(String brand, String modification, double engineVolume, int enginePower, double wheelLenght, double fuelConsumption, double weight) {
        this.brand = brand;
        this.modification = modification;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.wheelLength = wheelLenght;
        this.fuelConsumption = fuelConsumption;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getModification() {
        return modification;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public double getWheelLength() {
        return wheelLength;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarSpec carSpec = (CarSpec) o;
        return Double.compare(carSpec.engineVolume, engineVolume) == 0 &&
                enginePower == carSpec.enginePower &&
                Double.compare(carSpec.wheelLength, wheelLength) == 0 &&
                Double.compare(carSpec.fuelConsumption, fuelConsumption) == 0 &&
                Double.compare(carSpec.weight, weight) == 0 &&
                Objects.equals(brand, carSpec.brand) &&
                Objects.equals(modification, carSpec.modification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, modification, engineVolume, enginePower, wheelLength, fuelConsumption, weight);
    }

    @Override
    public String toString() {
        return "CarSpec{" +
                "brand='" + brand + '\'' +
                ", modification='" + modification + '\'' +
                ", engineVolume=" + engineVolume +
                ", enginePower=" + enginePower +
                ", wheelLength=" + wheelLength +
                ", fuelConsumption=" + fuelConsumption +
                ", weight=" + weight +
                '}';
    }
}


