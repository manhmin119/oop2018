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
public class Numeral extends Expression{
    private int value;
    public Numeral(int value){
        this.value=value;
    }
    public Numeral(){
         this.value=0;
    }
    public String toString(){
        return " ";
    }
    public int evaluate(){
        return this.value;
    }
}
