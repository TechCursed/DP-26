//this employee implements the employee interface we created
public class FrontendEmployee implements Employee{

  //implementing the unimplemented methods from employee interface according to our current employee
  @Override
  public int getSalary(){
    return 600000;
  }

  @Override
  public String getSkills(){
    return "HTML, CSS, JS, REACT";
  }
}
