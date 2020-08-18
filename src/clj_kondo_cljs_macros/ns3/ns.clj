(ns clj-kondo-cljs-macros.ns3.ns)



(defmacro foo [x y]
  `(when ~x ~y))
