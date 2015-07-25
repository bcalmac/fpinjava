package com.fpinjava.functions.exercise02_03;


public class FunctionExamples {

  public static final Function<Integer, Function<Integer, Integer>> add = arg1 -> arg2 -> arg1 + arg2;

  public static final BinaryOperator add2 =  arg1 -> arg2 -> arg1 + arg2;

  public static final BinaryOperator mult =  arg1 -> arg2 -> arg1 * arg2;
}
