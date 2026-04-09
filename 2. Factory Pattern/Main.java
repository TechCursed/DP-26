class Main{
  public static void Main(string[] args){

    //Creating the employees using the EmployeeFactory
    Employee FE = EmployeeFactory.createEmployee("FrontendEmployee");
    Employee BE = EmployeeFactory.createEmployee("BackendEmployee")
  }
}
