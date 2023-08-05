Email Application Readme
The Email Application is a Java program designed to automate the creation and management of company email accounts for new workers. This application simplifies the process of generating unique email addresses, setting passwords, and managing mailbox capacities for employees. The program is encapsulated into two classes: Email and EmailApp.

Email Class
The Email class is the core component of the application and contains methods and attributes necessary for handling email account creation and management. Below are the key features of the Email class:

Attributes
firstName: First name of the employee.
lastName: Last name of the employee.
password: Password for the email account.
department: Department of the employee.
email: Generated email address for the employee.
defaultPasswordLength: Default length for generating passwords.
mailboxCapacity: Capacity of the email mailbox.
alternateEmail: Alternate email address for the employee.
companySuffix: Company-specific email domain suffix.
Constructor
Email(String firstName, String lastName): Initializes the Email object by setting the first and last names of the employee. This constructor also triggers the process of generating an email, setting a department, and creating a random password.
Methods
private String setDepartment(): Prompts the user to input the department code and returns the corresponding department name.
private String randomPassword(int length): Generates a random password of the specified length.
public void setMailBoxCapacity(int capacity): Sets the mailbox capacity for the email account.
public void setAltEmail(String altmail): Sets an alternate email address for the employee.
public void changePassword(String password): Changes the password for the email account.
public int getMailboxCapacity(): Retrieves the mailbox capacity.
public String getAlternateEmail(): Retrieves the alternate email address.
public String getPassword(): Retrieves the current password.
public String showInfo(): Formats and displays the employee's display name, company email, and mailbox capacity.
EmailApp Class
The EmailApp class contains the main method to run the Email Application. It demonstrates the usage of the Email class and showcases how to create and display email accounts for new workers.

main Method
public static void main(String[] args): This is the entry point of the Email Application. It creates an instance of the Email class with the first name "John" and the last name "Smith". It then showcases how to set an alternate email address, retrieve it, and display the employee's information using the showInfo method.
How to Use
Compile and run the EmailApp class to execute the Email Application.
Input the first name and last name of the new worker.
Choose the department by entering the corresponding department code (1 for sales, 2 for development, 3 for accounting, 0 for none).
The program will generate a random password for the email account and display it.
An email address will be created using the provided information.
You can optionally set an alternate email address for the employee.
The employee's information, including display name, company email, and mailbox capacity, will be displayed.
Note
This Email Application is a simplified demonstration of email account creation and management. It does not include advanced features such as actual email sending or persistence of data. It serves as a basic example of how to encapsulate functionality into classes and methods within a Java program.




A simple Email Application using Java which creates email accounts for new hires in a company.

This application does the following task -->

Generate an email with the following syntax: firstname.lastname.@department.company.com.

Takes user input to determine the department of the user, whether sales, development or accounting, if none then leaves blank.
Generates a random String for a password.
It includes different methods to change the password,set mailbox capacity, and define an alternate email address.
Also different methods to display the name,email, and mailbox capacity.

