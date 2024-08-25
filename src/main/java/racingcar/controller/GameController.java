package racingcar.controller;

import racingcar.domain.Race;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {

    private final InputView inputView;
    private final OutputView outputView;

    public GameController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        String[] carNames = inputView.inputCarNames();
        String tryCount = inputView.inputTryCount();

        Race race = new Race(carNames, tryCount);

        outputView.printResultMessage();
        race.start();

        outputView.printWinners(race.getWinners());
    }
}