/**
 * 
 */
package com.lambda;

/**
 * @author psha84
 *
 */
@FunctionalInterface
public interface Function<V,R> {
 R apply(V v);
}
