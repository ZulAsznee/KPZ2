public class KPZ2 {
    public static void main(String[] args) {
        CarSpec car1 = new CarSpec("Toyota", "AE333", 122, 100, 3000, 2.3, 4000);
        CarSpec car2 = new CarSpec("Fiat", "D45R", 130, 200, 3200, 2.7, 3000);
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car1));
        System.out.println(car1);
    }
}
