public class BuilderPattern{
    // Builder pattern is a design pattern that allows for the step-by-step construction of complex objects.
    // It separates the construction of an object from its representation,
    // allowing the same construction process to create different representations.
    // The builder pattern typically involves a builder class that provides methods
    // for configuring the various parts of the object being built.
    static class Product {
        private String partA;
        private String partB;
        private String partC;

        public void setPartA(String partA) {
            this.partA = partA;
        }

        public void setPartB(String partB) {
            this.partB = partB;
        }

        public void setPartC(String partC) {
            this.partC = partC;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "partA='" + partA + '\'' +
                    ", partB='" + partB + '\'' +
                    ", partC='" + partC + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Product product = new Product();
        product.setPartA("Part A");
        product.setPartB("Part B");
        product.setPartC("Part C");
        System.out.println(product); // Product{partA='Part A', partB='Part B', partC='Part C'} 
    }
}