(ns {{name}}.core
  (:require [schema.core :as s]))

(s/defn say-hello :- s/Keyword
  []
  (last (shuffle [:hello :hi :hola :que-tal :howdy :czesc])))
