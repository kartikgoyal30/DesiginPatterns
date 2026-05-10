public class AbstractFactoryPattern {
        // Abstract Factory pattern is a design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.
        // It allows you to create objects that belong to a particular family or theme, ensuring that the created objects are compatible with each other.
        // The Abstract Factory pattern typically involves the following components:
        // 1. Abstract Factory: An interface that declares methods for creating abstract products.
        // 2. Concrete Factory: A class that implements the Abstract Factory interface and creates concrete products.
        // 3. Abstract Product: An interface that declares methods for a type of product.
        // 4. Concrete Product: A class that implements the Abstract Product interface and defines a product to be created by the corresponding concrete factory.

        // Example usage:
        interface Burger {
            void Bun();
            void Patty();
            void Sauce();
            void Cheese();
            void getBurger();
        }
        interface Drink {
            void Type();
            void Size();
        }
        static class VegBurger implements Burger {
            @Override
            public void Bun() {
                System.out.println("Veg Burger Bun");
            }
            @Override
            public void Patty() {
                System.out.println("Veg Burger Patty");
            }
            @Override
            public void Sauce() {
                System.out.println("Veg Burger Sauce");
            }
            @Override
            public void Cheese() {
                System.out.println("Veg Burger Cheese");
            }
            @Override
            public void getBurger() {
                System.out.println("Getting Veg Burger");
            }
        }
        static class ChickenBurger implements Burger {
            @Override
            public void Bun() {
                System.out.println("Chicken Burger Bun");
            }
            @Override
            public void Patty() {
                System.out.println("Chicken Burger Patty");
            }
            @Override
            public void Sauce() {
                System.out.println("Chicken Burger Sauce");
            }
            @Override
            public void Cheese() {
                System.out.println("Chicken Burger Cheese");
            }
            @Override
            public void getBurger() {
                System.out.println("Getting Chicken Burger");
            }
        }
        static class Cola implements Drink {
            @Override
            public void Type() {
                System.out.println("Cola Type");
            }
            @Override
            public void Size() {
                System.out.println("Cola Size");
            }
        }
        static class Juice implements Drink {
            @Override
            public void Type() {
                System.out.println("Juice Type");
            }
            @Override
            public void Size() {
                System.out.println("Juice Size");
            }
        }
        interface FastFoodFactory {
            Burger createBurger();
            Drink createDrink();
        }
        static class VegFastFoodFactory implements FastFoodFactory {
            @Override
            public Burger createBurger() {
                return new VegBurger();
            }
            @Override
            public Drink createDrink() {
                return new Juice();
            }
        }
}