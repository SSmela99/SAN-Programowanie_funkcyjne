;; Zadanie 4.
;; Napisz procedurę find-index, która działa w sposób następujący
;; (find-index (list "a" "b" "c") "c") => 2
;; (find-index (list "a" "b" "c") "b") => 1
;; (find-index (list "a" "b" "c") "a") => 0

(defn isminusone

  [x]
  (= x -1))

(defn find-index
  [x y]
  (if (isminusone (.indexOf x y))
    nil
    (.indexOf x y)))

(find-index (list "a" "b" "c") "c")
(find-index (list "a" "b" "c") "b")
(find-index (list "a" "b" "c") "a")