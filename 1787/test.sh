#!/bin/bash
while IFS='' read -r line || [[ -n "$line" ]]; do
    params=($line)
    actual=$(echo "${params[0]} ${params[1]}" | ./main)
    expected=${params[2]}
    if [ "${actual}" != "${expected}" ]; then
        echo "Input ${params[0]} ${params[1]} incorrect result: ${actual}"
    else
        echo "Input ${params[0]} ${params[1]} correct"
    fi
done < tests.txt