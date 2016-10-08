package org.pconrad.webapps.sparkjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Spark;

/**
   Example Model class for use with mustache templates
   in SparkJava

   @author pconrad
 */

public class ExampleModel extends HashMap<String,Object> {
    
	public final Request request;
	public final Response response;

	public ExampleModel( Request request, Response response) {
		this.request = request;
		this.response = response;
	}
    

    /** 
		add github information to the session
		
    */
	
    public ExampleModel addCheese() {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	this.put("cheese","swiss");
	return this;
    }
       
    public ExampleModel addBread() {
		
	Logger logger = LoggerFactory.getLogger(ExampleModel.class);
		
	this.put("bread","rye");
		
	return this;	
    } 
	
    public ExampleModel addCondiments() {
		
	Logger logger = LoggerFactory.getLogger(ExampleModel.class);

	ArrayList<String> condiments = new ArrayList<String>();
	condiments.add("honey mustard");
	condiments.add("mayo");
	condiments.add("pickle relish");
	
	this.put("condiments",condiments);
		
	return this;	
    } // build()

	
}
