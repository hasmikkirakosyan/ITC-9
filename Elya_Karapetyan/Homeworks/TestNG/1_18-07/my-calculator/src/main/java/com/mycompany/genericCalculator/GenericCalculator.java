package com.mycompany.genericCalculator;

public class GenericCalculator<T extends Number> {
    public static <T extends Number> T addNum(T firstNumber, T secondNumber) {
        String type = firstNumber.getClass().getTypeName();
        Number result = 0;
        if (type == "java.lang.Integer") {
            result= firstNumber.intValue() + secondNumber.intValue();
            return (T) result;
        }
        if (type == "java.lang.Float") {
            result = firstNumber.floatValue() + secondNumber.floatValue();
            return (T) result;
        }
        if (type == "java.lang.Double") {
            result = firstNumber.doubleValue() + secondNumber.doubleValue();
            return (T) result;
        }
        return null;
    }

    public static <T extends Number> T subNum(T firstNumber, T secondNumber) {
        String type = firstNumber.getClass().getTypeName();
        Number result = 0;
        if (type == "java.lang.Integer") {
            result = firstNumber.intValue() - secondNumber.intValue();
            return (T) result;
        }
        if (type == "java.lang.Float") {
            result = firstNumber.floatValue() - secondNumber.floatValue();
            return (T) result;
        }
        if (type == "java.lang.Double") {
            result = firstNumber.doubleValue() - secondNumber.doubleValue();
            return (T) result;
        }
        return null;
    }
    public static <T extends Number> T multNum(T firstNumber, T secondNumber) {
        String type = firstNumber.getClass().getTypeName();
        Number result = 0;
        if (type == "java.lang.Integer") {
            result = firstNumber.intValue() * secondNumber.intValue();
            return (T) result;
        }
        if (type == "java.lang.Float") {
            result = firstNumber.floatValue() * secondNumber.floatValue();
            return (T) result;
        }
        if (type == "java.lang.Double") {
            result = firstNumber.doubleValue() * secondNumber.doubleValue();
            return (T) result;
        }
        return null;
    }
    public static <T extends Number> T dividNum(T firstNumber, T secondNumber) throws ArithmeticException {
        String type = firstNumber.getClass().getTypeName();
        Number result = 0;
            if (type == "java.lang.Integer") {
                result = firstNumber.intValue() / secondNumber.intValue();
                return (T) result;
            }
            if (type == "java.lang.Float") {
                result = firstNumber.floatValue() / secondNumber.floatValue();
                return (T) result;
            }
            if (type == "java.lang.Double") {
                result = firstNumber.doubleValue() / secondNumber.doubleValue();
                return (T) result;
            }
            return null;
    }
}
