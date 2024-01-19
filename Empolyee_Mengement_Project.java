
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| employeedetels     |
| mysql              |
| name               |
| school             |
| student            |
+--------------------+
6 rows in set (0.01 sec)

mysql> use employeedetels;
Database changed
mysql> select * from Empolyee;
+-------+----------+
| name  | password |
+-------+----------+
| gopal | 123      |
| raja  | 1234     |
+-------+----------+
2 rows in set (0.12 sec)
