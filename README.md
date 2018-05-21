# [FHIR](www.FHIR.org) - BETA version
Update:
- Added REST layer validator
- 

An implementation of the Fast Healthcare Interoperability Resources (FHIR) version 3.0.1.

This implentation is 100% auto generated

For more information about the FHIR please visit [https://www.hl7.org/fhir/overview.html](https://www.hl7.org/fhir/overview.html)

This implementation includes a relational database, Dao, service and RESTful layers

It has 2321 unit tests, 2321 integration tests. All passed.

Please do not modify the code directly.  if new features and changes are needed please update the templates instead.
Will provide an interface for updating the templates

if have questions please email: gmai2006@gmail.com

##LOC of generated code
<pre>
-----------------------------------------------------------------------------------
Language                         files          blank        comment           code
-----------------------------------------------------------------------------------
Java                              2004          50790          97986         327274
JSON                              1525              0              0         314856
SQL                                  4            434           1725          19054
XML                                  6              8              6            910
Groovy                               1             24              5             57
Markdown                             1              8              0             27
Python                               1              2              0             21
Visualforce Component                1              0              0             11
-----------------------------------------------------------------------------------
SUM:                              3543          51266          99722         662210
-----------------------------------------------------------------------------------
</pre>

## Instruction
All instructions should be run in a terminal
a. clone the project
```git clone https://github.com/gmai2006/fhir.git```

b. run gradle build to download all dependencies and setup your eclipse .classpath
```gradle dependencies eclipse```

c. Create a FHIR database
Go to src/main/databases directory and start your mysql client.  Then run the database creation script
```source ./database-creation.sql```

d. load FHIR test data into the newly created database
Exit the mysql client.  Then run following command
mysql -u <sqluserid> -p --database fhir  < ./fhir-2018-02-19.sql

