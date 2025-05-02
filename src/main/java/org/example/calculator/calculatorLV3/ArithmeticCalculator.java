package org.example.calculator.calculatorLV3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArithmeticCalculator<T> {

  private List<T> resultList = new ArrayList<>();

  public Optional<Double> calculate(T a, T b, char operator) {
    OperatorType op = OperatorType.fromSymbol(operator);
    if(op==null)  return Optional.empty();

    if(a instanceof Number && b instanceof Number)  return op.operate((double)a, (double)b);

    return Optional.empty();
  }

  // getter
  public List<T> getResultList() {
    return resultList;
  }

  // setter
  public void setResultList(List<T> resultList) {
    this.resultList=resultList;
  }

  // delete
  public void removeResult() {
    if (!resultList.isEmpty()) {
      resultList.remove(0);
    }
  }
}


