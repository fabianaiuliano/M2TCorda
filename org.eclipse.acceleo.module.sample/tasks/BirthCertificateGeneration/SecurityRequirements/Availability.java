import java.net.HttpURLConnection; 
import java.net.URL; 
import java.util.Timer; 
import java.util.TimerTask; 
import net.corda.core.node.CordaPluginRegistry; 
import net.corda.core.node.PluginServiceHub;  

public class HealthOrSwitch implements CordaPluginRegistry { 

	public void initialize(PluginServiceHub services) { 
	String healthCheckUrl = "http://localhost:8080/health"; 
	
	long healthCheckInterval = 5000; 

	Timer timer = new Timer();
 
	timer.schedule(new TimerTask() { 
		@Override 
		public void run() { 
			try { 
				URL url = new URL(healthCheckUrl); 
				HttpURLConnection con =(HttpURLConnection) url.openConnection(); 
                con.setRequestMethod("GET"); 
				int responseCode = con.getResponseCode(); 
                   	if (responseCode != 200) { 
                      	switch(); 
                    } 
             	} catch (Exception e) { 
                	switch(); 
              	} 
          } 
      }, 0, healthCheckInterval); 
    } 

    private void switch() { 
    } 
} 
 
