/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    static Student student[];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup())){
            return true;
        }
        else{
            return false;
                    }
        //return false; // xóa dòng này sau khi cài đặt
    }

    public static void main(String args[]){
        Student s1= new Student();
        s1.setName("manh");
        s1.setId("001");
        s1.setEmail("nguyenducmanh@gmailo.com");
        s1.setGroup("int2204");
        
        Student s2= new Student();
        s2.setName("aoil");
        s2.setId("002");
        s2.setEmail("aoil@gmail.com");
        s2.setGroup("int2204");
        
        Student s3=new Student();
        s3.setName("ass");
        s3.setId("003");
        s3.setEmail("ass@gmail.com");
        s3.setGroup("int2205");
        
       Student s4=new Student(s3);
        StudentManagement test= new StudentManagement();
        boolean a=test.sameGroup(s1,s3);
        if(a==true)
            System.out.println("cung lop roi");
        else
            System.out.println("khong cung lop");
    }
}
   /* void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
    }
}
*/
