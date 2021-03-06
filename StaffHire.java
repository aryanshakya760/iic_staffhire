public class StaffHire {
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    /*
     * It is the constructor for the class StaffHire which initializes the new objects and doesnot have a return-type.
     */
    public StaffHire(int vacancyNumber,String designation,String jobType) {
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;  
    }
    
    /*
     * It is the return type method for the attribute vacancyNumber which returns integer value. 
     */
    public int getVacancyNumber() {
      return vacancyNumber;
    }
      
    /*
     * It is the method used to initialize the value of vacancyNumber from local variable and pass it to instance variable.
     */
    public void setVacancyNumber(int vacancyNumber) {
      this.vacancyNumber = vacancyNumber;
    }
   
    /*
     * It is the return-type method which returns the string value of the attribute designation.
     */
    public String getdesignation() {
        return designation;
    }
      
    
    /*
     * It is a method which is used to initialize the value of the designation in the local variable to instance variable. 
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }
  
    /*
     * It is the return-type method which is used to return the string value of the variable or the at tribute jobType.
     */
    public String getjobType() {
      return jobType;
    }
    
    /*
     * it is a method used to initialize the value of the jobType in the local variable to instance variable. 
     */
    public void setjobType(String jobType) {
        this.jobType = jobType;
    }
   
    public void display() {
      System.out.println("The given Vacancy number is " +getVacancyNumber());
      System.out.println("The given Designation is " +getdesignation());
      System.out.println("The given Job Type is " +getjobType());
     } 
}
