(ns hello-world.core-test
  (:require [expectations :refer :all]
            [hello-world.core :refer :all]))
;; givenEmptyString_returnZero
(expect 0 (sum-the-string "") )
