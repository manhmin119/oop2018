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
public abstract class Addition extends BinaryExpression {
    private Expression left;
    private Expression right;
    public  Addition(Expression left,Expression right){
        this.left=left;
        this.right=right;
    }
    public String toString(){
        return "";
    }
    public int value(){
        return 0;
    }    
}
