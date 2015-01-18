(ns gpx.core-test
  (:use clojure.test gpx.core clojure.algo.generic.math-functions))

(deftest utility-functions
  (testing "value of R"
    (is (= R 6367)))

  (testing "radian conversion"
    (is (= Math/PI (rad 180))))

  (testing "haversine distance"
    (let [start {:lat 10, :lon 10}
          end {:lat 20, :lon 20}]
         (is (= 1543.7876928387263
                (haversine start end))))))
