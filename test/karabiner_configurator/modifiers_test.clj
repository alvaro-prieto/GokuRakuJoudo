(ns karabiner-configurator.modifiers-test
  (:require [karabiner-configurator.modifiers :as sut]
            [karabiner-configurator.data :refer :all]
            [clojure.test :refer :all]))

(def example-modifers {:modifiers {:111 [:left_command :left_control]
                                   :222 {:mandatory [:left_command :left_shift]}
                                   :3 {:mandatory :left_command}
                                   :444 {:optional :any}}})

(def result {:applications {},
             :tos {},
             :swaps {},
             :input-source {},
             :modifiers {:111 {:mandatory ["left_command" "left_control"]},
                         :222 {:mandatory ["left_command" "left_shift"]},
                         :3 {:mandatory ["left_command"]},
                         :444 {:optional ["any"]}},
             :devices {},
             :layers {},
             :froms {},
             :raws {},
             :simlayers {}})

(deftest convert-modifiers
  (init-conf-data)
  (testing "FIXME, convert-modifiers fail."
    (is (= (sut/generate (:modifiers example-modifers)) result))))