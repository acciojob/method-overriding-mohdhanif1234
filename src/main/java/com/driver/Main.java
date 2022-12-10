package com.driver;

public class Main {
    public static class A{ // creating class A
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{ // creating class B and inheriting it from class A
        @Override
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
  public static void main(String[] args){
        B objB = new B(); // creating object of class B
        System.out.println(objB.meth());
  }
}