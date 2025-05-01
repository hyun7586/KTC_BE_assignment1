package org.example.calculator;

import java.util.Optional;

public enum OperatorType {
  ADD('+') {
    @Override
    public Optional<Integer> operate(int a, int b) {
      System.out.println("결과: " + (a+b));
      return Optional.of(a + b);
    }
  },
  SUBTRACT('-') {
    @Override
    public Optional<Integer> operate(int a, int b) {
      System.out.println("결과: " + (a-b));
      return Optional.of(a - b);
    }
  },
  MULTIPLY('*') {
    @Override
    public Optional<Integer> operate(int a, int b) {
      System.out.println("결과: " + a*b);
      return Optional.of(a * b);
    }
  },
  DIVIDE('/') {
    @Override
    public Optional<Integer> operate(int a, int b) {
      if(b==0){
        System.out.println("0으로는 나눌 수 없습니다");
        return Optional.empty();
      }
      System.out.println("결과: " + a/b);
      return Optional.of(a / b);
    }
  };

  private final char symbol;

  OperatorType(char symbol) {
    this.symbol = symbol;
  }

  // enum class는 외부에서 new 키워드로 객체를 생성할 수 없다.
  // 주어진 symbol 값과 같은 값을 가진 value를 찾아서 OperatorType 객체를 반환해 줘야 한다.
  // fromSymbol() 메서드가 생성자의 역할을 해 준다.
  public static OperatorType fromSymbol(char ch){
    for(OperatorType op : OperatorType.values()){
      if(op.symbol==ch){
        return op;
      }
    }

    System.out.println("연산자로는 +, -, *, / 만 사용 가능합니다");
    return null;
  }

  public abstract Optional<Integer> operate(int a, int b);
}
