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
public class Square extends Expression {
    public Expression expression;
    public Square(Expression expression){
       this.expression= expression;
    }
     public String toString(){
        return "";
    }
    public int evaluate(){
        return this.expression.evaluate();
    }
}
