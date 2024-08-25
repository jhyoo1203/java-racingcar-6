package racingcar.domain;

import racingcar.validation.CarNameValidator;
import racingcar.validation.UserInputValidator;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Race {

    private final List<Car> cars;
    private final int tryCount;
    private final OutputView outputView;

    public Race(String[] carNames, String tryCountInput) {
        CarNameValidator carNameValidator = new CarNameValidator();
        UserInputValidator userInputValidator = new UserInputValidator();

        userInputValidator.validateNotEmptyInput(tryCountInput);
        userInputValidator.validateIsNumber(tryCountInput);

        int tryCount = Integer.parseInt(tryCountInput);
        userInputValidator.validateNotNegativeNumber(tryCount);

        carNameValidator.validateNoDuplicateNames(List.of(carNames));

        cars = new ArrayList<>();

        for (String name : carNames) {
            carNameValidator.validateEnglishName(name);
            carNameValidator.validateNoWhitespace(name);
            cars.add(new Car(name));
        }

        this.tryCount = tryCount;
        this.outputView = new OutputView();
    }

    public void start() {
        for (int i = 0; i < tryCount; i++) {
            moveCars();
            outputView.printCarPositions(cars);
        }
    }

    private void moveCars() {
        cars.forEach(Car::moveForward);
    }

    public List<Car> getWinners() {
        int maxPosition = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }
}