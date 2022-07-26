package Que8;


public class Company{

	public void init() throws Exception
    {
        System.out.println(
            "Bean Company has been "
            + "instantiated and I'm "
            + "the init() method");
    }
 
   
    public void destroy() throws Exception
    {
        System.out.println(
            "Container has been closed "
            + "and I'm the destroy() method");
    }
	
	
}
