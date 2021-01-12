package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching = 0;

    //constructor
    public Teacher (String firstName, String lastName, String subject, int yearsTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    //getter methods
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSubject(){
        return subject;
    }

    public int getYearsTeaching(){
        return yearsTeaching;
    }

    //setter methods
    private void setFirstName(String firstName){
        this.firstName = firstName;
    }

    private void setLastName(String lastName){
        this.lastName = lastName;
    }

    private void setSubject(String subject){
        this.subject = subject;
    }

    private void setYearsTeaching(int yearsTeaching){
        this.yearsTeaching = yearsTeaching;
    }
}//end class
