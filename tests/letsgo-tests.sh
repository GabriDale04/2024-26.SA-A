#!/bin/sh

echo "letsgooooooooo TESTS $(date)"

node --version
npm --version

npm install --save-dev jest

npm install --save-dev supertest

npm run test
