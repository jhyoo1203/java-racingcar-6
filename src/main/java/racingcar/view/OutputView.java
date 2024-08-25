package racingcar.view;

import racingcar.domain.Car;
import racingcar.global.constant.OutputConstant;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    public void printResultMessage() {
        System.out.print(OutputConstant.PRINT_RESULT_MESSAGE.getValue());
    }

    public void printCarPositions(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinners(List<Car> winners) {
        String winnerNames = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println(OutputConstant.PRINT_WINNER_MESSAGE.getValue() + winnerNames);
    }
}