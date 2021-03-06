public class FullTimeStaffHire extends StaffHire {
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
   
    /*
     * It is a return-type method which is used to return the integer value of the variable or attribute salary.
     */
    public FullTimeStaffHire(int vacancyNumber,String designation,String JobType,int salary,int workingHour) {
       super(vacancyNumber,designation,JobType);
       this.salary = salary;
       this.workingHour = workingHour;
       staffName = "";
       joiningDate = "";
       qualification = "";
       appointedBy = ""; 
       joined = false;
    }
       
    /*
     * It is a return-type method which is used to return the integer value of the variable or attribute salary
     */
    public int getsalary() { 
        return salary;
    }   
       
    /*
     * It is a method used to initialize the value of the salary in the local variable to instance variable. 
     */
    public void setsalary(int salary) { 
          if(joined==false) {
              this.salary = salary;
          }
          else{
              System.out.println("The staff is already hired so the salary cannot be changed.");
          }
    }
    
    /*
     * it is a return-type method which is used to return the integer value of the variable or attribute workingHour. 
     */
    public int getworkingHour() {
          return workingHour = workingHour;
    }
         
    /*
     * It is a method used to initialize the value of workingHour in the local variable to insatance variable 
     */
    public void setworkingHour(int workingHour) {
        this.workingHour = workingHour;
    }
    
    /*
     * it is a return-type method which is used to return the string value of the variable or attribute staffName
     */
    public String getstaffName() {
        return staffName;
    }
        
    /*
     * it is a method used to initialize the value of staffName in the local variable to instance variable. 
     */
    public void setstaffName(String staffName) {
        this.staffName = staffName;
    }
       
    /*
     * it is a return-type method which is used to return the string value of the variable or the attribute joiningDate. 
     */
    public String getjoiningDate() {
        return joiningDate;
    }
    
    /*
     * 	it is a method used to initialize the value of the joiningDate in the local variable to instance variable. 
     */
    public void setjoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
       
    /*
     * it is a return-type method which is used to return the string value of the variable or the attribute qualification 
     */
    public String getqualification() {
        return qualification;
    }
        
    /*
     * 	it is a method used to initialize the value of the qualification in the local variable to instance variable. 
     */
    public void setqualification(String qualification) {
        this.qualification = qualification;
    }
       
    /*
     * it is a return-type method which is used to return the string value of the variable or the attribute appointedBy
     */
    public String getappointedBy() {
        return appointedBy;
    }
        
    /*
     * it is a method used to initialize the value of the appointedBy in the local variable to instance variable. 
     */
    public void setappointedBy(String appointedBy) {
        this.appointedBy = appointedBy;
    }
      
    /*
     * it is a return-type method which is used to return the boolean value of the variable or the attribute getjoined. 
     */
    public boolean getjoined() {
        return joined;
    }
        
    /*
     * it is a method used to initialize the value of the joined in the local variable to instance variable. 
     */
    public void setjoined(boolean joined) {
        this.joined = joined;
    }
       
      
    public void fullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy) {
        if(joined == true) {
         System.out.println("The Staff Name :" +getstaffName() +",has Joined on the date :" +getjoiningDate());
          }
        else
          {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            }
    }
       
    public void display() {
        super.display();
       if (joined == true) {
       System.out.println("The Staff named" +getstaffName()+ "\nwhose salary is " +getsalary()+ 
       "\nhave working hour of " +getworkingHour()+
       "\njoined on " +getjoiningDate()+
       "\nhaving qualification of " +getqualification()+ 
       "\nthe staff is being appointed by" +getappointedBy());
         }
    }  
}

