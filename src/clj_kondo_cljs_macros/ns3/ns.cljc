(ns clj-kondo-cljs-macros.ns3.ns
  #?(:cljs
     (:require-macros
      [my-ns :refer [foo]])))
(foo true 1)
