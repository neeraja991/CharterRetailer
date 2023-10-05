Retailer Program

To run this project,'Clone the project; and set the configurations in 'Edit Configurations' in right hand corner of IntelliJ.
Add in the Application class name and hit 'RUN' button.

Hibernate tables will be automatically created using H2 DB reading from data.sql file and all dataset will be loaded in the correspong table.
customer data is loaded to customers table and all transactions are loaded into customer_transact table.

REST EndPoint to consume:

http://localhost:8080/customers/1011
http://localhost:8080/customers