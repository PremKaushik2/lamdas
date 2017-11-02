package com.lambda;
@FunctionalInterface
public interface Consumer<V> {
  void accept(V v);	
}
