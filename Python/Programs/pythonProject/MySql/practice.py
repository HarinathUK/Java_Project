#
# #demo_mysql_test.py:
#
# import mysql.connector
#
# #demo_mysql_connection.py:
#
# import mysql.connector
#
# mydb = mysql.connector.connect(
#   host="localhost",
#   user="yourusername",
#   password="yourpassword"
# )
#
# print(mydb)
#
#
# #create a database named "mydatabase":
#
# import mysql.connector
#
# mydb = mysql.connector.connect(
#   host="localhost",
#   user="yourusername",
#   password="yourpassword"
# )
#
# mycursor = mydb.cursor()
#
# mycursor.execute("CREATE DATABASE mydatabase")
#
#
# #Create a table named "customers":
#
# import mysql.connector
#
# mydb = mysql.connector.connect(
#   host="localhost",
#   user="yourusername",
#   password="yourpassword",
#   database="mydatabase"
# )
#
# mycursor = mydb.cursor()
#
# mycursor.execute("CREATE TABLE customers (name VARCHAR(255), address VARCHAR(255))")
#
#
# # cheack if table exist
# import mysql.connector
#
# mydb = mysql.connector.connect(
#   host="localhost",
#   user="root",
#   password="hariuk95",
#   database="mydatabase"
# )
#
# mycursor = mydb.cursor()
#
# mycursor.execute("SHOW DATABASES")
# for x in mycursor:
#   print(x)
#
# # create primary key when creating the table
# import mysql.connector
#
# mydb = mysql.connector.connect(
#   host="localhost",
#   user="root",
#   password="hariuk95",
#   database="mydatabase"
# )
#
# mycursor = mydb.cursor()
# mycursor.execute("CREATE TABLE customers (id INT AUTO_INCREMENT PRIMARY KEY, "
#                  "name VARCHAR(255), address VARCHAR(355))")
#
# # if the tables already exist, use the ALTER TABLE keyword
# import mysql.connector
#
# mydb = mysql.connector.connect(
#   host="localhost",
#   user="root",
#   password="hariuk95",
#   database="mydatabase"
# )
#
# mycursor = mydb.cursor()
# mycursor.execute("ALTER TABLE customers ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY")
#
# #Insert into tables
# import mysql.connector
#
# mydb = mysql.connector.connect(
#   host="localhost",
#   user="root",
#   password="hariuk95",
#   database="mydatabase"
# )
#
# mycursor = mydb.cursor()
#
# sql = "INSERT INTO customers (name,address) VALUES (%s, %s)"
# val = ("john", "Highway 21")
# mycursor.execute(sql,val)
# mydb.commit()
# print(mycursor.rowcount, "record inserted")
#
#
#
# # Insert multiple rows
# import mysql.connector
#
# mydb = mysql.connector.connect(
#   host="localhost",
#   user="root",
#   password="hariuk95",
#   database="mydatabase"
# )
#
#
# mycursor = mydb.cursor()
# sql = "INSERT INTO customers (name, address) VALUES (%s, %s)"
# val = [
#   ('Peter', 'Lowstreet 4'),
#   ('Amy', 'Apple st 652'),
#   ('Hannah', 'Mountain 21'),
#   ('Michael', 'Valley 345'),
#   ('Sandy', 'Ocean blvd 2'),
#   ('Betty', 'Green Grass 1'),
#   ('Richard', 'Sky st 331'),
#   ('Susan', 'One way 98'),
#   ('Vicky', 'Yellow Garden 2'),
#   ('Ben', 'Park Lane 38'),
#   ('William', 'Central st 954'),
#   ('Chuck', 'Main Road 989'),
#   ('Viola', 'Sideway 1633')
# ]
#
# mycursor.executemany(sql, val)
#
# mydb.commit()
#
# print(mycursor.rowcount, "was inserted.")
#

# # select all records from the "customers" table, and display the result:

# import mysql.connector
#
# mydb = mysql.connector.connect(
#   host='localhost',
#   user='root',
#   password='hariuk95',
#   database='mydatabase'
# )
# mycursor = mydb.cursor()
# mycursor.execute("SELECT * FROM customers")
# myresult = mycursor.fetchall()
# for x in myresult:
#   print(x)

## select only the name and address column
# import mysql.connector
# mydb=mysql.connector.connect(
#   host='localhost',
#   user='root',
#   password='hariuk95',
#   database='mydatabase'
# )
# mycursor=mydb.cursor()
# mycursor.execute("SELECT name, address FROM customers")
# myresult = mycursor.fetchall()
# for x in myresult:
#   print(x)

##using fetchone method:(execute first row only)
# import mysql.connector
# mydb=mysql.connector.connect(
#   host='localhost',
#   user='root',
#   password='hariuk95',
#   database='mydatabase',
# )
# mycursor=mydb.cursor()
# mycursor.execute("SELECT * FROM customers")
# myresult = mycursor.fetchone()
# for x in myresult:
#   print(x)

## select with a filter: 'WHERE'
import mysql.connector
mydb=mysql.connector.connect(
  host='localhost',
  user= 'root',
  password= 'hariuk95',
  database='mydatabase'
)
mycursor = mydb.cursor()
mycursor.execute("SELECT * FROM customers WHERE address = 'park lane 38'")
myresult = mycursor.fetchall()
for x in myresult:
  print(x)

## using 'LIKE' to select particular things
# mycursor.execute("SELECT * FROM customers LIKE '%way%'")

## using 'ORDER BY' to asscending or descending the order
# mycursor.execute("SELECT * FROM customers ORDER BY name")
## using DESC for descending order'
# mycursor.execute("SELECT * from customers ORDER BY name DESC")

## USING 'DELETE FROM' to delete recorda from existing table
# mycursor.execute("DELETE FROM customers WHERE address = 'mountain 21'")
# mydb.commit() ## mydb.commmit() is required to make changes, otherwise no changes are made to the table.

## DELETE  a table
# mycursor.execute("DELETE TABLE customers")

## DROP only if exist
# mycursor.execute("DROP TABLE IF EXIST customers")

## USING UPDATE
# mycursor.execute("UPDATE customers SET address = 'canyon 123' "
#                  "WHERE adderss = 'valley 345'")

## USING LIMIT
# mycursor.execute("SELECT * FROM customers LIMIT 5")
## USING LIMIT OFFSET
# mycursor.execute("SELECT * FROM customers LIMIT 5 OFFSET 2")

## INNER JOIN: joins only matching values
# sql = "SELECT users.name AS user, products.fav AS favorite," \
#       "FROM users" \
#       "INNER JOIN products ON users.fav = products.id"
#
# ## LEFT JOIN: show all users even they don't have a fav product
# sql = "SELECT users.name AS user, products.fav AS favorite," \
#       "FROM users" \
#       "LEFT JOIN products ON users.fav = products.id"
#
# ## RIGHT JOIN: if you want return all products whether no user have fav product
# sql = "SELECT users.name AS user, products.fav AS favorite," \
#       "FROM users" \
#       "RIGHT JOIN products ON users.fav = products.id"

