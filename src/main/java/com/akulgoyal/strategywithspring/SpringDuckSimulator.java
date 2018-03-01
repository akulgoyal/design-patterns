package com.akulgoyal.strategywithspring;

import com.akulgoyal.strategywithspring.behaviours.FlyBehaviour;
import com.akulgoyal.strategywithspring.behaviours.QuackBehaviour;
import com.akulgoyal.strategywithspring.clients.Duck;
import com.akulgoyal.strategywithspring.clients.MallardDuck;
import com.akulgoyal.strategywithspring.clients.RubberDuck;
import com.akulgoyal.strategywithspring.clients.WoodenDuck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

import static com.akulgoyal.strategywithspring.enums.FlyBehaviours.*;
import static com.akulgoyal.strategywithspring.enums.QuackBehavious.*;

@Component
public class SpringDuckSimulator {

    @Autowired
    private MallardDuck mallardDuck;

    @Autowired
    private RubberDuck rubberDuck;

    @Autowired
    private WoodenDuck woodenDuck;

    @Autowired
    private Map<String, FlyBehaviour> flyBehaviours;

    @Autowired
    private Map<String, QuackBehaviour> quackBehaviours;

    private static final String FLY_ = "FLY_";

    private static final String QUACK_ = "QUACK_";

    @PostConstruct
    public void init() {
        mallardDuck.setFlyBehaviour(flyBehaviours.get(FLY_ + WITH_WINGS));
        mallardDuck.setQuackBehaviour(quackBehaviours.get(QUACK_ + QUACK));

        rubberDuck.setFlyBehaviour(flyBehaviours.get(FLY_ + NO_WAY));
        rubberDuck.setQuackBehaviour(quackBehaviours.get(QUACK_ + SQUEAK));

        woodenDuck.setFlyBehaviour(flyBehaviours.get(FLY_ + NO_WAY));
        woodenDuck.setQuackBehaviour(quackBehaviours.get(QUACK_ + MUTE));
    }

    public void testDucks() {

        demoDuck(mallardDuck);

        demoDuck(rubberDuck);

        demoDuck(woodenDuck);
    }

    private void demoDuck(Duck duck) {
        System.out.println();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
}
