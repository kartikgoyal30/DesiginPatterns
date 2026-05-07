 class FactoryPattern{

    // Factory method to create objects based on input
    // Factory pattern is a design pattern that provides an interface for creating objects
    // in a superclass,
    // but allows subclasses to alter the type of objects that will be created.
    private static Product createProduct(String b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public static class Product {
        public void use() {
            System.out.println("Using product");
        }
    }
    public class ProductA extends Product {
        @Override
        public void use() {
            System.out.println("Using Product A");
        }
    }
    public class ProductB extends Product {
        @Override
        public void use() {
            System.out.println("Using Product B");
        }
    }
    public  Product createProduct(String type) {
        if (type.equalsIgnoreCase("A")) {
            return new ProductA();
        } else if (type.equalsIgnoreCase("B")) {
            return new ProductB();
        } else {
            throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
    public static void main(String[] args) {
        Product productA = FactoryPattern.createProduct("A");
        Product productB = FactoryPattern.createProduct("B");
        productA.use(); // Using Product A
        productB.use(); // Using Product B
    }
}