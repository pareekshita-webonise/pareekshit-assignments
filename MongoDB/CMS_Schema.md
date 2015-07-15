Schema for Content Management System:

// Creating a document for user
User={
	_id : Object_Id()
	username : "String"
	password : "String"
	Role_id : Integer
	Permission_id : [Array storing  integer values of diffrent permissions granted to the user]
	Created_at : [Array storing both date and time]
	Updated_at : [Array storing both date and time]
	Profile : {
		    _id:Object_id()
		    Name : "String"
		    Age : Integer
		    Address : [{Local_address:{ _id : Object_id()
						Street : "String"
						City : "String"
						State : "String"
						Country : "String"						
			      }]
		    Phone : [Array of numbers]
		   }
	}

//Creating a document for Role specified to users 
Role={
	id : "String"
     }

//Creating a document for permissions specific to roles for the user
Permission={
	id : "String"
     }

//Creating a document for a page 
Page={
	_id : Object_id()
	title : "String"
	slug : "String"
	user_id : Integer
	contents : "String"
	comments : [{ comment1:{_id : Object_id(), content : "String" , user_id : Integer}
		      comment2:{_id : Object_id(), content : "String" , user_id : Integer}
		   }]
     }

//Creating a document for blog
Blog={
	_id : Object_id()
	title : "String"
	slug : "String"
	user_id : Integer
	contents : "String"
	comments : [{ comment1:{_id : Object_id(), content : "String" , user_id : Integer}
		      comment2:{_id : Object_id(), content : "String" , user_id : Integer}
		   }]
     }
