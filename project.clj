(defproject res-svc "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.taoensso/timbre "4.1.4"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-defaults "0.2.0"]
                 ]
  :target-path "target/%s"
  :ring {:handler test-fb.handler/app
         :uberwar-name "test-fb.war"
         }
  :profiles {:dev {:plugins [[lein-ring "0.9.7"]
                             [lein-midje "3.2"]]}
             }
  )
