create database fhir;
GRANT ALL PRIVILEGES ON fhir.* TO 'fhir_owner'@'%' IDENTIFIED BY '$fhir2018$$' WITH GRANT OPTION;