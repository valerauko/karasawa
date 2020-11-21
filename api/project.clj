(defproject karasawa "0.0.1"
  :description "Experimental blog engine"
  :url "http://example.com/FIXME"
  :license {:name "AGPL-3.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.gnu.org/licenses/agpl-3.0.txt"}
  :dependencies [[org.clojure/clojure "1.10.2-alpha2"]
                 [io.etcd/jetcd-core "0.5.4"]]
  :main ^:skip-aot karasawa.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             :dev {:dependencies [[org.clojure/test.check "0.10.0"]
                                  [org.clojure/tools.namespace "0.3.1"]
                                  [com.clojure-goes-fast/clj-async-profiler "0.4.1"]]
                   :source-paths ["env/dev"]}})
