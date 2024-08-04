#!/bin/bash

siege -c10 -v -t60s -T 'application/json' 'http://127.0.0.1:8080/api/tasks POST < task-payload.json'