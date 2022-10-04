package happyfamily.humans;

import happyfamily.DayOfWeeks;
import happyfamily.Family;
import happyfamily.Human;

import java.util.Map;



public final class Woman extends Human {
 public Woman(String name, String surname, String date, int iq) {
  super(name,surname,date,iq);
 }

 public void makeUp(){
  System.out.println("Sabina loves makeUp!");

 }
 public void greetPet(){
  System.out.println("Hello from Ms." + super.getName());
 }
 public Woman (){

 }
 public Woman(String name, String surname, int year, int iq, Map<DayOfWeeks, String> schedule, Family family){
  super(name,surname,year,iq,schedule,family);
 }
 public Woman(String name, String surname, int year){
  super(name,surname,year);
 }


}