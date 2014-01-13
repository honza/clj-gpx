(defproject gpx "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-time "0.6.0"]
                 [org.clojure/algo.generic "0.1.1"]]
  :main ^:skip-aot gpx.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
