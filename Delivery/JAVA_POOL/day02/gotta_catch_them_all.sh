#!/bin/bash
 cut -f 5 -d ':' | cut -f 2 -d ' ' | grep -i ^$1 |wc -l
