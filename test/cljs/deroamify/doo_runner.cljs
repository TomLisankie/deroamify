(ns deroamify.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [deroamify.core-test]))

(doo-tests 'deroamify.core-test)
