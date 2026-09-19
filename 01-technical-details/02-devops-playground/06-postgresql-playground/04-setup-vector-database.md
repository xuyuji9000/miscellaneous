1. Install Postgres vector extension

``` shell
brew install pgvector
```

2. Access local database

``` shell
psql-18 postgres
```

3. command inside `psql` 

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

4. enable vector database extension

``` postgres
CREATE EXTENSION IF NOT EXISTS vector;

# list installed extentions
\dx
```

