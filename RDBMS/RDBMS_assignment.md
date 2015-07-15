//Query to create a database:

create database assesmanagement;

//Query to use the specified database:

use assessment;

//Query to create user table to store user information:

create table user (	
	u_id int NOT NULL AUTO_INCREMENT,
	user_name varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
     	u_type boolean,
     	PRIMARY KEY(u_id));

//Query to create question table containing all the questions:

create table question  ( 
	q_id int NOT NULL AUTO_INCREMENT, 
	question varchar(255), 
	PRIMARY KEY(q_id) );

//Query to create test table which stores the questions belong to a specific test:
create table test  ( 
	id int NOT NULL AUTO_INCREMENT, 
	test_id int NOT NULL, 
	que_id int, PRIMARY KEY(ID),
	FOREIGN KEY (que_id) REFERENCES question(q_id) );

//Query to create table options which records the options for the questions present in the question bank:

create table options ( 
	id int(11) NOT NULL AUTO_INCREMENT, 
	q_id int(11) , 
	options varchar(255) NOT NULL, 
	is_correct boolean, PRIMARY KEY(id), 
	FOREIGN KEY(q_id) REFERENCES question(q_id));

//Query to create table answer_log to store the answer given by a user for a specific test:

create table answer_log ( 
	a_id int(11) NOT NULL AUTO_INCREMENT, 
	u_id int(11) NOT NULL, 
	t_id int (11) NOT NULL, 
	choosen_ans int(11) , 
	time int(11), PRIMARY KEY(a_id), 
	FOREIGN KEY(u_id) REFERENCES user(u_id), 
	FOREIGN KEY(t_id) REFERENCES test(id));

//Query to insert values into user tables:

1.insert into user(user_name,password,u_type) value("Abhay","abh123",1);
2.insert into user(user_name,password,u_type) value("Suman","sum123",0);
3.insert into user(user_name,password,u_type) value("Pranay","pra123",0);
4.insert into user(user_name,password,u_type) value("Adrija","adr123",0);
5.insert into user(user_name,password,u_type) value("Girish","gir123",0);
6.insert into user(user_name,password,u_type) value("Gaurav","gau123",0);

//Query to insert values into question table:

1.insert into question(question,user_id) value ("What is the biggest planet in our solar system?",1);
2.insert into question(question,user_id) value ("What is the chemical symbol for the element oxygen?",1);
3.insert into question(question,user_id) value ("Another name for a tidal wave is a?",1);
4.insert into question(question,user_id) value ("True or false? Dogs are herbivores.",1);
5.insert into question(question,user_id) value ("What is the 7th element on the periodic table of elements?",1);
6.insert into question(question,user_id) value ("What is the name of the long appendage that hangs from an elephants face?",1);
7.insert into question(question,user_id) value ("True or false? DNA is the shortened form of the term ‘Deoxyribonucleic acid’?",1);
8.insert into question(question,user_id) value ("The highest mountain on earth is?",1);
9.insert into question(question,user_id) value ("What is the name of the closest star to the earth?",1);
10.insert into question(question,user_id) value ("True or false? Frogs are cold blooded animals.",1);
11.insert into question(question,user_id) value ("What is the name of the element with the chemical symbol ‘He’?",1);
12.insert into question(question,user_id) value ("The fear of what animal is known as ‘arachnophobia’?",1);
13.insert into question(question,user_id) value ("Pure water has a pH level of a around?",1);
14.insert into question(question,user_id) value ("The molten rock that comes from a volcano after it has erupted is known as what?",1);
15.insert into question(question,user_id) value ("True or false? Yogurt is produced by bacterial fermentation of milk.",1);
16.insert into question(question,user_id) value ("What is the name of the part of the human skeleton which protects our brain?",1);
17.insert into question(question,user_id) value ("Is the compound ‘HCl’ an acid or base?",1);
18.insert into question(question,user_id) value ("True or false? The fastest land animal in the world is the zebra.",1);
19.insert into question(question,user_id) value ("How many bones do sharks have in their bodies?",1);
20.insert into question(question,user_id) value ("What famous scientist was awarded the 1921 Nobel Prize in Physics for his work on theoretical physics?",1);

//Query to insert values into option table:

1.insert into options(q_id,options,is_correct) values (1,"Saturn",0);
2.insert into options(q_id,options,is_correct) values (1,"Jupiter",1);
3.insert into options(q_id,options,is_correct) values (2,"O",1);
4.insert into options(q_id,options,is_correct) values (2,"OO",0);
5.insert into options(q_id,options,is_correct) values (3,"Typhoon",0);
6.insert into options(q_id,options,is_correct) values (3,"Tsunami",1);
7.insert into options(q_id,options,is_correct) values (4,"False",1);
8.insert into options(q_id,options,is_correct) values (4,"True",0);
9.insert into options(q_id,options,is_correct) values (5,"Chlorine",0);
10.insert into options(q_id,options,is_correct) values (5,"Nitrogen",1);
11.insert into options(q_id,options,is_correct) values (6,"Tusks",0);
12.insert into options(q_id,options,is_correct) values (6,"A trunk",1);
13.insert into options(q_id,options,is_correct) values (7,"False",0);
14.insert into options(q_id,options,is_correct) values (7,"True",1);
15.insert into options(q_id,options,is_correct) values (8,"Mount Everest",1);
16.insert into options(q_id,options,is_correct) values (8,"Kunchenjungha",0);
17.insert into options(q_id,options,is_correct) values (9,"Pole Star",0);
18.insert into options(q_id,options,is_correct) values (9,"The sun",1);
19.insert into options(q_id,options,is_correct) values (10,"True",1);
20.insert into options(q_id,options,is_correct) values (10,"False",0);
21.insert into options(q_id,options,is_correct) values (11,"Hethium",0);
22.insert into options(q_id,options,is_correct) values (11,"Helium",1);
23.insert into options(q_id,options,is_correct) values (12,"Ants",0);
24.insert into options(q_id,options,is_correct) values (12,"Spiders",1);
25.insert into options(q_id,options,is_correct) values (13,"0",0);
26.insert into options(q_id,options,is_correct) values (13,"7",1);
27.insert into options(q_id,options,is_correct) values (14,"Lava",1);
28.insert into options(q_id,options,is_correct) values (14,"Crystal",0);
29.insert into options(q_id,options,is_correct) values (15,"True",1);
30.insert into options(q_id,options,is_correct) values (15,"False",0);
31.insert into options(q_id,options,is_correct) values (16,"Bone",0);
32.insert into options(q_id,options,is_correct) values (16,"The Skull",1);
33.insert into options(q_id,options,is_correct) values (17,"A Base",0);
34.insert into options(q_id,options,is_correct) values (17,"An Acid",1);
35.insert into options(q_id,options,is_correct) values (18,"False",0);
36.insert into options(q_id,options,is_correct) values (18,"True",0);
37.insert into options(q_id,options,is_correct) values (19,"0",1);
38.insert into options(q_id,options,is_correct) values (19,"6",0);
39.insert into options(q_id,options,is_correct) values (20,"Graham Bell",0);
40.insert into options(q_id,options,is_correct) values (20,"Albert Einstein",1);

//Query to insert values into answer_log table to record user`s answer for a particular test:

insert into answer_log(u_id,t_id,choosen_ans,time) value (2,1,1,20),(2,2,3,20),(2,3,5,20),(2,4,7,20),(2,5,9,20),(2,6,11,20),(2,7,13,20),(2,8,15,20),(2,9,17,20),(2,10,19,20);

insert into answer_log(u_id,t_id,choosen_ans,time) value (3,1,2,20),(3,2,4,20),(3,3,6,20),(3,4,8,20),(3,5,10,20),(3,6,12,20),(3,7,14,20),(3,8,16,20),(3,9,18,20),(3,10,20,20);

insert into answer_log(u_id,t_id,choosen_ans,time) value (3,11,22,15),(3,12,24,15),(3,13,26,15),(3,14,28,15),(3,15,30,15),(3,16,32,15),(3,17,34,15),(3,18,36,15),(3,19,38,15),(3,20,40,15);

//Query to insert value into test table to associate questions with a particular test:

insert into test(test_id,que_id) value (2,11),(2,12),(2,13),(2,14),(2,15),(2,16),(2,17),(2,18),(2,19),(2,20);

//Query to create a view to find out the marks scored by a user for a particular test:

create view score AS select count(o.options) as marks from options as o,answer_log as a,test as t where o.id=a.choosen_ans and t.id=a.a_id and o.is_correct=1 and a.u_id=2 and t.test_id=1;

//Queries to execute pivot table showing the questions present and the answers given by users against the questions:

create view tempDetails as select u.user_name,q.q_id questionId, u.u_id userID,t.test_id, q.question, o.options from user as u, options as o, answer_log as a, test as t,question as q where o.id=a.choosen_ans and t.id=a.t_id and q.q_id=t.que_id  and u.u_id=a.u_id and q.q_id=t.que_id;

SET @sql = NULL;

select group_concat(distinct concat('max(if(td.questionId = ''',questionId,''',options,NULL)) as', quote(questionId))) into @sql from tempDetails td;

set @sql = concat('select userID,user_name,',@sql,' from tempDetails td');

prepare statement from @sql;
execute statement;
