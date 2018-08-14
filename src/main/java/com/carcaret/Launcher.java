package com.carcaret;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class Launcher {

    public static void main(String[] args) throws Exception {
        Swarm swarm = new Swarm();

        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addClass(HelloController.class);
        deployment.addClass(MyApplication.class);
        deployment.addClass(HelloService.class);
        deployment.addAllDependencies();
        swarm.start().deploy(deployment);
    }
}
