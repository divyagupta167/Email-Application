package emailapp;

import java.util.Scanner;

public class Email {
       private String firstName;
       private String lastName;
       private String password;
       private String department;
       private String email;
       private int defaultPasswordLength=10;
       private int mailboxCapacity=500;
       private String alternateEmail;
       private String companySuffix = "aeycompany.com";

       // Constructor to receive first name and last name
       public Email(String firstName, String lastName) {
              this.firstName = firstName;
              this.lastName = lastName;
              // System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

              // call a method asking for the department, return the department
              this.department= setDepartment();
              // System.out.println("Department: "+this.department);

              // call a method that returns a random password
              this.password=randomPassword(defaultPasswordLength);
              System.out.println("Your password is: "+ this.password);

              //combine elements to generate email
              email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
              // System.out.println("Your email is: "+ email);


       }

       // ask for the department
       private String setDepartment(){
              System.out.println("New Worker: "+firstName+"\nDepartment Codes \n1 for sales\n2 for development\n3 for accounting\n0 for none.\nEnter Department code: ");
              Scanner sc = new Scanner(System.in);
              int deptChoice = sc.nextInt();
              if(deptChoice==1){return "sales"; }
              else if(deptChoice==2){return "dev"; }
              else if(deptChoice==3){return "acct"; }
              else {return ""; }
       

}

       // generate a random password
       private String randomPassword(int length){
              String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
              char[] password = new char[length];
              for(int i= 0; i <length; i++){
                     int rand = (int)(Math.random()* passwordSet.length());
                     password[i]= passwordSet.charAt(rand);
                     // System.out.println(rand);
                     // System.out.println(passwordSet.charAt(rand));
              }
              return new String(password);
       }

       // set the mailbox capacity
       public void setMailBoxCapacity(int capacity){
              this.mailboxCapacity=capacity;
       }
       // set the alternate email
       public void setAltEmail(String altmail){
              this.alternateEmail=altmail;
       }
       // change the password
       public void changePassword(String password){
              this.password = password;
       }

       public int getMailboxCapacity(){return mailboxCapacity;}
       public String getAlternateEmail(){return alternateEmail;}
       public String getPassword(){return password;}

       public String showInfo(){
              return "Display Name: "+ firstName+" "+lastName+
                     "\nCompany Email: "+ email+
                     "\nMailBox Capacity: "+mailboxCapacity+"mb";
       }

}
