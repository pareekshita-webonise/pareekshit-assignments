Schema for Content Management System:

// Creating a document for user
Users={
	_id : Object_Id()
	username : "String"
	password : "String"
	role_id : Integer
	permission_id : [array storing  integer values of diffrent permissions granted to the user]
	created_at : [array storing both date and time]
	updated_at : [array storing both date and time]
	profile : {
		    name : "string"
		    age : integer
		    address : [{ street : "string"
				city : "string"
				state : "string"
				country : "string"						
			      }]
		    phone : [array of numbers]
		   }
	}

//Creating a document for Role specified to users 
Roles={
	id : Object_ID()
	0 : 'superadmin',
	1 : 'admin',
	2 : 'editor',
	3 : 'user'
     }

//Creating a document for permissions specific to roles for the user
Permissions={
	_id : Object_ID()
	0 : 'whole',
	1 : 'user management',
	2 : 'content management',
	3 : 'posting and blogging'
	
     }

//Creating a document for a page 
Pages={
	_id : Object_id()
	title : "String"
	slug : "String"
	user_id : Integer
	content : "String"
	comments : [{ content : "String" , user_id : Integer},
		    { content : "String" , user_id : Integer}
		   ]
     }

//Creating a document for blog
Blogs={
	_id : Object_id()
	title : "String"
	slug : "String"
	user_id : Integer
	content : "String"
	comments : [{content : "String" , user_id : Integer},
		    {content : "String" , user_id : Integer}
		   ]
     }


Queries:
//To insert document into users collection
db.users.insert([
{	"username" : "abhishek@gmail.com",
	"password" : "123xyz",
	"role_id" : 0,
	"permission_id" : 0,
	"created_at" : ["11-02-2015","31-03-2015","12-05-2015"],
	"updated_at" : ["14-03-2015","22-04-2015","01-07-2015"],
	"profile" : {
	"name" : "Abhishek Kumar",
	"age" : 40,
	"phone" : ["8755439923","9807654321"],
	"address" :[
	{
	"Local_address":{
	"street" : "8th avenue street",
	"city" : "mumbai",
	"state" : "maharashtra",
	"country" : "India"}
}
]
	}
},
{
	"username" : "pranav@gmail.com",
	"password" : "123abc",
	"role_id" : 3,
	"permission_id" : 3,
	"created_at" : ["10-07-2015","11-07-2015","12-07-2015"],
	"updated_at" : ["14-07-2015","15-07-2015","16-07-2015"],
	"profile" : 
	{
	"name" : "Pranav Shukla",
	"age" : 30,
	"phone" : ["1234567890","9807654321"],
	"address" : [
	{
	"Local_address":{
	"street" : "4th street",
	"city" : "pune",
	"state" : "maharashtra",
	"country" : "India"} }
]
}
}
])

//To insert values into roles collection
db.roles.insert({
0 : 'superadmin',
1 : 'admin',
2 : 'editor',
3 : 'user'})

//To insert values into permissions collection
db.permissions.insert({
0 : 'whole',
1 : 'user management',
2 : 'content management',
3 : 'posting and blogging'})

//To insert document into pages collection where userid is fetched from user collection
db.pages.insert({
	"title" : 'Home',
	"slug" : 'homepage',
	"user_id" : db.users.find({"username":"abhishek@gmail.com"}).map(function(u){return (u._id);}),	
	"content" : "Hello welcome to MongoDB",
	"comments" : [{content : "great page","user_id":db.users.find({"username":"abhishek@gmail.com"}).map(function(u){return (u._id);}) }]
})

//To find the _id of a particular user with a particular username.
db.users.find({"username":"abhishek@gmail.com"}).map(function(u){return (u._id);}) 

or 

var id =db.users.find({"username":"abhishek@gmail.com"}).map(function(u){return (u._id);});
print(id);

//To find values in a particular collection
db.users.find().pretty()
db.roles.find().pretty()
db.permissions.find().pretty()
db.pages.find().pretty()
