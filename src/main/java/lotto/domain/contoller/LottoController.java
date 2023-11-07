package lotto.domain.contoller;

import java.util.List;
import lotto.domain.repository.Lotto;
import lotto.domain.view.InputView;
import lotto.domain.view.OutputView;
import lotto.service.LottoPublishService;

public class LottoController {
    private InputView inputView;
    private OutputView outputView;
    LottoPublishService lottoPublishService = LottoPublishService.getInstance();

    public LottoController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void startGame() {
        this.buyLotto();
        this.lottoPublish();
    }

    private void buyLotto() {
        this.requestInputPrice();
    }

    private void requestInputPrice() {
        try {
            lottoPublishService.lottoPublish(inputView.requestInputPrice());
        } catch (IllegalArgumentException e) {
            inputView.printMessage(e.getMessage());
            this.requestInputPrice();
        }
    }

    private void lottoPublish() {
        List<Lotto> lottos = lottoPublishService.getPublishedLottoNumbers();
        outputView.printPublishCount(lottos.size());
    }
}