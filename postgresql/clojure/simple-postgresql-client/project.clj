(defproject simple-postgresql-client "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [org.postgresql/postgresql "42.2.5.jre7"]]
  :main ^:skip-aot simple-postgresql-client.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
