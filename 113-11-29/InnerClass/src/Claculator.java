public class Claculator {
    class Operation {
        public int add(int a,int b){
            return a+b;
        }
        public int subtract(int a,int b){
            return a - b;
        }
        public int mutiply(int a,int b){
            return a * b;
        }
        public int divide(int a,int b){
            return a / b;
        }
    }

    public void performOperations(int a,String operator,int b){
        Operation operation = new Operation();
        switch (operator){
            case "+" -> System.out.println(operation.add(a,b));
            case "-" -> System.out.println(operation.subtract(a,b));
            case "*" -> System.out.println(operation.mutiply(a,b));
            case "/" -> System.out.println(operation.divide(a,b));
            default -> System.out.printf("不支援此操作");
        }
    }
}
