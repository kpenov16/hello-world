(ns hello-world.core)

(defn- string->numbers [string]
  (map read-string (clojure.string/split string #",")))

(defn sum-the-string [string]
      (if (empty? string) 0 (reduce + (string->numbers string)))

  )




