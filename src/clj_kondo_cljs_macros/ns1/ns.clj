(ns clj-kondo-cljs-macros.ns1.ns)



(defmacro foo [x y]
  `(when ~x ~y))
