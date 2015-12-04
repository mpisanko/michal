(ns {{name}}.core-test
  (:require [clojure.test :refer :all]
            [{{name}}.core :refer :all]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]
            [schema.test]))

(use-fixtures :once schema.test/validate-schemas)

(defspec spanish 100
  (prop/for-all [n gen/int]
                (is (or (= :hola (say-hello)) (= :que-tal (say-hello))))))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))
