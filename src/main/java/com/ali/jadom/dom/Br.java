package com.ali.jadom.dom;

import java.util.HashMap;

import com.ali.jadom.dom.superelements.FlowingContent;
import com.ali.jadom.dom.superelements.InteractiveContent;
import com.ali.jadom.dom.superelements.PalpableContent;
import com.ali.jadom.dom.superelements.PhrasingContent;

@Tag("br")
public class Br extends DOMelement implements PhrasingContent, FlowingContent{ 
	 
	 
	private static final long serialVersionUID = -3203109348022407717L;

	public Br( HashMap<String, String> attributes) {
		super(tag(Br.class), ApplicationManager.NULL_NODE_VALUE, attributes);  
	}

	 
	public Br() {
		super(tag(Br.class), ApplicationManager.NULL_NODE_VALUE); 
	}

	 
	public Br(String id, String domClass, String Styles, String jsCallout) {
		super(tag(Br.class), ApplicationManager.NULL_NODE_VALUE, id, domClass, Styles, jsCallout); 
	}
 
	
	@Override
	public boolean addDomElement(DOMelement element){
		if(ApplicationManager.FORCE_HTML_COMPLIANCE &&  element.isOfType(FlowingContent.class, InteractiveContent.class, PalpableContent.class, PhrasingContent.class))
			throw new RuntimeException(this.getClass().getCanonicalName().concat(" is not allowed to have any child elements. To override set ApplicationManager.FORCE_HTML_COMPLIANCE to false"));
		return super.addDomElement(element);
	}
	
	@Override
	public String toString(){ 
		return super.toString();  
	}
	 
	
}