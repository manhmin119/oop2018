/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author CCNE
 */
public abstract class BinaryExpression extends Expression {
       public abstract Expression left();
       public abstract Expression right();
       public abstract String toString();
       public abstract int evaluate();
}
