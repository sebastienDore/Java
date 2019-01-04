#!/bin/bash
# cut -f -5 -d ':' | cut -f -1 -d ' ' | grep "theo1" | tr "theo1" "Wile E.Coyote"
sed -n -e  "s/theo1/While E. Coyote/p" -e "s/steven1/Daffy Duck/p" -e "s/arnaud1/Porky Pig/p" -e "s/pierre-jean/Marvin the Martian/p"
