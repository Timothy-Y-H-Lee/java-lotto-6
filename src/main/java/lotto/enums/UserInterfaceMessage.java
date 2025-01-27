package lotto.enums;

public enum UserInterfaceMessage {
	REQUEST_INPUT_PRICE("구입금액을 입력해 주세요."),
	REQUEST_INPUT_PRICE_INFO("로또 당첨 번호는 %d ~ %d까지 6개를 입력받습니다. 번호는 쉼표로 구분해주세요."),
	COUNT_BOUGHT("%d개를 구매했습니다."),
	REQUEST_INPUT_WINNING_NUMBER("당첨 번호를 입력해 주세요."),
	REQUEST_INPUT_BONUS_NUMBER("보너스 번호를 입력해 주세요."),
	REQUEST_INPUT_BONUS_NUMBER_INFO("보너스 번호는 1개를 입력받습니다."),
	PRIZE_STATS("당첨 통계"),
	MATCH_COUNT("%d개 일치"),
	EA("개"),
	REWARDS_THREE_MATCH(" (5,000원)"),
	REWARDS_FORE_MATCH(" (50,000원)"),
	REWARDS_FIVE_MATCH(" (1,500,000원)"),
	REWARDS_FIVE_BONUS_MATCH(", 보너스 볼 일치 (30,000,000원)"),
	REWARDS_SIX_MATCH(" (2,000,000,000원)"),
	TOTAL_EARNINGS_RATE("총 수익률은 %,.1f%%입니다."),
	ERROR_PREFIX("[ERROR] "),
	ERROR_INPUT_BUY_INFO(ERROR_PREFIX.getValue() + "로또 구입 금액을 1,000원 단위로 입력해주세요."),
	ERROR_NUMBER_INCLUSIVE(ERROR_PREFIX.getValue() + "로또 번호는 %d부터 %d 사이의 숫자여야 합니다."),
	ERROR_INPUT_BONUS_NUMBER_DUPLICATED(ERROR_PREFIX.getValue() + "보너스 번호는 입력하신 당첨번호와 중복될 수 없습니다."),
	ERROR_INPUT_BONUS_NUMBER_INCLUSIVE(ERROR_PREFIX.getValue() + "보너스 번호는 %d부터 %d 사이의 숫자여야 합니다.");

	private String value;
	UserInterfaceMessage(String value) {
		this.value = value;
	}

	public String getKey() {
		return name();
	}

	public String getValue() {
		return value;
	}
}
