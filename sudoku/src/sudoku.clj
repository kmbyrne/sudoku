(ns sudoku)

(def board [[5, 0, 8, 0, 7, 3, 1, 9, 0],
            [9, 0, 0, 6, 0, 0, 4, 0, 8],
            [0, 0, 0, 9, 0, 8, 0, 3, 5],
            [0, 7, 0, 0, 0, 0, 0, 6, 0],
            [0, 0, 2, 0, 0, 0, 9, 0, 0],
            [0, 1, 0, 0, 0, 0, 0, 8, 0],
            [1, 9, 0, 3, 0, 6, 0, 0, 0],
            [2, 0, 3, 0, 0, 7, 0, 0, 9],
            [0, 8, 7, 1, 9, 0, 3, 0, 4]])


(defn find-row-with-most-answers [board]
  (loop [row 0]
    (if (< row 9)
      (println board)
      (recur (+ row 1)))
    )
  )


(defn solve-sudoku-board [board]
  (find-row-with-most-answers board)
  )


(solve-sudoku-board board)