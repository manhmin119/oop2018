/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author Administrator
 */
public class Fraction {
    private int numerator;
    private int denominator;
    // TODO: khai báo các thuộc tính

    public Fraction(int numerator, int denominator) {
       
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.denominator= denominator;
        this.numerator= numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int ts=this.getNumerator()*other.getDenominator()+this.getDenominator()*other.getNumerator();
        int ms=this.getDenominator()*other.getDenominator();
        ts=ts/gcd(ts,ms);
        ms=ms/gcd(ts,ms);
        Fraction add=new Fraction(ts,ms);
        return  add;
    }

    public Fraction subtract(Fraction other) {
        int ts=this.numerator*other.denominator-this.denominator*other.numerator;
        int ms=this.denominator*other.denominator;
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        ts=ts/gcd(ts,ms);
        ms=ms/gcd(ts,ms);
        Fraction subtract=new Fraction(ts,ms);
        return subtract;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int ts=this.numerator*other.numerator;
        int ms=this.denominator*other.denominator;
        ts=ts/gcd(ts,ms);
        ms=ms/gcd(ts,ms);
        Fraction multiply=new Fraction(ts,ms);
        return multiply;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int ts=this.numerator*other.denominator;
        int ms=this.denominator*other.numerator;
        ts=ts/gcd(ts,ms);
        ms=ms/gcd(ts,ms);
        Fraction divide=new Fraction(ts,ms);
        return divide;
    }
    public  boolean equals(Object obj){
        
        double kq1=(double)this.numerator/(double)this.denominator
    }
}
