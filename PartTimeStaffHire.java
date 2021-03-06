public class PartTimeStaffHire extends StaffHire {
      private int workingHour;
      private int wagesPerHour;
      private String staffName;
      private String joiningDate;
      private String qualification;
      private String appointedBy;
      private String shifts;
      private boolean joined;
      private boolean terminated;
  
    /*
     *It is a method which is used to initialize the newly created object of the given class FullTimeStaffHire which allocates the memory for the given objects and doesnot have a return type.  
     */
    public PartTimeStaffHire(int vacancyNumber,String designation,String jobType,int workingHour,int wagesPerHour,String shifts) {
        super(vacancyNumber,designation,jobType);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
        this.terminated = false;
    }
    
    /*
     * It is a return-type method which is used to return the integer value of the variable or attribute salary. 
     */
    public int getworkingHour() {
      return workingHour;
    }
      
    /*
     * it is a return-type method which is used to return the integer value of the variable or attribute workingHour
     */
    public void setworkingHour(int workingHour) {
      this.workingHour = workingHour;
    }
    
    /*
     * it is a return-type method which is used to return the integer value of the variable or attribute wagesPerHour. 
     */
    public int getwagesPerHour() {
      return wagesPerHour;
    }
            
    /*
     * It is a method used to initialize the value of wagesPerHour in the local variable to insatance variable. 
     */
    public void setwagesPerHour(int wagesPerHour) {
      this.wagesPerHour = wagesPerHour;
    }
      
    /*
     * it is a return-type method which is used to return the string value of the variable or attribute staffName. 
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
     * it is a return-type method which is used to return the string value of the variable or the attribute joiningDate
     */
    public String getjoiningDate() {
      return joiningDate;
    }
    
    /*
     * it is a method used to initialize the value of the joiningDate in the local variable to instance variable. 
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
     * it is a method used to initialize the value of the qualification in the local variable to instance variable. 
     */
    public void setqualification(String qualification) {
      this.qualification = qualification;
    }
    
    /*
     * it is a return-type method which is used to return the string value of the variable or the attribute appointedBy. 
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
     * it is a return-type method which is used to return the string value of the variable or the attribute shifts of staffs. 
     */
    public String getshifts() {
      return shifts;
    }
    
    /*
     * it is a method used to initialize the value of the shifts in the local variable to instance variable. 
     */
    public void setshifts(String shifts) {
      this.shifts = shifts;
    }
    
    /*
     * it is a return-type method which is used to return the boolean value (true or false) of the variable or the attribute getjoined. 
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
       
    /*
     * it is a return-type method which is used to return the boolean value (true or false) of the variable or the attribute getterminated. 
     */
    public boolean getterminated() {
      return terminated;
    }
    
    /*
     * it is a method used to initialize the value of the terminated in the local variable to instance variable. 
     */
    public void setterminated(boolean terminated) {
      this.terminated = terminated;
    }
       
    public void partTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy) {    
        if(joined ==true) {
           System.out.println("The Staff named :" +getstaffName()+ "joined on :" +joiningDate);
            }
        else {
           this.staffName = staffName;
           this.joiningDate = joiningDate;
           this.qualification = qualification;
           this.appointedBy = appointedBy;
           this.joined = true;
           this.terminated = false;
        }
    }
      
    public void terminate() {
       if(terminated == true) {
           System.out.println("The staff got terminated");
          }
       else {
           this.staffName = "";
           this.joiningDate = "";
           this.qualification = "";
           this.appointedBy = "";
           this.joined = false;
           this.terminated = true;
       }
    }
   
    public void display() {
    super.display();
        if(joined == true) {
            System.out.println("The Staff named :" + staffName  + "\nWages Per Hour =" + wagesPerHour+ "\nJoined Date :" +joiningDate+ "\nThe Qualification of the Staff is : " + qualification+ "\nAppointed By " + appointedBy+ "\nIncome per Day :" +(workingHour*wagesPerHour));
      }
    }
}
    
