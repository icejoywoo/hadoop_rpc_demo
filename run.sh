#!/bin/bash


action=${1}

case ${action} in
    client)
        mvn exec:java -Dexec.mainClass="rpc.demo.Client"
        ;;
    server)
        mvn exec:java -Dexec.mainClass="rpc.demo.Server"
        ;;
    *)
        echo "help"
        echo "    ${0} (client|server)"
        ;;
esac
