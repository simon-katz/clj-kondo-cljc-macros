(ns clj-kondo-cljs-macros.ns1.ns
  #?(:cljs
     (:require-macros
      [my-ns :refer [foo]])))

(foo true 1)
