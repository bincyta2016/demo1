create table policy1(
	Id int not null auto_increment,
	Name varchar(64),
	Category varchar(64),
	Sum_assured int,
	Premium int,
	Tenure int,
	primary key (Id)
	);

	
create table customer1(
	Id int not null auto_increment,
	Name varchar(64),
	policy_id int,
	Age int,
	Email varchar(64),
	Number int,
	primary key (Id),
	foreign key (policy_id)
		references policy1(Id)
		
		);