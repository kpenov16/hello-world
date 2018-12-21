(ns hello-world.core-test
  (:require [expectations :refer :all]
            [hello-world.core :refer :all]))
;; givenEmptyString_returnZero
(expect 0 (sum-the-string "") )

;; givenSingleStringDigit_returnDigitAsANumber
(expect 3 (sum-the-string "3") )

;; givenTwoNumbersSeparatedByComma_returnNumbersSum
(expect 5 (sum-the-string "3,2") )

;; givenAnyAmountOfNumbersSeparatedByComma_returnNumbersSum
(expect 9 (sum-the-string "3,2,3,1") )