package racingcar.view;

import racingcar.global.constant.InputConstant;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public String[] inputCarNames() {
        System.out.print(InputConstant.INPUT_CARS.getValue());
        return readLine().split(",");
    }

    public int inputTryCount() {
        System.out.print(InputConstant.INPUT_TRY.getValue());
        return Integer.parseInt(readLine());
    }
}