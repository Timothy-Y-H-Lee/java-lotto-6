package lotto.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import java.util.List;
import lotto.enums.LottoRule;
import lotto.enums.UserInterfaceMessage;
import org.junit.jupiter.api.Test;

class LottoBonusServiceTest {
    @Test
    void 보너스_번호_형식_테스트() {
        String bonus = "1a";
        List<Integer> drawNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThatThrownBy(() -> LottoBonusService.getInstance().setLottoBonusNumber(bonus, drawNumbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(String.format(UserInterfaceMessage.ERROR_INPUT_BONUS_NUMBER_INCLUSIVE.getValue(),
                        LottoRule.START.getValue(), LottoRule.END.getValue()));
    }

    @Test
    void 보너스_번호_입력_테스트() {
        String bonus = "7";
        List<Integer> drawNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        LottoBonusService lottoBonusService = LottoBonusService.getInstance();
        lottoBonusService.setLottoBonusNumber(bonus, drawNumbers);
        assertThat(lottoBonusService.getLottoBonusNumber()).isEqualTo(Integer.parseInt(bonus));
    }
}