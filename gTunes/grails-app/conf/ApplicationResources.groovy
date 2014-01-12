modules = {
    	
		
	
	'jquery-lib' {		
		resource url: "js/jquery-1.10.2.js"
		resource url: "js/ui/1.10.3/jquery-ui-1.10.3.custom.js"
		}
		
	application { resource url:'js/application.js' }
	
	
	
	'tweeter-bootstrap'
	{
		dependsOn  'jquery-lib'
		resource url: "js/tweeterbootstrap/bootstrap.js"	
	}
	
	
	
}