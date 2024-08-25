package racingcar.global;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class CarInit {

    public String[] inputCars() {
        return readLine().split(",");
    }

    public int inputTry() {
        return Integer.parseInt(readLine());
    }
}
