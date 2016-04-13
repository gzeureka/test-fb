(ns test-fb.handler
  (:require [ring.middleware.defaults :refer (wrap-defaults site-defaults secure-site-defaults)]
            [ring.util.response :refer (not-found response content-type)]
            [taoensso.timbre :as log]
            [clojure.string :refer (trim blank?)]
            [clojure.java.io :as io]
            ))

(defn handler [request]
  (->
    (response "hello world")
    (content-type "text/plain")
    ))

(def app
  (-> handler
      (wrap-defaults site-defaults)))


; TODO authentication
#_(def site
  (if-let [location (get-public-files-location)]
    (do
      (log/info "Serves files from" location)
      (-> handler
          (wrap-defaults
            (assoc site-defaults :static {:files (io/as-file (io/as-url location))}))))
    (do
      (log/error public-files-location-str "not specified")
      (System/exit 1))
    ))

