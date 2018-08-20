package com.carcaret;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

import java.util.Collections;

public class Launcher {

    public static void main(String[] args) throws Exception {
        Swarm swarm = new Swarm();

        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addPackages(true, Launcher.class.getPackage());
        deployment.addAllDependencies();
        swarm.start().deploy(deployment);
    }
}
