(ns karasawa.etcd
  (:import [io.etcd.jetcd
            ByteSequence
            Client]))

(defn kv-client
  [host]
  (-> (Client/builder)
      (.endpoints (into-array String [(str "http://" host ":2379")]))
      (.build)
      (.getKVClient)))

(defn ->bs
  [str]
  (ByteSequence/from (.getBytes str)))
