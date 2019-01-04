#!/bin/bash

#tr "[A-Z]" "($)

#sed "s/\b[A-Z]/(&)/g"




sed "s/\(\b[A-Z]\)/\(\1\)/g"
