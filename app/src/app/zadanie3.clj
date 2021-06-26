;; Zadanie 3. Proszę zrealizować procedurę liczącą pierwiastek sześcienny podanej liczby x.
;;            Hint: SICP Exercise 1.8

(ns fp2.heron)

(defn cube
  [x]
  (* x x x))

(defn square
  [x]
  (* x x))

(defn improve
  [guess x]
  (/ (+ (/ x (square guess))
         (* 2 guess))
      3))

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough?
  [guess x]
  (< (abs (- (cube guess) x)) 0.001))

(defn cube-iter
  [guess x]
   (if (good-enough? guess x)
      guess
      (cube-iter (improve guess x)
         x)))

(defn cube-root
  [x]
   (cube-iter 1.0 x))

(cube-root 8)