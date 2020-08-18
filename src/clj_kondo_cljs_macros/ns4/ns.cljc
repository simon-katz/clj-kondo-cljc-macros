(ns clj-kondo-cljs-macros.ns4.ns
  #?(:cljs
     (:require-macros
      [my-ns :refer [foo]])))

(foo true 1)
