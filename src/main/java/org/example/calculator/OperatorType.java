package org.example.calculator;

public enum OperatorType {
  ADD('+') {
    @Override
    public int operate(int a, int b) {
      return a + b;
    }
  },
  SUBTRACT('-') {
    @Override
    public int operate(int a, int b) {
      return a - b;
    }
  },
  MULTIPLY('*') {
    @Override
    public int operate(int a, int b) {
      return a * b;
    }
  },
  DIVIDE('/') {
    @Override
    public int operate(int a, int b) {
      return a / b;
    }
  };

  private final char symbol;

  OperatorType(char symbol) {
    this.symbol = symbol;
  }

  public abstract int operate(int a, int b);
}
