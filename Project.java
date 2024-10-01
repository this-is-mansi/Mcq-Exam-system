import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Scanner;                                                              // importing the packages
import java.io.IOException;

class Question {
    String prompt,answer;                                                       //creating variables for storing question and answer 
    public Question(String prompt, String answer) {                            // creating the constructor of Question class
    this.prompt = prompt;
    this.answer = answer;
    }
    }

    class ans_to                                                             // creating class to create the answer key
    {
       String ans,question,corr;                                             // creating constructor of ans_to
       public ans_to(String ans,String corr,String question)
       {
           this.ans = ans;
           this.corr = corr;
           this.question = question;
       }
    
    }
                    
    class Students {                                                     // class for storing username and password of registered students

        String username,password;                                                
        public Students(String username, String password) {              // constructor of class Students
        
        this.username = username;
        this.password = password;
        }
   }  


   class Data {                                                      // class for registering new users
    String username,password;
   
   Data(String username, String password)
   {
       this.username= username;
       this.password = password;
   }
}


 public class Project {                                                 // class Project
    int n=0;                                                           // Global varible of class fist
   
public static void main(String[] args) {                               //main method
   
    String user,in,mcq;
    int c=0; 
    Scanner choice= new Scanner(System.in);                           // Scanner for taking input from the user
    Scanner cre = new Scanner(System.in);
    Project ob = new Project();
  
    Students[] s={                                                    // array of username and passwords of registered students
new Students("mansi","123"),
new Students("Pratiksha","321"),
new Students("Krutika","456"),
new Students("Supriya","654"),
new Students("Gauri","789"),
new Students("Akanksha","987"),
new Students("Ansh","135"),
new Students("Manav","531"),
new Students("Mayank","246"),
new Students("Anu","124"),};

                                                              // Strings declared for questions of category 1

String q1_1="Which of the following is not a Java features?\n"+"(a)Dynamic\n(b)Architecture Neutral\n(c)Use of pointers\n(d)Object-oriented\n";
String q1_2="___ is used to find and fix bugs in the Java programs\n"+"(a)JVM\n(b)JRE\n(c)JDK\n(d)JDB\n";
String q1_3="Which package contains the Random class?\n"+"(a)java.util package\n(b)java.lang package\n(c)java.awt package\n(d)java.io package\n";
String q1_4="Which component is used to compile, debug and execute the java programs?\n"+"(a)JRE\n(b)JIT\n(c)JDK\n(d)JVM\n";
String q1_5="What is the extension of java code files?\n"+"(a).js\n(b).txt\n(c).class\n(d).java\n";
String q1_6="What is not the use of this keyword in Java?\n"+"(a)Referring to the instance variable when a local variable has the same name\n(b)Passing itself to the method of the same class\n(c)Passing itself to another method\n(d)Calling another constructor in constructur chaining\n";
String q1_7="Which is the arithmetic operator in Java that gives the Remainder Division?\n"+"(a)/\n(b)@\n(c)%\n(d)&\n";
String q1_8="Java Source Code is compiled into ______________.\n"+"(a).Obj\n(b).Source Code\n(c).Byte Code\n(d).Exe\n";
String q1_9="Single line comment starts with _________ in Java.\n"+"(a)/**\n(b)//\n(c)/*\n(d)None of these\n";
String q1_10="What is true in Java?\n"+"(a)For all class names the first letter should be in Upper Case.\n(b)All method names should start with a Lower Case letter.\n(c)Name of the program file should exactly match the class name\n(d)All of the above\n";
      

Question[] questions1 = {                                    // storing questions and answers for category 1 in Questions array
    new Question(q1_1, "c"),
    new Question(q1_2, "d"),
    new Question(q1_3,"a"),
    new Question(q1_4, "c"),
    new Question(q1_5, "d"),
    new Question(q1_6,"b"),
    new Question(q1_7, "c"),
    new Question(q1_8, "c"),
    new Question(q1_9,"b"),
    new Question(q1_10,"d")
};
 
                                                              // Strings declared for questions of category 2
String q2_1="What keyword is used in Java to define a constant?\n"+"(a)Static\n(b)Final\n(c)Abstract\n(d)Private\n";
String q2_2="If two methods have the same name but a different parameter list then it is called___________\n"+"(a)Method overriding\n(b)Method overloading\n(c)Operator overloading\n(d)None of these\n";
String q2_3="The mechanism of deriving a new class from an old one is called ______________\n"+"(a)Method overriding\n(b)Method overloading\n(c)Operator overloading\n(d)Inheritance\n";
String q2_4="_________ constructor is created when an object of a particular class is created\n"+"(a)Default\n(b)Parameterized\n(c)Copy\n(d)None of these\n";
String q2_5="______________ inheritance is not supported by JAVA.\n"+"(a)Multiple\n(b)Multi level\n(c)Hierarchical\n(d)Hybrid\n";
String q2_6="______ keyword does not allow a method to be overridden in the subclass \n"+"(a)Public\n(b)Abstract\n(c)Final\n(d)Static\n";
String q2_7="______ is a special method in java that enables an object to initialize itself when it is created\n"+"(a)Constructor\n(b)Destructor\n(c)Static\n(d)Final\n";
String q2_8="_____ keyword is used to inherit a class.\n"+"(a)extend\n(b)extends\n(c)implement\n(d)implements\n";
String q2_9="Which of the following statements is true?\n"+"(a)Java supports operator overloading\n(b)Java supports interfaces\n(c)Java supports pointers\n(d)Java supports multiple inheritances\n";

String q2_10="_____ methods must be overridden in the subclass.\n"+"(a)Public\n(b)Final\n(c)Abstract\n(d)Static\n";


Question[] questions2 = {                                    // storing questions and answers for category 2 in Questions array
    new Question(q2_1, "b"),
    new Question(q2_2, "b"), 
    new Question(q2_3, "d"), 
    new Question(q2_4, "a"), 
    new Question(q2_5, "a"), 
    new Question(q2_6, "c"),
    new Question(q2_7, "a"), 
    new Question(q2_8, "b"), 
    new Question(q2_9, "b"), 
    new Question(q2_10, "c")
};

                                                              // Strings declared for questions of category 3
String q3_1="Which of these keywords is used to refer to member of base class from a sub class?\n"+"(a)upper\n(b)super\n(c)this\n(d)none of the mentioned\n";
String q3_2="A class member declared protected becomes member of subclass of which type?\n"+"(a)public member\n(b)private member\n(c)protected member\n(d)static member\n";
String q3_3="Which of these is correct way of inheriting class A by class B?\n"+"(a)class B+ class A {}\n(b)class B inherits class A {}\n(c)class B extends A {}\n(d)class B extends class A {}\n";
String q3_4="An interface in Java is like a 100% ____\n"+"(a)abstract class\n(b)public class\n(c)inner class\n(d)ananymous class\n";
String q3_5="A Java Class inherits Constants and Methods of an Interface using ____ keyword.\n"+"(a)INTERFACE\n(b)IMPLEMENTS\n(c)EXTENDS\n(d)All the above\n";
String q3_6="All Interface variables are ___ by default in Java\n"+"(a)public\n(b)final\n(c)public and final\n(d)None\n";
String q3_7="Which of these keywords is used to define packages in Java?\n"+"(a)pkg\n(b)Pkg\n(c)package\n(d)Package\n";
String q3_8="Which of these access specifiers can be used for a class so that its members can be accessed by a different class in the different package?\n"+"(a)Public\n(b)Protected\n(c)Private\n(d)No Modifier\n";
String q3_9="Which of the following package stores all the standard java classes?\n"+"(a)lang\n(b)java\n(c)util\n(d)java.packages\n";
String q3_10="What is a package in Java?\n"+"(a)Package is a collection of files of type Java Class, Interfaces, or Abstract Class\n(b)A Package is simply a Directory or Folder with Java Classes\n(c)A Package usually contains Java Classes written for a specific purpose or problem\n(d)All the above\n";

Question[] questions3 = {                                    // storing questions and answers for category 3 in Questions array
    new Question(q3_1, "b"),
    new Question(q3_2, "b"), 
    new Question(q3_3, "c"), 
    new Question(q3_4, "a"), 
    new Question(q3_5, "b"), 
    new Question(q3_6, "c"),
    new Question(q3_7, "b"), 

    new Question(q3_8, "a"), 
    new Question(q3_9, "b"), 
    new Question(q3_10, "d")
};
                                                              // Strings declared for questions of category 4
String q4_1="Applets are designed to be embedded within an __________.\n"+"(a)JavaScript\n(b)Css\n(c)HTML\n(d)SQL\n";
String q4_2="Which of these functions is called to display the output of an applet?\n"+"(a)display()\n(b)paint()\n(c)displayApplet()\n(d)PrintApplet()\n";
String q4_3="Which of these methods can be used to output a string in an applet?\n"+"(a)display()\n(b)print()\n(c)drawString()\n(d)transient()\n";
String q4_4="Which of these methods is a part of Abstract Window Toolkit (AWT) ?\n"+"(a)display()\n(b)paint()\n(c)drawString()\n(d)transient()\n";
String q4_5="Which of the following is required to view an applet?\n"+"(a)JCM\n(b)JDM\n(c)JVM\n(d)Java class\n";
String q4_6="When the ………………. method of the Applet class is called, it displays the result of the Applet code on the screen.\n"+"(a)paint()\n(b)repaint()\n(c)update()\n(d)reupdate()\n";
String q4_7="State whether the following statements about the Applets are True or False\n(i) Applets can communicate with other services on the network\n(ii) Applets cannot run any program from the local computer\n"+"(a)True,False\n(b)False,True\n(c)True,True\n(d)False,False\n";
String q4_8="Applet class is a subclass of the panel class, which is again a subclass of the ………………….. class.\n"+"(a)object\n(b)component\n(c)awt\n(d)container\n";
String q4_9="Which of the following applet tags is legal to embed an applet class named Test into a webpage?\n"+"(a)<applet class=Test width=200 height=100></applet>\n(b)<applet>code=Test.class width=200 height=100></applet>\n(c)<applet code=Test.class width=200 height=100></applet>\n(d)<applet param=Test.class width=200 height=100></applet>\n";
String q4_10="The …………………. class is an abstract class that represents the display area of the applet.\n"+"(a)display\n(b)graphics\n(c)text\n(d)area\n";

Question[] questions4 = {                                    // storing questions and answers for category 4 in Questions array
    new Question(q4_1, "c"),
    new Question(q4_2, "b"), 
    new Question(q4_3, "c"), 
    new Question(q4_4, "b"), 
    new Question(q4_5, "c"), 
    new Question(q4_6, "a"),
    new Question(q4_7, "b"), 
    new Question(q4_8, "d"), 
    new Question(q4_9, "c"), 
    new Question(q4_10, "b") 
};


                                                              // Strings declared for questions of category 5
String q5_1="Which of these keywords is not a part of exception handling?\n"+"(a)try\n(b)finally\n(c)thrown\n(d)catch\n";
String q5_2="Which of these keywords must be used to monitor for exceptions?\n"+"(a)try\n(b)finally\n(c)thrown\n(d)catch\n";
String q5_3="Which of these keywords is used to manually throw an exception?\n"+"(a)try\n(b)finally\n(c)throw\n(d)catch\n";
String q5_4="Exception generated in try block is caught in _________ block\n"+"(a)Catch\n(b)Throw\n(c)Throws\n(d)finally\n";
String q5_5="Which exception is thrown when divide by zero statement executes?\n"+"(a)NumberFormatException\n(b)AritmeticException\n(c)NullPointerException\n(d)None of these\n";


String q5_6="What is multithreaded programming?\n"+"(a)It’s a process in which two different processes run simultaneously\n(b)It’s a process in which two or more parts of same process run simultaneously\n(c)It’s a process in which many different process are able to access same information\n(d)It’s a process in which a single process can access information from many sources\n";
String q5_7="Thread priority in Java is?\n"+"(a)Integer\n(b)Float\n(c)double\n(d)long\n";
String q5_8="In java multi-threading, a thread can be created by\n"+"(a)Extending Thread class\n(b)Implementing Runnable interface\n(c)using both\n(d)None\n";
String q5_9="Which method must be implemented by a Java thread?\n"+"(a)run()\n(b)execute()\n(c)start()\n(d)None\n";
String q5_10="What will happen if two thread of the same priority are called to be processed simultaneously?\n"+"(a)Anyone will be executed first lexographically\n(b)Both of them will be executed simultaneously\n(c)None of them will be executed\n(d)It is dependent on the operating system\n";

Question[] questions5 = {                                    // storing questions and answers for category 5 in Questions array
    new Question(q5_1, "c"),
    new Question(q5_2, "a"), 
    new Question(q5_3, "c"), 
    new Question(q5_4, "a"), 
    new Question(q5_5, "b"), 
    new Question(q5_6, "b"),
    new Question(q5_7, "a"), 
    new Question(q5_8, "c"), 
    new Question(q5_9, "a"), 
    new Question(q5_10, "d")};

    
                                                  // Actual starting of the test
   
    System.out.println("\n\n******************************************************************************************************************");
    System.out.println("                                      Welcome to the code hiest,");
    System.out.println("\n******************************************************************************************************************");
    System.out.println("1.New user\n2.Login\n"
    +"__________________________________________________________________________________________________________________\n");
   
    in = cre.nextLine();

    while(!in.equals("1")&&!in.equals("2"))                  // condition to make sure that the user only select the option provided above
    {
        System.out.println("Enter appropiate choice:");
        in = cre.nextLine();      
    }




    if(in.equals("1"))                                   // Register a new user if the user select option 1
    {
        System.out.println("Enter username for your account:");
        user= choice.nextLine();  

        label:                  // condition to check wheter the entered credentials already doesn't exist for a successfull registration
        for(int i=0;i<s.length;i++)
        {   
            if(user.equals(s[i].username)){
              System.out.println("\nUsername already taken try entering another username"); 
              user= choice.nextLine(); 
              continue label;
            }
           
        }        
    System.out.println("Enter password for your account "+user);
    String pass = choice.nextLine();
        addValues(user,pass,s);                         // function to register user
    }

    else                                               // provide login option to user if he selected 2
    {
        System.out.println("enter username and password respectively:");
        user= choice.nextLine();
        String pass = choice.nextLine();
        c =check(user,pass,s);                         // function to check whether the entered credentials match for login 

        while(c!=1)
        {    
             user= choice.nextLine();  
             pass = choice.nextLine();
             c =check(user,pass,s);
        }
    }


                                                // display welcome screen after successful login or registration
    System.out.println("Welcome "+user+" Tell us what would you like to choose:\n");
    Scanner cat= new Scanner(System.in);
                                                // display options for category of test      
    System.out.println("1.Basics of java\n"+"2.Constructors in java\n"+"3.Inheritance,Interface and package in java\n"
    +"4.Multithreading in java"+"\n5.Exception handling in java\n");

    mcq = cat.nextLine();
                                              // condition to check whether user entered appropiate option 
    while(!mcq.equals("1")&&!mcq.equals("2")&&!mcq.equals("3")&&!mcq.equals("4"))
  {
    System.out.println("Enter choice from the options provided above:");
    mcq = cat.nextLine();  
  }
  System.out.println("__________________________________________________________________________________________________________________\n");
                      
                     // switch case to give test on the topic chosen by user
   switch(mcq)
   {
       case "1":
       ob.takeTest(questions1,user);
       break;
       case "2":
       ob.takeTest(questions2,user);
       break;
       case "3":
       ob.takeTest(questions3,user);
       break;
       case "4":
       ob.takeTest(questions4,user);
       break;
       case "5":
       ob.takeTest(questions5,user);
       break;
   }
  
}




                             // function to add a new user
public static void addValues(String user,String pass,Students[] s)
{
    ArrayList<Students> list = new ArrayList<>();  
    list.add(new Students(user,pass));
    System.out.println("________________________________________________________________________________________________________________"+
    "\n\ncongratulations! "+user +" your account has been created\n");  
}

                          // function to check whether has appropiate credentials for login   
  public static int check (String s1, String s2,Students[] s)
  {
      int ch=0;
                           // comparing the credentials provided by user and values present in the students array
      for(int i =0 ; i<s.length;i++)
      {
      
        if(s1.equals(s[i].username)&&s2.equals(s[i].password)){        
            ch=1;   
            break;
        }          
      }
      if(ch==1)
      {
          return 1;
      }
      else{
          System.out.println("Invalid credentials try again:");
          return 0;
      }
  }

                                    // function to take test

public  void takeTest(Question[] questions,String usernameString)
 { 
     int score=0,choice=0;
     String answer;
     String r_c;
     Scanner keyboardInput= new Scanner(System.in);
     Scanner R_C  = new Scanner(System.in);
     ArrayList<ans_to> list = new ArrayList<>();
     
    for(int i = 0; i < questions.length; i++) 
    { System.out.println("\n"+questions[i].prompt); 
        
        answer= keyboardInput.nextLine(); 
        while(!answer.equals("a")&&!answer.equals("b")&&!answer.equals("c")&&!answer.equals("d"))
        {
           System.out.println("Enter valid choice:");
           answer = keyboardInput.nextLine();

       }
       if(answer.equals(questions[i].answer))
       { 
        score++;
       }
       else{
           list.add(new ans_to(answer,questions[i].answer,questions[i].prompt));    
           n++;  
       }
    
    }




                 // display the score of the user
    System.out.println("__________________________________________________________________________________________________________");
    System.out.println("\nYou got "+score+"/ 10 marks");
    System.out.println("__________________________________________________________________________________________________________");
    System.out.println("\n1.Check result and get answer key:\n"+"2.Get certificate\n");
    r_c = R_C.nextLine();
    System.out.println("**********************************************************************************************************");
    
    while(!r_c.equals("1")&&!r_c.equals("2"))
    {
      System.out.println("Enter choice from the options provided above:");
      r_c = R_C.nextLine();
      System.out.println("**********************************************************************************************************");
      
    }
                        
     switch(r_c)
     {
         case "1":
         display(list);
         break;
         case "2":
         Certificate(usernameString);
         break;
     }

     Certificate(usernameString);
     System.out.println("**********************************************************************************************************");
     System.out.println("\nYou can go and download your certificate from the path \n "+"C:/Users/Lenovo/Desktop/java project/Certificate");
    
  }

  
                                             // function to generate certificate of user
public void Certificate(String username)
{
    try {
           
        FileWriter filewriter = new FileWriter("Certificate.txt");

             filewriter.write("--------------------------------------------------------------------------------------------------------------------------------------"+
             "\n\t\t\t\t\tCode heist\n--------------------------------------------------------------------------------------------------------------------------------------"+
             "\n\n\t\t\t\tCertificate of Achievement\n\n\t\t\t\t        Congratulations!\n"+"\n\t\tThis is to certify that mr./mrs  "+username+"  has successfully completed"+
             "\n\t\tthe online coding competition organized by Government polytechnic pune\n\n\n\n\n\tgppune\t\t\tm.s.kothale\t\t\t7/01/2022"+"\n\tHeld in\t\t\torganized by\t\t\tHeld on");
           
         
           filewriter.close();
    }
  catch(IOException exception)
  {
      System.out.println("Input and output exception");
  }
}


                                             // function to display result and answer key to the user
public void display(ArrayList<ans_to> ans)
{
    for (int i = 0; i < n; i++)
    {
        ans_to var  = ans.get(i);
        System.out.println("\n"+var.question+"\nCorrect option: "+var.corr+"\nChossen option: "+var.ans);
        System.out.println("__________________________________________________________________________________________________________");
    }
}
}
