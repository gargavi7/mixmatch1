#Comments

####The following refactoring was performed on the code:

-  All the GET, PUT, POST, and DELETE requests concerning the tasks were extracted and pushed to TaskController.java. This is because, in the MVC framework, a controller responsible for handling URL mappings. 
-  Similarly, all requests concerning the Users were pushed to UserController.java.
-  The implementation logic for the methods - create tasks, get a task by id, search tasks, create tasks, and delete logic have been pushed to the service layer. This is because the code in the controller layer must be simple and all the business logic should be pushed to the service layer.
-  The above step is also performed for UserController.java again simplifying the logic in the controller.
-  The entities Task and User are moved to the sub-package com.sonalake.refactoring.model. Also, these are annotated using @Entity. This is for letting spring know that it has to manage these entities. Also, constructors are added to the entities.
-  All the implementation logic in regards to the tasks and the users reside in their respective service classes.
-  The service classes make calls to the repository classes where the actual transactions with the database occur. The Task Repository and the user repository make use of JPA to interact with the database.
-  By this point in time, the Server class only has the main method from where it launches the Spring Boot application by creating a fresh application context instance.  
-  The function todate(String date) which is used for formatting the date has been moved to a utility class FormatDate. The function is made static and all calls to this utility are made at the class-level.   