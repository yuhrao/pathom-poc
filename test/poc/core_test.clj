(ns poc.core-test
  (:require
   [clojure.test :refer [deftest testing is]]))

(deftest a-test
  (testing "i pass"
    (is (= 1 1))))
