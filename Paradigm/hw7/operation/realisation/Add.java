package Paradigm.hw7.operation.realisation;

import Paradigm.hw7.expression.TripleExpression;
import Paradigm.hw7.number.MyNumber;
import Paradigm.hw7.operation.BinaryOperation;

/**
 * Created by Blackbird
 */
public class Add<T> extends BinaryOperation<T> {
    public Add(TripleExpression<T> left, TripleExpression<T> right) {
        super(left, right);
    }


    protected MyNumber<T> evaluate(MyNumber<T> left, MyNumber<T> right) {
        return left.add(right);
    }
}
