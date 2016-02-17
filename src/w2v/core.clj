(ns w2v.core
  (:gen-class)
  )

(def cfg {:table-size 100000000

          })

(defn -main [& args]
  ;; TrainModel
  ;; - LearnVocabFromTrainFile
  ;; - - AddWordToVocab
  ;; - - - GetWordHash
  ;; - - while ReadWord
  ;; - - SearchVocab
  ;; - - ReduceVocab
  ;; - - - GetWordHash
  ;; - - SortVocab
  ;; - - - GetWordHash
  ;; - SaveVocab
  ;; - InitNet
  ;; - - CreateBinaryNet
  ;; - InitUnigramTable
  ;; - spawn and join TrainModelThread
  ;; - - while loops cbow
  ;; - - ReadWordIndex
  ;; - # save vecs  
  )
