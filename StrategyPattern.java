public class StrategyPattern{
    // Strategy Interface
    // This interface defines a common method for all concrete strategies to implement.
    interface Strategy {
        int doOperation(int num1, int num2);
    }
    // Context Class
    static class Context {
        private Strategy strategy;
        public Context(Strategy strategy) {
            this.strategy = strategy;
        }
        public int executeStrategy(int num1, int num2) {
            return strategy.doOperation(num1, num2);
        }
    }
    // Concrete Strategy Classes
    static class AdditionStrategy implements Strategy {
        @Override
        public int doOperation(int num1, int num2) {
            return num1 + num2;
        }
    }
    static class SubtractionStrategy implements Strategy {
        @Override
        public int doOperation(int num1, int num2) {
            return num1 - num2;
        }
    }
}