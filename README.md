Thermostat Socket Client for Byteman
====================================

Build (from top-level dir):

    mvn clean install

To start Byteman server run from `agent` module dir and leave it running:

    mvn exec:exec

Run client example from `client` module dir:

    mvn exec:exec

It will delete rule `01` on server and will install rule `02`.
