# Student Management System (JDBC + MySQL)

A simple **Student Management System** project in Java using **JDBC** and **MySQL**.

## Features
- Add student
- Update student
- Delete student
- View all students
- Uses `PreparedStatement` (safe from SQL Injection)

If you encounter **java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver** error then 
Add mysql-connector-j-9.x.jar to the project

**If using IntelliJ IDEA**

Right-click project → Open Module Settings (F4).

Go to Libraries → + → Java → select mysql-connector-j-8.x.x.jar.

Apply & OK.

**If using Eclipse**

Right-click project → Build Path → Configure Build Path.

Go to Libraries tab → Add External JARs → choose mysql-connector-j-8.x.x.jar.

Apply & Close.
