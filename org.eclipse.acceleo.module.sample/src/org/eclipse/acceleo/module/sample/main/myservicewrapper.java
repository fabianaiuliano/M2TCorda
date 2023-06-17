package org.eclipse.acceleo.module.sample.main;
import it.unitn.disi.sweng.secbpmn.model.SecBpmnElement;

public class myservicewrapper {

	public static String capitalizeString(SecBpmnElement el, String string) {
		  char[] chars = string.toLowerCase().toCharArray();
		  boolean found = false;
		  for (int i = 0; i < chars.length; i++) {
		    if (!found && Character.isLetter(chars[i])) {
		      chars[i] = Character.toUpperCase(chars[i]);
		      found = true;
		    } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
		      found = false;
		    }
		  }
		  /*String s = String.valueOf(chars);
		  return s.replaceAll(" ","").replaceAll("\'","").replaceAll("-","");*/ 
		  return String.valueOf(chars);
		}
	
}
