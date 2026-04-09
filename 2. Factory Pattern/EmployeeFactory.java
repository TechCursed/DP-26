//This is the factory class it can create different types of employee based upon the parameter
public class EmployeeFactory{

  //This method creates and returns the employee object
  public static Employee createEmployee(String empName){

    //conditions to create employees based upon input parameters
    //method is static so that it should be called without creating an instance
    if(empName.trim().equalsIgnoreCase("BACKENDEMPLOYEE")){
      return new BackendEmployee();
    }
    else if(empName.trim().equalsIgnoreCase("FRONTENDEMPLOYEE")){
      return new FrontendEmployee();
    }
    else{
      return null;
  }
}
