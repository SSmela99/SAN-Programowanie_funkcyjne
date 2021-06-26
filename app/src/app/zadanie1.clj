;; Zadanie 1. Proszę uzależnić ilość kroków wykonywanych przez procedurę heron-sqrt
;;            od pewnego parametru tej procedury określającego dokładność
;;            (zamiast stałej 0.00000001).

(ns fp2.heron)

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn square
  [x]
  (* x x))

(defn good-enough?
  [G x y]
  (<= (abs (- x (square G))) y))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn improve
  [G x]
  (avg G (/ x G)))

(defn heron-sqrt
  [G x y]
  (println "G is" G)
  (if (good-enough? G x y)
    G

    (heron-sqrt (improve G x) x y)))

(heron-sqrt 2 3 0.0000000001)