package es.acamargo.cryptoproxy.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BotInfo {

	private long timestamp;

	private double btcPrice;

	private double btcBalance;

	private double eurBalance;

	private String orderType;

	private String orderStatus;

	private String orderPrice;

	private String orderId;

	private boolean isSeetled;

}
