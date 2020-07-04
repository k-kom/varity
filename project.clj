(defproject varity "0.6.1"
  :description "Variant translation library for Clojure"
  :url "https://github.com/chrovis/varity"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :min-lein-version "2.7.0"
  :dependencies [[org.clojure/clojure "1.10.1" :scope "provided"]
                 [org.clojure/tools.logging "0.5.0"]
                 [clj-hgvs "0.4.3"]
                 [cljam "0.8.0"]
                 [org.apache.commons/commons-compress "1.19"]
                 [proton "0.1.8"]]
  :plugins [[lein-cloverage "1.1.2"]
            [lein-codox "0.10.7"]
            [net.totakke/lein-libra "0.1.2"]]
  :test-selectors {:default (complement :slow)
                   :slow :slow
                   :all (constantly true)}
  :profiles {:dev {:dependencies [[cavia "0.5.1"]
                                  [codox-theme-rdash "0.1.2"]
                                  [criterium "0.4.5"]
                                  [net.totakke/libra "0.1.1"]]}
             :repl {:source-paths ["bench"]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]
                                  [clojure-future-spec "1.9.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}}
  :deploy-repositories [["snapshots" {:url "https://clojars.org/repo/"
                                      :username [:env/clojars_username :gpg]
                                      :password [:env/clojars_password :gpg]}]]
  :libra {:bench-selectors {:default (complement :slow)
                            :slow :slow
                            :all (constantly true)}}
  :codox {:project {:name "varity"}
          :themes [:rdash]
          :namespaces [#"^varity\.[\w\-]+$"]
          :output-path "docs"
          :source-uri "https://github.com/chrovis/varity/blob/{version}/{filepath}#L{line}"})
