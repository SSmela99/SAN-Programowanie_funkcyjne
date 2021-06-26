;; Zadanie 2. Proszę uzależnić ilość kroków wykonywanych przez procedurę heron-sqrt
;;            od pewnego parametru (n - liczby całkowitej) oznaczającego tę ilość.

(ns fp2.heron)

(def counter (atom 1))

(defn next-value []
  (swap! counter inc))

(defn good-enough?
  [y]
  (>= @counter y))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn improve
  [G x]
  (avg G (/ x G)))

(defn heron-sqrt
  [G x y]
  (println "G is" G)
  (if (good-enough? y)
    (do (reset! counter 1) G)
    (do (next-value) (heron-sqrt (improve G x) x y))))

(heron-sqrt 2 3 3)