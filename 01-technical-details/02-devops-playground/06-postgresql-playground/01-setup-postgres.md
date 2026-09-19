1. Install on Mac

``` shell
brew install postgresql@18
```


2. Start local service

``` shell
# list services
brew services

# start postgres service
brew services start postgresql@18
```

3. Access local database

``` shell
psql-18 postgres
```

4. 

``` postgres
# list databses
\l

# connect to a database
\c database_name

# list tables
\dt

# list users
\du
```