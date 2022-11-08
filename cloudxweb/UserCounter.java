package cloudxweb;

import javax.servlet.*;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.*;

@WebListener
public class UserCounter implements ServletRequestListener, ServletRequestAttributeListener {

	int count=0;
    public UserCounter() {
       
    }

	
    public void requestDestroyed(ServletRequestEvent arg0)  { 
    	count=count+1;
    	ServletContext c=arg0.getServletContext();
      
        c.setAttribute("count", count);
        System.out.println("Request Object Destroy");
   
    }

	
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
        
    }

    public void requestInitialized(ServletRequestEvent arg0)  { 
    	  System.out.println("Request Object Created");
    }

	
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
        
    }

	
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
       
    }
	
}
