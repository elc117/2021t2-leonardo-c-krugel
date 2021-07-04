;;                Exemplos de codigo em Clojure para o T2.

;; Demonstracoes basicas de sintaxe:
(def n1 42) ; Define uma variavel 'n1' com valor '42'

(def n2 7)  ; Define uma variavel 'n2' com valor '7'

(even? n1)  ; Retorna true se 'n1' for par

(= n1 n2)   ; Retorna true se 'n1' for igual a 'n2'

(sum 2 3)   ; Chama a funcao 'sum' com os argumentos '2' e '3'

; Funcao simples que soma dois valores
(defn sum [arg1]
          [arg2]
    (+ arg1 arg2))

; Tipos de dados:
(def v-long 42)          ; Inteiro em clojure e tratado como Long

(def v-double 3.7)       ; Float em clojure e tratado como double

(def v-boolen true)      ; Bool = true/false

(def v-string "clojure") ; String

(list "clojure" 3 true)  ; Listas podem conter diferentes tipos de dados

(set 2 2 3)              ; Lista com valores unicos, neste caso {2 3}



;; Exemplo de codigo 1:
(defn greetings [name]
    (println "Hello" name))

;; Exemplo de codigo 2:
(defn factorial [n]
    (loop [current n
           next (dec current)
           total 1]
    (if (> current 1)
        (recur next (dec next) (* total current))
        total)))



;; Exemplo List Comprehension 1 (list comprehension):
(defn sumOdds-lc [values]
    (apply reduce + [(for [x values
        :when (odd? x)]
        x)]))

;; Exemplo List Comprehension 1 (high-order):
(defn sumOdds-ho [values]
    (apply reduce + [(filter odd? values)]))

;; Exemplo List Comprehension 2 :
(defn combNumber []
    (for [n1 (range 10)
          n2 (range 10)
          :when (or (= 0 n1)
                    (even? n2))]
        [n1 n2]))