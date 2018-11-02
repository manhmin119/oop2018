/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author Administrator
 */
public class Square extends Expression{
  private Expression expression;
	public Square(Expression expression) {
		this.expression=expression;
	}
	public int evaluate() {
		return expression.evaluate()*expression.evaluate();
	}
	public String toString() {
		return "("+expression.toString()+")";
	}
}
