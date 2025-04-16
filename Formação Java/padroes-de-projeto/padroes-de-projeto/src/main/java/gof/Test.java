package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.*;

public class Test {
    public static void main(String[] args) {
//        SingletonLazy lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//
//        SingletonEager eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);
//        lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(normal);
        robo.mover();
        robo.mover();

        System.out.println("-------------");

        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();

        System.out.println("-------------");

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();

        System.out.println("-------------");

        Facade facade = new Facade();
        facade.migrarCliente("Rick", "39404046");
    }
}
