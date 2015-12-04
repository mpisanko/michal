(ns leiningen.new.michal
  (:require [leiningen.new.templates :refer [renderer year name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "michal"))

(defn michal
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh project with test.check and schema.")
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             ["LICENSE" (render "LICENSE" data)]
             [".gitignore" (render "gitignore" data)]
             ["test/{{sanitized}}/core_test.clj" (render "test.clj" data)])))
