(ns user
  (:require [clojure.tools.namespace.repl :refer [refresh set-refresh-dirs]]
            [clojure.test :refer [run-tests]]
            [clojure.repl :refer :all]
            [clojure.pprint :as pp]
            [clj-async-profiler.core :as prof]
            [karasawa.etcd :as etcd]))

(set-refresh-dirs "env/dev" "src/karasawa" "resources")

(defn run-test
  [test-var]
  (require :reload test-var)
  (run-tests test-var))

(def client (etcd/kv-client "etcd"))
