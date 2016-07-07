package com.cosmicdust.corekan.puzzle;

public class ConditionalResolution {
	public static void main(String[] args) {
		
		Integer i = null;
		Double d = new Double(2.0);
		
		Object number = true ? i : d;

		System.out.println(number);
	}
}






























// Integer d = new Integer(2);






/*
 * Since the second and third operands are different boxed numeric types, they
 * can be unboxed, numerically promoted to a common type (in this case, double),
 * and then the conditional operation is applied on the resulting primitives
 * (1.0 and 2.0). The type of the expression is double (primitive). When the
 * assignment is done, the double is then autoboxed into a Double.
 */
