#!/bin/sh

curl -X POST -d @quotetopost.json --header "Content-Type:application/json" http://localhost:8089/quotes

