# This is an example of handling java date time and joda date time by springBoot JPA and mysql

### requirement to build and run
* mysql
* java8



### build and run
* if you want to run this in command:
    * ./gradlew bootRun for linux
    * gradlew bootRun for windows


### developer tool
* Intellij IDEA
* ./gradlew idea(linux)  or gradlew idea(windows) to generate the project file which is *.ipr and open this file in Intellij


### resources
* applications.properties under src/main/resources, you can find the database information here
* db.sql you van find the DB and table structure here


### testing notes
* GET: localhost:8081/add-utildate   will add current time to java.utl.date and store them to table my_utildate;
* GET: localhost:8081/add-sqltime will add current time to java.sql.time and store them to table my_sqltime
* GET: localhost:8081/add-sqltimestamp  will add current time to java.sql.timestamp and store them to table_mysqltimestamp
* GET: localhost:8081/add-sqltimestamp  will add current time to java.sql.timestamp and store them to table_mysqltimestamp
* localhost:8081/add-joda
  payload: {
  	"jodaDateTime":"2013-09-29T18:00:00+0900",

  	"jodaLocalDateTime":"2013-09-29T18:00:00"
  }
  this is to store joda time to table my_joda
* localhost:8081/add-java8datetime
   payload:
   {
	"zonedDateTime":"2013-09-29 T 18:01:01+0900",
	"localDateTime":"2013-09-29 T 18:01:01"

   }
   this is to store java 8 date time to table my_java8