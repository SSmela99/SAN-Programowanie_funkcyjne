; Zadanie 5. proszę zrealizować procecurę unique-seq, która ma następujące działanie:
;; (unique-seq [1 2 3 4 1 1 2 2 7 7 3 2 1]) => (1 2 3 4 7)
;; Innymi słowy, procedura ta utrzymuje kolejność elementów w oryginalnej sekwencji,
;; ale eliminuje duplikaty.
;; Hint: wykorzystać hash-set.

(defn unique-seq
  [x]
  (first(hash-set(distinct x))))

(unique-seq [1 2 3 4 1 1 7 7])
