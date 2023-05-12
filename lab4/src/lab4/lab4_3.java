package lab4;

class Person{
    String name,gender;
    int age;
    public Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public String getgender(){
        return gender;
    }
    public void setgender(String gender){
        this.gender=gender;
    }
    public String toString(){
        return "Ten: "+name+"\nTuoi: "+age+"\nGioi tinh: "+gender;
    }
}
class Employee extends Person{
    String employerName,dateHired;
    public Employee(String name,int age,String gender,String employerName,String dateHired){
        super(employerName, age, gender);
        this.employerName=employerName;
        this.dateHired=dateHired;
    }
    public String getemployerName(){
        return employerName;
    }
    public void setemployerName(String employerName){
        this.employerName=employerName;
    }
    public String getdateHired(){
        return dateHired;
    }
    public void setdateHired(String dateHired){
        this.dateHired=dateHired;
    }
    public String toString(){
        return super.toString()+"\nTen nhan vien: "+employerName+"\nThoi gian thue: "+dateHired;
    }
}
class PartTimeEmployee extends Employee{
    int hoursPerWeek;
    PartTimeEmployee(String name,int age,String gender,String employerName,String dateHired, int hoursPerWeek){
        super(name, age, gender, employerName, dateHired);
        this.hoursPerWeek=hoursPerWeek;
    }
    public int gethoursPerWeek(){
        return hoursPerWeek;
    }
    public void sethoursPerWeek(int hoursPerWeek){
        this.hoursPerWeek=hoursPerWeek;
    }
    public String toString(){
        return super.toString()+"\nSo tieng lam trong tuan: "+hoursPerWeek;
    }
}

public class lab4_3 {
	 public static void main(String[] args) {
	        PartTimeEmployee pte=new PartTimeEmployee("Cam Tu", 23, "Nu", " Cam Tu", "18/6/2022", 25);
	        System.out.println(pte);
	    }
	}