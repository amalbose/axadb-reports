

# Prerequisites


## Database configuration 

###PostgreSQL

* Create database

`CREATE DATABASE axadbreport;`

* Create User and set encoding

`CREATE USER axatrikx WITH PASSWORD 'axatrikx';`
`ALTER ROLE axatrikx SET client_encoding TO 'utf8';`

* Grant db privileges to user

`GRANT ALL PRIVILEGES ON DATABASE axadbreport TO axatrikx;`

