## PostgreSQL
### How to install on Ubuntu

Install postgressql. Default role `postgres`, password `postgres`.

```
sudo apt install postgresql postgresql-contrib
```

Let us create a new db `test`:
```
sudo -u postgres createdb test
```

### Python client
Install python client `psycopg2`

```
sudo pip install psycopg2
```

Basic usage

```python
import psycopg2

# Connect to an existing database
conn = psycopg2.connect("dbname=test user=postgres")

# Open a cursor to perform database operations
cur = conn.cursor()

# Execute a command: this creates a new table
cur.execute("CREATE TABLE test (id serial PRIMARY KEY, num integer, data varchar);")

# Pass data to fill a query placeholders and let Psycopg perform
# the correct conversion (no more SQL injections!)
cur.execute("INSERT INTO test (num, data) VALUES (%s, %s)", (100, "abc'def"))

# Query the database and obtain data as Python objects
cur.execute("SELECT * FROM test;")
cur.fetchone()  # (1, 100, "abc'def")

# Make the changes to the database persistent
conn.commit()

# Close communication with the database
cur.close()
conn.close()
```
