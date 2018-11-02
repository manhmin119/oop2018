/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task2;




import java.io.File;
import java.io.FileNotFoundException;

public class task2 {
	public void nullpe() throws NullPointerException {
		String m=null;
		String m1="cc";
		if(m.equals(m1)) System.out.println("hmm");
	}
	public void arrie() throws ArrayIndexOutOfBoundsException{
		int[] a = new int[10];
		if(a[20]==5) System.out.println(":v");
	}
	public void arth() throws ArithmeticException{
		int a=8;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	public void classCast() throws ClassCastException{
		Object x = new Integer(0);
	     System.out.println((String)x);
	}
	public void IO() throws FileNotFoundException{
		File f=new File("doc.txt");
	}
	public static void main(String[] args) {
		task2 a= new task2();
		try {
			a.nullpe();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		task2 b=new task2();
		try {
			b.arrie();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		task2 c=new task2();
		try {
			c.arth();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		task2 d= new task2();
		try {
			d.classCast();
		}
		catch(ClassCastException e) {
			e.printStackTrace();
		}
		
	}
	
		
}
