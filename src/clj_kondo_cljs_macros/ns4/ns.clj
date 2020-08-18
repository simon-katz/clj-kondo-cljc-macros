(ns clj-kondo-cljs-macros.ns4.ns
  (:require [clojure.core]
            [clojure.string]
            [clojure.walk]))

(defmacro foo [x y]
  `(when ~x ~y))
