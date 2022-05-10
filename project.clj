(defproject varity "0.8.1-SNAPSHOT"
  :description "Variant translation library for Clojure"
  :url "https://github.com/chrovis/varity"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :min-lein-version "2.7.0"
  :dependencies [[org.clojure/clojure "1.10.3" :scope "provided"]
                 [org.clojure/tools.logging "1.2.4"]
                 [clj-hgvs "0.4.5"]
                 [cljam "0.8.3"]
                 [org.apache.commons/commons-compress "1.21"]
                 [proton "0.2.2"]]
  :plugins [[lein-cloverage "1.2.1"]
            [lein-codox "0.10.7"]
            [net.totakke/lein-libra "0.1.2"]]
  :test-selectors {:default (complement :slow)
                   :slow :slow
                   :all (constantly true)}
  :profiles {:dev {:dependencies [[cavia "0.5.1"]
                                  [codox-theme-rdash "0.1.2"]
                                  [criterium "0.4.6"]
                                  [net.totakke/libra "0.1.1"]]}
             :repl {:source-paths ["bench"]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]
                                  [clojure-future-spec "1.9.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.10 {:dependencies [[org.clojure/clojure "1.10.3"]]}}
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
