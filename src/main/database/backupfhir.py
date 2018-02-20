#!/usr/bin/env python
import subprocess
import sys
import datetime
import gzip

def main():
    if len(sys.argv) < 2:
        print "Please input db password!"
    else:
        datevar = datetime.date.today()
        dbpassword= "-p" + sys.argv[1]
        ipaddress = "-h" + "localhost"
        dbname = "fhir"
        filename = "./" + dbname + "-" + str(datevar)  + ".sql"
    
        print filename
        outputfile = open(filename, 'w') 
        p1 = subprocess.Popen(['mysqldump', '-uroot', dbpassword, ipaddress, dbname, '--skip-comments'], stdout=outputfile)
        p1.wait()
        outputfile.close()
if __name__ == '__main__':
    main()
