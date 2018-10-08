(ns simple-postgresql-client.core
  (:require [clojure.java.jdbc :as jdbc])
  (:gen-class))

;; please set :ssl to true if you do not use the localhost
(def db-spec {:dbtype     "postgresql"
              :dbname     "test"
              :host       "localhost"
              :user       "postgres"
              :password   "postgres"
              :ssl        false
              :sslfactory "org.postgresql.ssl.NonValidatingFactory"})

;; :conditional? true means "IF NOT EXISTS"
(def create-table
  (jdbc/create-table-ddl :fruit
                         [[:name "varchar(32)"]
                          [:appearance "varchar(32)"]
                          [:cost :int]
                          [:grade :real]]
                         {:conditional? true}))

(def drop-table
  (jdbc/drop-table-ddl :fruit))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (prn "create table")
  (jdbc/db-do-commands db-spec [create-table
                                "CREATE INDEX id ON fruit ( name );"])

  (prn "insert")
  (jdbc/insert! db-spec :fruit {:cost 42 :name "123"})

  (prn "query 1")
  (prn
    (jdbc/query db-spec "select * from fruit"))

  (prn "update")
  (prn
    (jdbc/update! db-spec :fruit {:grade 110} ["cost = ?" 42]))

  (prn "query 2")
  (prn
    (jdbc/query db-spec "select * from fruit"))

  (prn "delete")
  (prn
    (jdbc/delete! db-spec :fruit ["cost = ?" 42]))

  (prn "drop")
  (jdbc/db-do-commands db-spec
                       ["DROP INDEX id;"
                        drop-table]))
