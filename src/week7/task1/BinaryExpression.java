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
 abstract class BinaryExpression extends Expression {
  public abstract int evaluate();
	public abstract String toString();
	public abstract Expression left();
	public abstract Expression right();
}
