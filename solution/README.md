README
====
Requirement (Must be insatlled):
  
    MySql, Maven, Node 

How to run the your solution...

1. Ensure MySql is running on your system at port 3306. if you have it running on another port you 
   change that in ```application.properties``` file located at :
                                                     
     ```<project location>/expense-list/solution/src/main/resources/application.properties```

2. Open ```application.properties``` file, located at :
 
    ```<project location>/expense-list/solution/src/main/resources/application.properties```
3. Set the following properties to your mysql username and password 

    ```spring.datasource.username``` and  ```spring.datasource.password```

4. Switch to server directory using :
    
      ```cd <project location>/expense-list/solution```

5. run the command below :
      
      ```mvn spring-boot:run```
      
6. Goto ```http://localhost:8080/#/expenses``` in your browser to use the app.

IMPORTANT
====
To avoid unconcious bias, we aim to have your submission reviewed anonymously by one of our engineering team. Please try and avoid adding personal details to this document such as your name, or using pronouns that might indicate your gender.
