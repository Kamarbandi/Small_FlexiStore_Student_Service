# Small FlexiStore Student Service

There is a Student Service interface with two implementations: one stores data in application memory, and the other stores data in a database. If the database fails for any reason, the storage process will be replaced by a service that works with application memory.

* before run application run db, docker-compose up -d
* create db "student_db"
* first time when you run application change value in ddl-auto in application env with a "create", after again to "update"

![img](https://github.com/Kamarbandi/Small_FlexiStore_Student_Service/blob/main/store.PNG)