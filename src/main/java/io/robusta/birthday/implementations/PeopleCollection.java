package io.robusta.birthday.implementations;

import io.robusta.birthday.interfaces.IPeople;
import io.robusta.birthday.interfaces.IPeopleCollection;

import java.util.ArrayList;

/**
 * Created by Nicolas Zozol on 04/10/2016.
 */
public class PeopleCollection extends ArrayList<IPeople> implements IPeopleCollection<IPeople> {

    public PeopleCollection() {

    }

    public PeopleCollection(int size) {
        super(size);
        for(int i=0 ; i < size ; i++){
            // TODO : add new People with random Birthday
        }
    }

    @Override
    public boolean hasSame() {
        // TODO implements correctly
        return false;
    }

}
