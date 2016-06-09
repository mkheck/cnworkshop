#!/bin/sh

curl -X POST -d @quotetopost.json --header "Content-Type:application/json" https://quote-service-workshop.cfapps.io/quotes

