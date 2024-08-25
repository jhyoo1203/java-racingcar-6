package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private final String name;
    private int position;
    private static final int MOVE_THRESHOLD = 4;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void moveForward() {
        int randomValue = Randoms.pickNumberInRange(0, 9);
        if (randomValue >= MOVE_THRESHOLD) {
            this.position++;
        }
    }
}