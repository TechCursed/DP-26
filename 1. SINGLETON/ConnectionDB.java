class ConnectionDB{

  //null instance which is later used to crate the instance
  public static ConnectionDB instanceConnectionDB;

  //MAKING THE CONSTRUCTOR AS PRIVATE SO IT CAN NOT BE ACCESSED DIRECTLY
  private ConnectionDB(){
    System.out.println("Connection is established");
  }

  //STATIC METHOD TO CREATE THE OBJECT
  public static createConnection(){

    //object is created only if it's not be initialized earlier
    if(instanceConnectionDB==null){
      instanceConnectionDB = new ConnectionDB();
    }
    return instanceConnectionDB;
  }
  
}
