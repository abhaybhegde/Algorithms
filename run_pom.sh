#!/bin/bash
#Travis-CI script to make it easier to run all the unit-test 

PROJECT_ROOT=`pwd`
echo "Currently in $PROJECT_ROOT.."
cd $PROJECT_ROOT/Algorithms
mvn clean install
