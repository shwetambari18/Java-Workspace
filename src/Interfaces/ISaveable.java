package Interfaces;

import java.awt.List;
import java.util.ArrayList;

public interface ISaveable {
    void storeValues(List myList);
    List retrieveValues();
}
