package nickleby.algorithms.lectures.one.finished.domain;

import nickleby.algorithms.lectures.one.finished.interfaces.LandBased;
import nickleby.algorithms.lectures.one.finished.interfaces.WaterBased;

public class Ocean extends EnvironmentArea<Ocean, WaterBased> {

    public Ocean(WaterBased... animals) { super(Ocean.class, animals); }
}