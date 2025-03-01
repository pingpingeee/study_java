package java_pjt.chapter07_generic;

public class ProductExample {
    public static void main(String[] args) {
        Product<TV, String> product1 = new Product<>();
        product1.setKind((new TV()));
        product1.setModel("스마트TV");

        TV tv = product1.getKind();
        System.out.println(tv);
        String tvModel = product1.getModel();
        System.out.println(tvModel);

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("디젤");

        Car car = product2.getKind();
        System.out.println(car);
        String carModel = product2.getModel();
        System.out.println(carModel);
    }
}
