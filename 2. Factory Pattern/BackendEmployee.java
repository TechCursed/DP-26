//this employee implements the interface we created 
public class BackendEmployee implements Employee{

  //implementing the unimplemented Employee interface methods according to our current employee
  @Override 
  public int getSalary(){
    return 90000;
  }

  @Override
  public String getSkills(){
    return "system design, DSA";
  }

  
}
