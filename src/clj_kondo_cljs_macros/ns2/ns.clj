(ns clj-kondo-cljs-macros.ns2.ns)




(defmacro foo [x y]
  `(when ~x ~y))
