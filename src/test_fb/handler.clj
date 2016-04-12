(ns test-fb.handler
  (:require [ring.middleware.defaults :refer (wrap-defaults site-defaults secure-site-defaults)]
            [ring.util.response :refer (not-found response)]
            [taoensso.timbre :as log]
            [clojure.string :refer (trim blank?)]
            [clojure.java.io :as io]
            ))

(defn app [request]
  (response "hello world"))
