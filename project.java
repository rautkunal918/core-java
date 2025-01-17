import java.io.*;
import java.util.*;
public class project 
{
    public static void main(String[] args) 
     {
       String name,day;
       int T_id,choice;
       Scanner sc=new Scanner(System.in);
       System.out.println("\n\t\t\t\t\tWelcome to Attendensce Management");
int adminView();
int studentView();
int studentLogin();
int checkCredentials(string userName, string password);
int getAllStudentsbyRollNo();
int deleteAllStudents();
int deleteStudentbyRollno();
int checkListOfStudentsRegistered();
int checkPresenseCountbyRollno();
int getListOfStudentsWithTheirPresenseCount();
int registerStudent();
int adminLogin();
int registerStudent();
int markMyAttendance(string username);
int countMyAttendance(string username);
int delay();

int delay()
{
for(int i = 0; i<3; i ++)
{
	System.out.println("\n Saving Records ...");
    for(int ii = 0; ii<20000; ii ++)
    {
    	for(int iii = 0; iii<20000; iii ++)
       	{ }
    }
}
   
System.out.println("\n Exiting Now ...");
for(int i = 0; i<3; i ++){
   for(int ii = 0; ii<20000; ii ++) { 
     for(int iii = 0; iii<20000; iii ++){
	 }
    } 
}

}

int adminView()
{	
int goBack = 0;
while(1)
{
system("cls");
System.out.println("\n 1 Register a Student");
System.out.println("\n 2 Delete All students name registered");
System.out.println("\n 3 Delete student by rollno");
System.out.println("\n 4 Check List of Student registered by userame");
System.out.println("\n 5 Check presense count of any student by Roll No");
System.out.println("\n 6 Get List of student with their attendance count");
System.out.println("\n 0. Go Back <- \n");
int choice;


System.out.println("\n Enter you choice: ");
choice=sc.nextInt();

switch(choice)
{
	case 1: registerStudent();break;  
	case 2: deleteAllStudents(); break;
	case 3: deleteStudentbyRollno(); break;
	case 4: checkListOfStudentsRegistered(); break;
	case 5: checkPresenseCountbyRollno(); break;
	case 6: getListOfStudentsWithTheirPresenseCount(); break;
	case 0: goBack = 1;break;
    default: 
    System.out.println("\n Invalid choice. Enter again ");
    getchar();           	
}   

if(goBack == 1)
{
break; //break the loop
}     

}

return 0;
}

int studentLogin()
{
system("cls");

System.out.println("\n -------- Student Login ---------");	
studentView();
delay();
return 0; 
}


int adminLogin()
{
system("cls");
cout<<"\n --------- Admin Login --------";	

string username;
string password;

cout<<"\n Enter username : ";
cin>>username;
cout<<"\n Enter password : ";
cin>>password;

if(username=="admin" && password=="admin@2") 
{
    adminView();
    getchar();	
    delay();
}   
else
{
cout<<"\n Error ! Invalid Credintials..";	
cout<<"\n Press any key for main menu ";
getchar();getchar();
}

return 0;
}


int checkStudentCredentials(string username, string password)
{
// read file line by line & check if username-password.dat exist?
// if it exsist return 1 else 0

ifstream read;
read.open("db.dat");

if (read) {
// The file exists, and is open for input
int recordFound = 0;
string line;
string temp = username + password + ".dat";
cout<<"\n file name is : "<<temp;
while(getline(read, line)) {
	if(line == temp)
	{
		recordFound = 1;
		break;
	}
}

if(recordFound == 0)
    return 0;
else
   return 1;
}
else
{
   return 0;
}
    		
}

int getAllStudentsbyName()
{
cout<<"\n List of All Students by their Name \n";	

cout<<"\n Please any key to continue..";
getchar();getchar();

return 0;
}

int getAllStudentsbyRollNo()
{
cout<<"\n List of All Students by their Roll No \n";

cout<<"\n Please any key to continue..";
getchar();getchar();

return 0;		
	
}

int deleteStudentbyRollno()
{
	
cout<<"\n Delete any Student by their Roll No \n";		

cout<<"\n Please any key to continue..";
getchar();getchar();

return 0;
}