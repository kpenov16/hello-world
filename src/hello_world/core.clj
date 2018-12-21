(ns hello-world.core)

(defn sum-the-string [string]
      (if (empty? string) 0 (apply + (map read-string (clojure.string/split string #","))))

  )




